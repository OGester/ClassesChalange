public class Account {
    private int accountNumber = 12345;

    private double accountBalance = 10000;

    private String customerName = "Oskar";

    private String eMail = "hejdåbajskorv@Hotbrev.just.nu";

    private int phoneNumber = 031555666777;

    public double depositAmount(double deposite) {
        double afterDeposit = accountBalance + deposite;
        return afterDeposit;

    }
    public double withdrawalAmount(double withdrawal) {
        double afterWithdrawal = accountBalance - withdrawal;
        return afterWithdrawal;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }



}
