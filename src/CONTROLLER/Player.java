package CONTROLLER;

import com.sun.javafx.scene.traversal.Direction;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by student on 09.09.2017.
 */

public class Player {

    private int pX = 0;
    private int pY = 0;
    private int speed = 2;
    private int mapX = 0;
    private int mapY = 0;

    private Direction playerDirection = Direction.RIGHT;

    private JFrame frame;

    Player(JFrame frame){
        this.frame = frame;
    }

    void move(){

        switch(playerDirection) {
            case UP:
                pY -= speed;
                break;
            case DOWN:
                pY += speed;
                break;
            case LEFT:
                pX -= speed;
                break;
            case RIGHT:
                pX += speed;
                break;
            default:
                break;
        }
    }

    void borderCheck(){

        int directionSwitcher = 4;

        if((pX + speed) > (frame.getWidth() - 50)){
            directionSwitcher = 0;
        }

        if((pX - speed) < 0){
            directionSwitcher = 1;
        }

        if((pY + speed) > (frame.getHeight() - 50)){
            directionSwitcher = 2;
        }

        if((pY - speed) < 0){
            directionSwitcher = 3;
        }

        switch (directionSwitcher){
            case 0:
                playerDirection = Direction.LEFT;
                break;

            case 1:
                playerDirection = Direction.RIGHT;
                break;

            case 2:
                playerDirection = Direction.UP;
                break;

            case 3:
                playerDirection = Direction.DOWN;
                break;

            default:
                break;
        }
    }

    void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W){
            playerDirection = Direction.UP;
        }

        if (key == KeyEvent.VK_A){
            playerDirection = Direction.LEFT;
        }

        if (key == KeyEvent.VK_S){
            playerDirection = Direction.DOWN;
        }

        if (key == KeyEvent.VK_D){
            playerDirection = Direction.RIGHT;
        }
    }

    void keyReleased(KeyEvent e){
        System.out.println(e.getKeyCode());
    }

    public int getSpeed() {
        return speed;
    }

    int getpX() {
        return pX;
    }

    int getpY() {
        return pY;
    }


    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }
}
