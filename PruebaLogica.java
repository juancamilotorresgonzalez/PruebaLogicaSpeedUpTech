import javafx.beans.binding.Bindings;

import java.util.*;

public class PruebaLogica {

    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number");
            String number = userInput.next();
            if (number.equals("0,0")) break;
            int numberOfRepetitions = Integer.parseInt(number.split(",")[0]);
            String decimals = number.split(",")[1];
            String[][] displayArray = new String[decimals.length()][7];
            int[] arrayOfCiphers = new int[decimals.length()];
            int a;
            for (a = 0; a < decimals.length(); a++) {
                Scanner inr = new Scanner(System.in);
                arrayOfCiphers[a] = Integer.parseInt(String.valueOf(decimals.charAt(a)));


                switch (a) {


                    case 0:
                        System.out.println(" _ \n| | \n|_|");
                        break;
                    case 1:
                        System.out.println("   \n  |\n  |");
                        break;
                    case 2:
                        System.out.println(" _ \n _|\n|_ ");
                        break;
                    case 3:
                        System.out.println(" _ \n _|\n _|");
                        break;
                    case 4:
                        System.out.println("   \n|_|\n  |");
                        break;
                    case 5:
                        System.out.println(" _ \n|_ \n _|");
                        break;
                    case 6:
                        System.out.println(" _ \n|_ \n|_|");
                        break;
                    case 7:
                        System.out.println(" _ \n  |\n  |");
                        break;
                    case 8:
                        System.out.println(" _ \n|_|\n|_|");
                        break;
                    case 9:
                        System.out.println(" _ \n|_|\n _|");
                        break;


                default:
                    break;



                    for (int a = 0; a < 5; a++) {

                        if (a % 2 == 0) System.out.printf(" %s  ", displayArray[a][3 * a / 2]);
                        else
                            System.out.printf("%s   %s ", displayArray[a][a + (a - 1) / 2], displayArray[a][a + (a - 1) / 2 + 1]);
                    }
                    System.out.println("");
                }
                System.out.println("");

            }
        }
    }

}






