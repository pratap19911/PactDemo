package net.briandupreez.client;
public class UserPreferences {
    private String AccountHoldername;
    private String CardNumber;
	public String getAccountHoldername() {
		return AccountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		AccountHoldername = accountHoldername;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
}