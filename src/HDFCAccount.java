import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    private String password;   // random /unique --> UUID
    private double balance;
    private String accountNo;
    final double rateOfInterest = 6.1;

    // default/no argument constructor
    public HDFCAccount() {
    }
   // all parameter constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }


    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current balance is: "+ this.balance;
        }
        else
            return "Please enter valid password!";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(amount <= this.balance){
                this.balance -= amount;
                return "Money has been withdrawn successfully :" +this.balance;
            }
            else
                return "Sorry! Your Balance is low";
        }
        else return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password =  newPassword;
            return "Congrats! Your password changed.";
        }
        else
            return "Please enter valid password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance * rateOfInterest * years)/100;
    }
}
