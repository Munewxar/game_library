package CONTROLLER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by student on 09.09.2017.
 */

public class Main extends JPanel implements ActionListener{

    Image mapImage = new ImageIcon("1.jpg").getImage();
    Image playerImage = new ImageIcon("p.png").getImage();

    Timer timer = new Timer(20, this);

    JFrame frame;

    Player player;

    public Main(JFrame frame){
        this.frame = frame;
        player = new Player(frame);
        timer.start();

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                player.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.keyReleased(e);
            }
        });
    }

    public void paint(Graphics g){
        g.drawImage(mapImage, 0, 0, frame.getWidth(), frame.getHeight(), null);
        g.drawImage(playerImage, player.getpX(), player.getpY(), 40, 40, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        player.borderCheck();
        repaint();
    }
}
