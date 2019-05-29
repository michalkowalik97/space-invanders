package com.project.game.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.project.game.shootBehavior.ShootInterface;

public abstract class Spacecraft extends Actor {

    public final String assets = "B:\\Users\\Michal\\Desktop\\STUDIA\\Semestr IV\\Programowanie obiektowe (java)\\SpaceInvanders\\core\\assets\\game\\";
    protected final int WIDTH;
    protected final int HEIGHT;
    protected ShootInterface shootBehavior;
    protected int lifes;
    protected float moveSpeed = 10;


    public Spacecraft(int width, int height, int lifes) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.setLifes(lifes);
        init();
    }

    protected abstract void init();


    public void moveUp() {
        this.addAction(Actions.moveBy(0, moveSpeed, 0.3f));
    }

    public void moveDown() {

        this.addAction(Actions.moveBy(0, -moveSpeed, 0.3f));
    }

    public void moveLeft() {
        this.addAction(Actions.moveBy(-moveSpeed, 0, 0.3f));
    }

    public void moveRight() {

        this.addAction(Actions.moveBy(moveSpeed, 0, 0.3f));
    }

    public void shoot() {
        this.shootBehavior.shoot();
    }

    /*
     *-------------------
     *GETTERS AND SETTERS
     *
     */
    public int getLifes() {

        return lifes;
    }

    public void addLife() {
        this.lifes++;
    }

    public void substactLife() {
        if (lifes > 0)
            lifes -= 1;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setShootBehavior(ShootInterface sh) {
        this.shootBehavior = sh;
    }
}
