import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account oskar = new Account();
        Scanner scan = new Scanner(System.in);

        System.out.println("welcome to The bank of Falköping.");
        while (true) {
            System.out.println("\npress\n 1. for deposit.\n 2. for Withdrawal.\n--> To leave press 0 <--");
            try {
                //while (true) {
                //try {
                int userChoice = scan.nextInt();


                switch (userChoice) {
                    case 1:
                        System.out.println("Enter the amount you want to deposite");
                        double deposit = scan.nextDouble();
                        double balanceAfterDeposit = oskar.depositAmount(deposit);
                        System.out.println("You made a deposite of\n" + deposit + "\nYour account saldo is now:\n" + balanceAfterDeposit);
                        System.out.println("Thank you for trusting The Bank of Falköping!\nGood bye!");
                        break;

                    case 2:
                        System.out.println("Enter the amount you want to withdraw");
                        double withdrawal = scan.nextDouble();
                        double finalBalance = oskar.withdrawalAmount(withdrawal);

                        if (finalBalance < 0) {
                            System.out.println("Oops there´s not enough money on your accont");
                            System.out.println("Please try again!");
                            break;

                        } else if (withdrawal < 0) {
                            System.out.println("Please try again!");
                            break;

                        } else {
                            System.out.println("You made a withdrawal of\n" + withdrawal + "\nYour account saldo is now: " + finalBalance);
                            System.out.println("Thank you for trusting The Bank of Falköping!\nGood bye!");
                            System.exit(0);
                            break;
                        }
                    case 0: {
                        System.out.println("Good bye");
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("Invalid input");
                }

                /*} catch(Exception e){
                System.out.println("Invalid input please try again");
                scan.nextLine();
            }*/
            } catch (Exception e) {
                System.out.println("Invalid input please try again");
                scan.nextLine();
                //} catch (Exception e) {
                //System.out.println("Invalid input please try again");
                //scan.nextLine();
            }
        }
    }
}