import java.util.Scanner;  // Import the Scanner class
public class runCentDollar {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a dollar amount");
        String USD = myObj.nextLine();  // Read user input
        CentDollar centDollar = new CentDollar(USD);
        CentDollarAccount centDollarAccount = new CentDollarAccount(centDollar);
                                                                            }

}
