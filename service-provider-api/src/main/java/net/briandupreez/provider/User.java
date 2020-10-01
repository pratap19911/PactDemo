package net.briandupreez.provider;
public class User {
    private String AccountHolderName;
    private String CardNumber;
  
    
    
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String AccountHolderName) {
		AccountHolderName = this.AccountHolderName;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String CardNumber) {
		CardNumber = this.CardNumber;
	}
	@Override
	public String toString() {
		return "User [AccountHolderName=" + AccountHolderName + ", CardNumber=" + CardNumber + "]";
	}
	
	
}