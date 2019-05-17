package com.project.game;

import com.badlogic.gdx.Game;
import com.project.game.screens.MenuScreen;


public class SpaceInvanders extends Game {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;


	private boolean paused;
	
	@Override
	public void create () {
		this.setScreen(new MenuScreen(this));
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

}
