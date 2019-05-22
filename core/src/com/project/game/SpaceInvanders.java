package com.project.game;

import com.badlogic.gdx.Game;
import com.project.game.screens.MenuScreen;


public class SpaceInvanders extends Game {
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public final String assets = "B:\\Users\\Michal\\Desktop\\STUDIA\\Semestr IV\\Programowanie obiektowe (java)\\SpaceInvanders\\core\\assets\\";


    private boolean paused;


    private boolean mute;

    @Override
    public void create() {

        this.setScreen(new MenuScreen(this));
    }

    @Override
    public void render () {

        super.render();
    }

    /*
     *
     * GETTERS AND SETTERS
     */
    public boolean isPaused() {

        return paused;
    }

    public void setPaused(boolean paused) {

        this.paused = paused;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }
}
