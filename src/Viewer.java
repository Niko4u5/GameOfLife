import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Viewer {
    public void window() throws InterruptedException {
        Game game = new Game(5);
        game.board[0][1] = true;
        game.board[1][2] = true;
        game.board[2][0] = true;
        game.board[2][1] = true;
        game.board[2][2] = true;


        while (true){
            System.out.println();
            for (int i = 0; i < game.board.length; i++){
                for (int j = 0; j < game.board.length; j++){
                    if (game.board[i][j]){
                        System.out.print("X  ");
                    }else System.out.print("_  ");
                }
                System.out.println();
            }
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            game.step();


        }
    }
}
