import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Viewer {
    public void window() throws InterruptedException {
        Game game = new Game(new boolean[][]{{false,true,false},
                                             {false,true,false},
                                             {false,true,false}});


        while (true){
            game.step();
            for (int i = 0; i < game.board.length; i++){
                for (int j = 0; j < game.board.length; j++){

                }
            }
            TimeUnit.SECONDS.sleep(2);


        }
    }
}
