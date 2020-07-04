package ClassesAndObjects;

public class AccountHolder {
	
	String FirstName;
	String LastName;
	int age;
	float AccountBalance;
	boolean EligibleForCC;
	
	public void TestEligibilityForCreditCard() {
		
		if(age>25 && AccountBalance>=20000) {
			EligibleForCC=true;
			
		}
	}

}
