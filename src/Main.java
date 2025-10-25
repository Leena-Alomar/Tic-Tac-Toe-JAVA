import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String charachter = " ";
        String compCharater = "\uD83E\uDD16";
        int rounds =1;

        String[][] board = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        System.out.println("˚　　　　✦　　　.　　. 　 ˚　.　　　　　 . ✦　　　 　˚　　　　 . ★⋆. ࿐࿔ \n" +
                "　　　.   　　˚　　 　　*　　 　　✦　　　.　　.　　　✦　˚ 　　　　 ˚　.˚　　　　✦　　　.　　. 　 ˚　.　" +
                "　　　 　　 　　　　   　");
        System.out.println("⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣤⣤⡀⠉⠢⡀⠀⠀⠈⣠⣤⣤⣤⣤⠀⠀⠇⠀⠀⠀⣤⣤⣤⣤⣤⠀⠀⠏⣠⣤⣤⣤⣤⣤⠀⠀⢠⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⢠⣤⣤⣤⠀⠀⡇\n" +
                "⠀⡀⢀⣴⣿⣿⣿⠿⠿⠿⢿⣿⡿⠃⠀⠱⠀⠀⣰⣿⣿⣿⣿⣿⡇⢀⢸⠀⠀⢰⣿⣿⣿⣿⣿⡇⠀⢠⣿⣿⣿⣿⣿⡇⠀⠀⣿⣿⣿⣿⣿⣿⠿⠿⠿⠏⠀⠀⣾⣿⣿⡏⠀⢸⠁\n" +
                "⡀⢠⣿⣿⣿⠏⠀⠀⠀⠀⠀⠉⠀⠀⠀⢶⠃⣼⣿⣿⡟⢹⣿⣿⣿⡏⠸⡄⡀⣼⣿⣿⣿⣿⣿⡇⢀⣿⣿⡏⣿⣿⣿⠁⠀⢠⣿⣿⣿⣇⣀⣀⣀⣀⠀⠀⠀⠀⣿⣿⣿⠁⠀⡏⠀\n" +
                "⢀⣿⣿⣿⡟⠀⠀⣼⣿⣿⣿⣿⣿⠀⠀⠁⣼⣿⣿⡟⠀⢸⣿⣿⣿⡅⠂⡷⢀⣿⣿⡟⣿⣿⣿⡇⣼⣿⡿⢸⣿⣿⡏⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⡏⠀⢰⠀⠀\n" +
                "⠘⣿⣿⣿⣧⠀⠀⠛⠛⢻⣿⣿⡏⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡗⠀⠄⢸⣿⣿⠇⢻⣿⣿⣿⣿⡿⠁⣾⣿⣿⠃⠀⠀⣿⣿⣿⡏⠉⠉⠉⠉⠁⠀⠀⠀⠸⠟⠛⠁⠀⠮⠀⠀\n" +
                "⠀⠹⣿⣿⣿⣷⣤⣤⣴⣾⣿⣿⠃⢀⣾⣿⣿⣏⠍⠭⠟⠋⢻⣿⣿⣷⠶⠂⣿⣿⣿⠀⢸⣿⣿⣿⣿⠃⢨⣿⣿⣿⠀⠀⢸⣿⣿⣿⣷⣶⣶⣶⣶⣶⡆⠀⢰⣶⣶⣶⠀⠀⡇⠀⠀\n" +
                "⢆⠀⠙⠙⠛⠿⠿⠿⠿⠛⠋⠁⠀⠚⠛⠛⠋⠀⢠⠤⠤⡀⠘⠛⠛⠛⠀⠐⠛⠛⠋⠀⠘⠛⠛⠛⠃⠀⠘⠛⠛⠃⠀⠀⠚⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠚⠛⠛⠋⠀⢰⠀⠀⠀\n" +
                "⠀⠑⠤⢄⡀⠀⠀⠀⣀⣀⣄⣀⣀⣀⣀⣀⣀⡠⠃⠀⠀⣇⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀");
        System.out.println(" Welcome To Tic Tac Toe Game  ✮⋆˙! \n");


        System.out.println("Please Choose Your Charater 1.\uD83E\uDDDF 2.\uD83E\uDDDD\uD83C\uDFFC 3.\uD83E\uDDD9\u200D♂\uFE0F : ");
        try{
            int choice = input.nextInt();
            if (choice == 1) {
                charachter = "\uD83E\uDDDF";
            } else if (choice == 2) {
                charachter = "\uD83E\uDDDD\uD83C\uDFFC";
            } else if (choice == 3) {
                charachter = "\uD83E\uDDD9\u200D♂\uFE0F";
            } else {
                System.out.println("Please Entre a Valid Choice !");
            }
        }catch(InputMismatchException e){
            System.out.println("Please Entre a valid input !");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("⏳: " + rounds+"       " +charachter+": 0          "+compCharater+": 0");
        System.out.println("______________________________ \n");
        System.out.println(" " + board[0][0] + "   | " + board[0][1] + "   | " + board[0][2] + " \n" +
                            "_____|_____|_____\n" +
                            " " + board[1][0] + "   | " + board[1][1] + "   | " + board[1][2] + " \n" +
                            "_____|_____|_____\n" +
                            " " + board[2][0] + "   | " + board[2][1] + "   | " + board[2][2] + "\n");

        int compChoice = 0;
        int userChoice = 0;
        setChoices(userChoice, board, compChoice, charachter, compCharater, rounds);

    }

    public static void setChoices(int userPosition, String[][] gameBoard, int computerChoice, String chara, String compchar, int round) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int countUser = 0;
        int countComp = 0;
        String winner = " ";
        boolean isOver=false;
        int rounds = 1;

        while (winner.equals(" ") && !isOver) {
            while (true) {
                try{
                    System.out.println("Please Choose your Position");
                    userPosition = input.nextInt();
                    if (isAvailabe(String.valueOf(userPosition), gameBoard)) {
                        setPosition(String.valueOf(userPosition), gameBoard, chara);
                        break;
                    } else {
                        System.out.println("Please Choose a valid Position !");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Please Choose a valid Position From 1 to 9");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            printBoard(gameBoard, round,countUser,countComp,chara,compchar);

            while (true) {
                computerChoice = random.nextInt(9) + 1;
                if (isAvailabe(String.valueOf(computerChoice), gameBoard)) {
                    setPosition(String.valueOf(computerChoice), gameBoard, compchar);
                    break;
                }
            }
            printBoard(gameBoard, round,countUser,countComp,chara,compchar);


            winner = checkWinner(gameBoard, chara, compchar, winner);
            if (winner.equals("You") || winner.equals("computer")) {
                isOver=true;
                if (winner.equals("You")) {
                    countUser++;
                } else  {
                    countComp++;
                }
                if (countUser > countComp) {
                    winner = "You";
                } else {
                    winner = "computer";
                }

                System.out.println("┊         ┊       ┊   ┊    ┊        ┊\n" +
                        "┊         ┊       ┊   ┊   ˚★⋆｡˚  ⋆\n" +
                        "┊         ┊       ┊   ⋆\n" +
                        "┊         ┊       ★⋆\n" +
                        "┊ ◦\n" +
                        "★⋆      ┊ .  ˚\n" +
                        "           ˚★");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⡀⠀⠀\n" +
                        "⠀⠀⢠⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣾⠏⠘⠿⣦⣤\n" +
                        "⠀⠀⣾⠉⠻⢶⠶⠛⢻⡇⠀⠀⠀⠘⢻⡦⠀⠀⢰⡾⠃\n" +
                        "⢀⣤⠿⠀⠀⠀⠀⢠⡟⠁⠀⠀⠀⠀⠸⠷⠿⠿⣾⣷⠀\n" +
                        "⢿⣥⣀⠀⠀⠀⠀⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠈⠉⣿⣀⣾⠟⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠘⠛⠁⠀⠀⠀⠀⠀⢀⣾⢻⣆⡀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⠃⠀⠙⠛⣿⠇⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣶⡄⠀⠀⢸⣏⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⡷⠟⠛⠻⠿⠀⠀⠀⠀");
                System.out.println("      ╔═══════════════╗");
                System.out.println("      ║  " + winner + " WIN! ");
                System.out.println("      ╚═══════════════╝");

            }else if(isAllFull(gameBoard)){
                System.out.println("It's a Draw !");
                isOver=true;
            }

        }

    }

    public static boolean isAvailabe(String Position, String[][] gameboard) {
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                if (gameboard[i][j].equals(Position)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void setPosition(String position, String[][] board, String n) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (position.equals(board[i][j])) {
                    board[i][j] = n;
                }
            }
        }
    }


    public static void printBoard(String[][] gBoard, int round,int countuser,int countcomp,String user,String comp) {
        System.out.println("⏳: " + round+"       " +user+": "+countuser+"          "+comp+": "+countcomp);
        System.out.println("______________________________ \n");
        System.out.println(" " + gBoard[0][0] + "   | " + gBoard[0][1] + "   | " + gBoard[0][2] + " \n" +
                            "_____|_____|_____\n" +
                            " " + gBoard[1][0] + "   | " + gBoard[1][1] + "   | " + gBoard[1][2] + " \n" +
                            "_____|_____|_____\n" +
                            " " + gBoard[2][0] + "   | " + gBoard[2][1] + "   | " + gBoard[2][2] + "\n");
    }


    public static String checkWinner(String[][] board, String user, String compChar, String winner) {

        if ((board[0][0].equals(user) && board[1][0].equals(user) && board[2][0].equals(user)) ||
                (board[0][1].equals(user) && board[1][1].equals(user) && board[2][1].equals(user)) ||
                (board[0][2].equals(user) && board[1][2].equals(user) && board[2][2].equals(user)) ||
                (board[0][0].equals(user) && board[0][1].equals(user) && board[0][2].equals(user)) ||
                (board[1][0].equals(user) && board[1][1].equals(user) && board[1][2].equals(user)) ||
                (board[2][0].equals(user) && board[2][1].equals(user) && board[2][2].equals(user)) ||
                (board[0][0].equals(user) && board[1][1].equals(user) && board[2][2].equals(user)) ||
                (board[2][0].equals(user) && board[1][1].equals(user) && board[0][2].equals(user))
        ) {
            return winner = "You";
        } else if ((board[0][0].equals(compChar) && board[1][0].equals(compChar) && board[2][0].equals(compChar))
                || (board[0][1].equals(compChar) && board[1][1].equals(compChar) && board[2][1].equals(compChar))
                || (board[0][2].equals(compChar) && board[1][2].equals(compChar) && board[2][2].equals(compChar))
                || (board[0][0].equals(compChar) && board[0][1].equals(compChar) && board[0][2].equals(compChar))
                || (board[1][0].equals(compChar) && board[1][1].equals(compChar) && board[1][2].equals(compChar))
                || (board[2][0].equals(compChar) && board[2][1].equals(compChar) && board[2][2].equals(compChar))
                || (board[0][0].equals(compChar) && board[1][1].equals(compChar) && board[2][2].equals(compChar))
                || (board[2][0].equals(compChar) && board[1][1].equals(compChar) && board[0][2].equals(compChar))
        ) {
            return winner = "computer";
        }

        return winner;
    }

    public static boolean isAllFull(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j].charAt(0))) {
                    return  false;
                }
            }
        }
        return true;
    }
}