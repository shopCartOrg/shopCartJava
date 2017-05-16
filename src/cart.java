import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/15/17.
 */
public class cart {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String anotherItem;
        String combinedReceipt;
        String finalString = "  Item  |  Quanity  |  Price  |  Total\n";
        finalString += "-------------------------------------\n";

    do {
        System.out.println("===== Menu =====");

        System.out.println("1.  Sale");
        System.out.println("2.  Print Receipt");
        System.out.println("3.  Exit");

        System.out.println("");

        System.out.println("Select system option:  ");
        int menuSelection = sc.nextInt();

        System.out.println(" ");

        if (menuSelection == 1) {
//            double itemTotal = gotoItem(sc);

            System.out.println( "Soda Options");
            System.out.println("1. Coke ");
            System.out.println("2. Pepsi ");
            System.out.println("3. Big Red ");

            System.out.println("Choose soda option:  ");
            double sodaOption = sc.nextDouble();


            System.out.println(("How many sodas do you wish to buy:  "));
            double sodaQuantity = sc.nextDouble();

            System.out.println("Enter price per soda:  ");
            double sodaPrice = sc.nextDouble();

            double itemTotal = sodaQuantity * sodaPrice;

            finalString += String.format(" %-10f  |  %-10f  | $ %-2f  |  $%-2f \n", sodaOption, sodaQuantity, sodaPrice, itemTotal);


        } else if (menuSelection == 2) {
            //goto receipt method
            gotoReceipt(finalString);
        } else if (menuSelection == 3) {
            //exit method
            gotoExit();
        } else { // out of bounds method
            gotoOutOfBounds();
        }

        // sc.next(); // related to do you want to loop again/ purchase more items
        sc.nextLine();
        System.out.println("Do you want to continue ?");
        anotherItem = sc.next();

    } while ( anotherItem.equalsIgnoreCase("y"));

        //  meth--if select 1...do this send to items
        //  meth if 2
        // meth if 3
        // if  error --then xxx


    } // end main method




    public static void gotoReceipt(String finalString){

        System.out.println(finalString);


    }
    public static void gotoExit(){

    }
    public static void gotoOutOfBounds() {
        System.out.println("Invalid selection!");
    }

} // end of class
