import java.util.UUID;

public class SBIBankAccount implements BankAccountInterface{

    private String name;
    private String password;
    private long pNumber;
    private String eMail;
    private double balance;
    private String accountNumber;

    final double rateOfInterest = 5;

    public SBIBankAccount() {   // DEFAULT CONSTRUCTOR
    }

    public SBIBankAccount(String name, String password, long pNumber, String eMail, double balance) {
        this.name = name;
        this.password = password;
        this.pNumber = pNumber;
        this.eMail = eMail;
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
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

    public long getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current password is: "+this.balance;
        }
        else
            return "Please enter valiad password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return this.balance;
    }

    @Override
    public String withdrawMoney(String paddword, double amount) {
        if(this.password.equals(password)){
            if(amount <= this.balance){
                this.balance -= amount;
                return "Money withdrawn successfully: "+this.balance;
            }
        }

            return "Please enter valid password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Your password has been changes successfully";
        }
        return "Please enter valid password";
    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance * rateOfInterest * years)/100;
    }
}
