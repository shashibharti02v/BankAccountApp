public class Main {
    public static void main(String[] args) {
        // first account
//        HDFCAccount hdfcAccount1 = new HDFCAccount("Shashi", "1234", 2000);
//        System.out.println("Congrats "+hdfcAccount1.getName() + "your account has been created with accountNumber "+
//                hdfcAccount1.getAccountNo());
//
//        // Fetch Balance
//        System.out.println(hdfcAccount1.fetchBalance("1234"));
//
//        // Add amount in the account
//        System.out.println("Your current money is: "+hdfcAccount1.addMoney(3000));
//
//        // Change Password
//        System.out.println(hdfcAccount1.changePassword("1234", "12345"));
//
//        // Withdraw Money
//        System.out.println(hdfcAccount1.withdrawMoney("12345", 1000));
//
//        // second account
//        HDFCAccount hdfcAccount2 = new HDFCAccount("Priya", "12345", 30000);
//        System.out.println("Congrats "+hdfcAccount2.getName() + "your account has been created with accountNumber "
//        +hdfcAccount2.getAccountNo());

//        // Third Account with default constructor
//        HDFCAccount hdfcAccount3 = new HDFCAccount();


        // SBI Bank Account

        SBIBankAccount sbiBankAccount1 = new SBIBankAccount("Shashi", "12345", 761865156, "shashi123", 2000);
        System.out.println("Congrats! Your account has been created successfully " + sbiBankAccount1.getName() +" with phone number "+
                sbiBankAccount1.getpNumber()+" and email "+sbiBankAccount1.geteMail());

    }
}