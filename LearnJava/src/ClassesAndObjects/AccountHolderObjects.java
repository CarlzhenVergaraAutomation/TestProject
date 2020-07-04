package ClassesAndObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.FirstName = "Tom";
		tom.LastName = "Smith";
		tom.age = 21;
		tom.AccountBalance = 10000;
		tom.TestEligibilityForCreditCard();
		System.out.println("Is this eligible for CC? : " + tom.EligibleForCC);
		
		henry.FirstName = "Henry";
		henry.LastName = "Hill";
		henry.age = 31;
		henry.AccountBalance = 20000;
		henry.TestEligibilityForCreditCard();
		System.out.println("Is this eligible for CC? : " + henry.EligibleForCC);
		
		sarah.FirstName = "Sarah";
		sarah.LastName = "Miller";
		sarah.age = 41;
		sarah.AccountBalance = 30000;
		sarah.TestEligibilityForCreditCard();
		System.out.println("Is this eligible for CC? : " + sarah.EligibleForCC);
			
		
	}

}
