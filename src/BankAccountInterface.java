public interface BankAccountInterface {

    String fetchBalance(String password);

    String addMoney(double ammount);

    String withdrawMoney(String password, double ammount);

    String changePassword(String oldpassword, String newpassword);

    Double interestCalculation(int year);

}
