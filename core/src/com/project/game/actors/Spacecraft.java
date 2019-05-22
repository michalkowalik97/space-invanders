package com.project.game.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.project.game.shootInterfaces.shootInterface;

public abstract class Spacecraft extends Actor {

    protected shootInterface shootBehavior;
    protected int lifes;
    protected final int WIDTH;
    protected final int HEIGHT;
    protected float moveSpeed = 10;


    protected abstract void init();

    public Spacecraft(int width, int height, int lifes) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.setLifes(lifes);
    }

    public void setShoot(shootInterface sh) {
        this.shootBehavior = sh;
    }


    public void addLife() {
        this.lifes ++;
    }

    public void substactLife() {
        if (lifes > 0)
            lifes -= 1;
    }

    protected void moveUp() {
        this.addAction(Actions.moveBy(0, moveSpeed, 0.3f));
    }

    protected void moveDown() {
        this.addAction(Actions.moveBy(0, -moveSpeed, 0.3f));
    }

    protected void moveLeft() {
        this.addAction(Actions.moveBy(-moveSpeed, 0, 0.3f));
    }

    protected void moveRight() {
        this.addAction(Actions.moveBy(moveSpeed, 0, 0.3f));
    }

    public void shoot(){
        this.shootBehavior.shoot();
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
