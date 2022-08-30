public class TestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells:");
        String str = scanner.nextLine();

        char[] arr = new char[9];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        System.out.println("---------");
        System.out.println("|" + " " + arr[0] + " " + arr[1] + " " + arr[2] + " " + "|");
        System.out.println("|" + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + "|");
        System.out.println("|" + " " + arr[6] + " " + arr[7] + " " + arr[8] + " " + "|");
        System.out.println("---------");

        System.out.println("Enter the coordinates:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while(x > 3 || y > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        while(x == 1 && y == 1 && arr[0] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 1 && y == 2 && arr[1] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 1 && y == 3 && arr[2] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 2 && y == 1 && arr[3] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 2 && y == 2 && arr[4] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 2 && y == 3 && arr[5] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 3 && y == 1 && arr[6] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 3 && y == 2 && arr[7] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        while(x == 3 && y == 3 && arr[8] != '_') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println("Enter the coordinates:");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        if(x == 1 && y == 1 && arr[0] == '_') {
            arr[0] = 'X';
        } else if(x == 1 && y == 2 && arr[1] == '_') {
            arr[1] = 'X';
        } else if(x == 1 && y == 3 && arr[2] == '_') {
            arr[2] = 'X';
        } else if(x == 2 && y == 1 && arr[3] == '_') {
            arr[3] = 'X';
        } else if(x == 2 && y == 2 && arr[4] == '_') {
            arr[4] = 'X';
        } else if(x == 2 && y == 3 && arr[5] == '_') {
            arr[5] = 'X';
        } else if(x == 3 && y == 1 && arr[6] == '_') {
            arr[6] = 'X';
        } else if(x == 3 && y == 2 && arr[7] == '_') {
            arr[7] = 'X';
        } else if(x == 3 && y == 3 && arr[8] == '_') {
            arr[8] = 'X';
            System.out.println("---------");
            System.out.println("|" + " " + arr[0] + " " + arr[1] + " " + arr[2] + " " + "|");
            System.out.println("|" + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + "|");
            System.out.println("|" + " " + arr[6] + " " + arr[7] + " " + arr[8] + " " + "|");
            System.out.println("---------");
        }
    }
        }
}
