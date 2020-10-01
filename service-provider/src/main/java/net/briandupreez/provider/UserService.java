package net.briandupreez.provider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserService {

    @GetMapping("/User/{CardNumber}")
   
    public ResponseEntity<User> retrieveUser(@PathVariable("CardNumber") String CardNumber ) {


        final User user = new User();
        System.out.print("hi else part"+CardNumber);
        if (CardNumber.equals("3")) {
        	
            user.setAccountHolderName("Ram");
            user.setCardNumber("3");
            System.out.print("inside hi"+user);
          
        } else {
        	
        	
            user.setAccountHolderName("Sonali");
            user.setCardNumber("1");
            System.out.print("hi else part"+user);
        }
        
       
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
