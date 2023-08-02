package main.java;

import java.util.Random;

public class SnakeFood {
    private final int posX;
    private final int posY;
    public SnakeFood(){
        posX=generatePos(Graphics.WIDTH);
        posY=generatePos(Graphics.HEIGHT);
    }

    private int generatePos(int size){
        Random random=new Random();
        return random.nextInt(size/Graphics.TICK_SIZE) * Graphics.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
