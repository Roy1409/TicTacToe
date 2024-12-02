import java.util.Scanner;


public class logicTicTacToe {
    private java.util.Scanner Scanner;
    private String lastWinner;
    private int amountOfGames;
    TicTacToe game;
    Scanner scan=new Scanner(System.in);





    public logicTicTacToe(){}


    public void run() {
        names();
        play();
    }



    public void names(String name, String name2) {
        Player p1 = new Player(name);
        Player p2 = new Player(name2);
        game = new TicTacToe(p1, p2);
        game.Symbols();
    }

    private void names() {
        // get player names
        System.out.println("welcome to Tic-Tac-Toe!");
        System.out.print("Enter player 1's name: ");
        String p1Name = scan.nextLine();
        System.out.print("Enter player 2's name: ");
        String p2Name = scan.nextLine();
        // initialize Player objects and MathGame object
        Player p1 = new Player(p1Name);
        Player p2 = new Player(p2Name);
        game = new TicTacToe(p1, p2);
        game.Symbols();
    }
    private void play() {
        // get player names
        game.startingPlayer();
        System.out.println(game.getNameOfStartingPlayer()+" starts the game");
        System.out.println(game.grid());
        game.start();
        again();
        // present menu
    }



    public void again() {
        game.reset();
        System.out.print("Do you want to play again? y/n: ");
        String answer=scan.nextLine();
        System.out.println();
        if (answer.equals("y")) {
            play();
        }

    }
}
