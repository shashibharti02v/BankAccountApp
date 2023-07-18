public interface BankAccountInterface {

    String fetchBalance(String password);
    double addMoney(double amount);
    String withdrawMoney(String password, double amount);
    String changePassword(String oldPassword, String newPassword);
    double calculateInterest(int years);
}
