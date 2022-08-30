import java.util.Scanner;

public class planeTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] planeSeat = new int[11];

        boolean available = false;
        boolean y = true;

        int option;
        int FirstClass = 1;
        int Economy = 6;
        String x;

        while (FirstClass <= 5 && Economy<=10)
        {
            System.out.print("Enter 1 for First Class or 2 for Economic or -1 to exist:\t");
            option = scanner.nextInt();

            if (option == -1) {
                System.out.println("Thanks for Booking, Enjoy your Flight");
                break;
            }

            if (option == 1 && FirstClass <= 5) {
                System.out.println("you are assigned to first class \t" + "Seat #" + FirstClass + "\t");
                FirstClass++;
            }

            else if (option == 2 && Economy <= 10) {
                System.out.println("you are assigned to economy class \t" + Economy);
                Economy++;
            } else if (option == 1 && FirstClass >= 5) {
                System.out.println("First class full" + " ");
                if (Economy <= 10) {
                    System.out.println("is it accepted to be placed in the Economy class(y/n)\t");
                    x = scanner.next();

                    if (x.equals("y")) {
                        System.out.println("Seat reserved in Economy class \t" + Economy);

                    } else System.out.println("Next flight leaves in 3  hours. \t");
                }
            } else if (option == 2 && Economy >= 10) {
                System.out.println("Economy class full\t");
                x = scanner.next();

                if (x.equals("y")) {

                    System.out.println("you are assigned first class \t " + FirstClass);
                } else
                    System.out.println("Next flight leaves in 3 hours \t");
            }

            for (int i = 1; i < planeSeat.length; i++) {
                System.out.println(planeSeat[FirstClass] + planeSeat[Economy]);
            }
        }
    }
}
