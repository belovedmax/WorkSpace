
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        System.out.println("welcome to my TIC_TAC_GAME");
        System.out.println("HOPE YOU GO COLLECT WOTO_WOTO");
        Scanner scanner = new Scanner(System.in);
        char[][] boardGame = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printBoard(boardGame);

        while (true) {

            playerXTurn(boardGame, scanner);
            if (isGameFinished(boardGame))
            {break;}
            printBoard(boardGame);
            playerOTurn(boardGame, scanner);
            if (isGameFinished(boardGame))
            {break;}
            printBoard(boardGame);
        }

    }

    private static boolean isGameFinished(char[][] boardGame) {

        if (possibleWin(boardGame,'X')){{
            printBoard(boardGame);
            System.out.println("Great, player X wins!!!!");

        }
            return true;
        }

        if (possibleWin(boardGame,'O')){{
            printBoard(boardGame);
            System.out.println("Great, player O wins!!!!");

        }
            return true;
        }

        for (char[] chars : boardGame) {
            for (char aChar : chars) {
                if (aChar ==' ') {
                    return false;
                }

            }
        }
        printBoard(boardGame);
        System.out.println("The game is a draw!");
        return true;
    }

    private static boolean possibleWin(char[][] boardGame,char symbol) {
        return (boardGame[0][0] == symbol && boardGame[0][1] == symbol && boardGame[0][2] == symbol) ||
                (boardGame[1][0] == symbol && boardGame[1][1] == symbol && boardGame[1][2] == symbol) ||
                (boardGame[2][0] == symbol && boardGame[2][1] == symbol && boardGame[2][2] == symbol) ||

                (boardGame[0][0] == symbol && boardGame[1][0] == symbol && boardGame[2][0] == symbol) ||
                (boardGame[0][1] == symbol && boardGame[1][1] == symbol && boardGame[2][1] == symbol) ||
                (boardGame[0][2] == symbol && boardGame[1][2] == symbol && boardGame[2][2] == symbol) ||


                (boardGame[0][0] == symbol && boardGame[1][1] == symbol && boardGame[2][2] == symbol) ||
                (boardGame[0][2] == symbol && boardGame[1][1] == symbol && boardGame[2][0] == symbol);
    }

    private static boolean validMove(char[][] boardGame,String position){
        return switch (position) {
            case "1" -> boardGame[0][0] == ' ';
            case "2" -> boardGame[0][1] == ' ';
            case "3" -> boardGame[0][2] == ' ';
            case "4" -> boardGame[1][0] == ' ';
            case "5"-> boardGame[1][1] == ' ';
            case "6"-> boardGame[1][2] == ' ';
            case "7" -> boardGame[2][0] == ' ';
            case "8" -> boardGame[2][1] == ' ';
            case"9"-> boardGame[2][2] == ' ';
            default -> false;
        };


    }

    private static void playerOTurn(char[][] boardGame, Scanner scanner) {
        String  playerO;
        while (true){
            System.out.println("player O's Turn");
            playerO = scanner.nextLine();
            System.out.println(playerO);

            if(validMove(boardGame,playerO)) {
                break;
            }else {
                System.out.println(playerO+"not available ");
                System.out.println("where would you like to play (player O's Turn)");

            }
        }

        placeMove(boardGame, playerO,'O');

    }

    private static void playerXTurn(char[][] boardGame, Scanner scanner) {
        String  playerX;
        while (true){
            System.out.println("player X's Turn");
            playerX = scanner.nextLine();
            System.out.println(playerX);

            if(validMove(boardGame,playerX)) {
                break;
            }else {
                System.out.println(playerX+" not available");
                System.out.println("where would you like to play (player X's Turn)");

            }
        }

        placeMove(boardGame, playerX,'X');

    }

    private static void placeMove(char[][] boardGame, String position,char symbol) {
        switch (position) {
            case "1" -> boardGame[0][0] = symbol;
            case "2" -> boardGame[0][1] = symbol;
            case "3" -> boardGame[0][2] = symbol;
            case "4" -> boardGame[1][0] = symbol;
            case "5" -> boardGame[1][1] = symbol;
            case "6" -> boardGame[1][2] = symbol;
            case "7" -> boardGame[2][0] = symbol;
            case "8" -> boardGame[2][1] = symbol;
            case "9" -> boardGame[2][2] = symbol;
            default -> System.out.println("Enter a cell 1-9!");
        }
    }


    private static void printBoard(char[][] boardGame) {
        System.out.println("--------------");
        System.out.println("| " + boardGame[0][0] + " | " +  boardGame[0][1] + " | " + boardGame[0][2]+" |");
        System.out.println("----+---+----");
        System.out.println("| " + boardGame[1][0] + " | " +  boardGame[1][1] + " | " + boardGame[1][2]+" |");
        System.out.println("----+---+----");
        System.out.println("| " + boardGame[2][0] + " | " +  boardGame[2][1] + " | " + boardGame[2][2]+" |");
        System.out.println("--------------");
    }
}

