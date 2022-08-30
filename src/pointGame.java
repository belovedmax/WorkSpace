import java.util.Scanner;

public class pointGame {


        public static void main(String[] args) {
            // put your code here

            System.out.println("Enter a number of (multiple of 3 starting from 9)");

            Scanner scanner=new Scanner(System.in);

            int len= scanner.nextInt();
            String [][] stars = new String[len][len];

            for (int i=0;i<stars.length;i++ ){
                for (int j=0; j<stars[i].length;j++){

                    if (j==len/2 || i==len/2 || j==i || j==len -(i+1)){
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }


        }

    }



