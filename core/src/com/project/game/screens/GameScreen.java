package com.project.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.project.game.SpaceInvanders;

public class GameScreen extends AbstractScreen {

    public GameScreen(SpaceInvanders game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        initGraphics();
    }

    private void initGraphics() {
        Texture test = new Texture(Gdx.files.internal(game.assets + "badlogic.jpg"));
        final Image testImage = new Image(test);
        testImage.setPosition(100, 100);
        stage.addActor(testImage);
        Actor actor = new Actor();

        testImage.addListener(new InputListener(){
            @Override
            public boolean keyDown(InputEvent event, int keycode) {

                return super.keyDown(event, keycode);
            }
        });

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            System.out.println("A");

        }
    }

}
