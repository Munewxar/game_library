package VIEW;

import CONTROLLER.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 09.09.2017.
 */

public class GameField {

    public JFrame buildGameFieldFrame(){

        JFrame gameFieldFrame = new JFrame("Library");

        gameFieldFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFieldFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
        gameFieldFrame.setUndecorated(true);

        gameFieldFrame.add(new Main(gameFieldFrame));

        return gameFieldFrame;
    }

    public static void main(String[] args) {
        JFrame frame = new GameField().buildGameFieldFrame();
        frame.setVisible(true);
    }
}
