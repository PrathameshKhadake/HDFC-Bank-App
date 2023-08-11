public class Main {
    public static void main(String[] args) {

        HDFCBank PrathamAcc = new HDFCBank("Pratham", "Psk1234", 5000);
        System.out.println(PrathamAcc);

        //fetch balance
        System.out.println(PrathamAcc.fetchBalance("Psk1234")); //correct password
        System.out.println(PrathamAcc.fetchBalance("Psk123456")); //incorrect password

        //add money
        System.out.println(PrathamAcc.addMoney(5000));

        //withdraw money
        System.out.println(PrathamAcc.withdrawMoney("Psk1234", 4000)); //correct password
        System.out.println(PrathamAcc.withdrawMoney("psk1234", 40000)); //incorrect password

        //change password
        System.out.println(PrathamAcc.changePassword("Psk1234", "Pk12"));// correct oldpassword
        //fetch balance
        System.out.println(PrathamAcc.fetchBalance("Pk12"));

        System.out.println(PrathamAcc.changePassword("psk12", "pk123"));// wrong oldpassword

        //rate of interest
        System.out.println("Interest of 2 years will be: " + PrathamAcc.interestCalculation(2));

    }
}