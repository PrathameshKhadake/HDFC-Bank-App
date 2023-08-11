import java.util.UUID;

public class HDFCBank implements BankAccountInterface{

    private String name;

    private String AccountNo;

    private String password;

    private double balance;

    final double rateofinterest = 8.0;

    final String IFSCCode = "HDFC000567";

    public HDFCBank() {
    }

    public HDFCBank(String name, String password, double balance){
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
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

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current Balance is: " + this.balance;
        }
        return "Incorrect Password!!!";
    }

    @Override
    public String addMoney(double ammount) {
        this.balance += ammount;
        return "Rs. " + ammount + " is credited in your Account and your current balance is: " + this.balance;
    }

    @Override
    public String withdrawMoney(String password, double ammount) {
        if(this.password.equals(password)){
            if(this.balance < ammount){
                return "Balance insufficient!!";
            }
            this.balance -= ammount;
            return "Rs. " + ammount + " is debited from your account and your current balance is: " + this.balance;
        }
        return "Incorrect password!!!";
    }

    @Override
    public String changePassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newpassword;
            return "Password has successfully change";
        }
        return "Incorrect oldpassword!!!";
    }

    @Override
    public Double interestCalculation(int year) {
        return (this.balance*year*rateofinterest)/100;
    }

    @Override
    public String toString() {
        return "HDFCBank{" +
                "name='" + name + '\'' +
                ", AccountNo='" + AccountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
