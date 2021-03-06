package com.project.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.project.game.SpaceInvanders;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Space invanders";
		config.width = SpaceInvanders.WIDTH;
		config.height = SpaceInvanders.HEIGHT;
		config.resizable = false;
		config.fullscreen = true;
		new LwjglApplication(new SpaceInvanders(), config);
	}
}
