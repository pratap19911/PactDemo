package net.briandupreez.client;

import net.briandupreez.provider.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class UserPreferenceService {


    @GetMapping("/user/preference")
    public UserPreferences retrieveUserPreference() {
        final UserPreferences userPreferences = new UserPreferences();

        RestTemplate restTemplate = new RestTemplate();
        final User user = restTemplate.getForObject("http://localhost:8080/user/3", User.class);
        userPreferences.setAccountHoldername(user.getAccountHolderName());
        userPreferences.setCardNumber("1");
       return userPreferences;
    }
}
