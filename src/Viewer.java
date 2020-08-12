import java.io.IOException;
import java.util.Scanner;

public class Viewer {
    Game game = new Game(5);

    public void window() throws InterruptedException {
        game.board[0][1] = true;
        game.board[1][2] = true;
        game.board[2][0] = true;
        game.board[2][1] = true;
        game.board[2][2] = true;


        while (true){
            System.out.println();

            for (int i = -1; i < game.board.length; i++){
                for (int j = 0; j < game.board.length; j++){
                    if(i == -1){
                        System.out.print(j + "  ");
                    }else if (game.board[i][j]){
                        System.out.print("X  ");
                    }else System.out.print("_  ");
                }
                System.out.println(i);
            }
            game.step();
            getInput();

        }
    }

    private void getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("type y to change a cell");
        if(scanner.next().contains("y")){
            String string = scanner.next();
            String[] Values = string.split(",");
            ;
            game.board[Integer.parseInt(Values[0])][Integer.parseInt(Values[0])] = !game.board[Integer.parseInt(Values[0])][Integer.parseInt(Values[0])];

            System.out.println("Do you want to change another cell?");
            while (scanner.next().contains("y")){
                string = scanner.next();
                Values = string.split(",");
                ;
                game.board[Integer.parseInt(Values[0])][Integer.parseInt(Values[0])] = !game.board[Integer.parseInt(Values[0])][Integer.parseInt(Values[0])];

                System.out.println("Do you want to change another cell?");
            }
        }

    }
}
