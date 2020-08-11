import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Viewer {
    public void window() throws InterruptedException {
        Game game = new Game(new boolean[][]{{false,true,false},
                                             {false,true,false},
                                             {false,true,false}});

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JTable board = new JTable(game.board.length,game.board.length);
        board.setVisible(true);


        while (true){
            game.step();
            for (int i = 0; i < game.board.length; i++){
                for (int j = 0; j < game.board.length; j++){
                    board.setValueAt(game.board[i][j],i,j);
                }
            }
            TimeUnit.SECONDS.sleep(2);


        }
    }
}
