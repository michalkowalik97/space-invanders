package com.project.game.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class Spacecraft extends Actor {


    protected int lifes;
    protected final int WIDTH;
    protected final int HEIGHT;



    public Spacecraft(int width, int height, int lifes){
        this.WIDTH = width;
        this.HEIGHT = height;
        this.setLifes(lifes);
    }

    protected abstract void init();

    public void addLife(){
        this.lifes += 1;
    }

    public void substactLife(){
        if (lifes > 0 )
            lifes -= 1;
    }

    /*
    *GETTERS AND SETTERS
     */
    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

}
