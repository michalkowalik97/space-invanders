package com.project.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.project.game.SpaceInvanders;

public class GameScreen extends AbstractScreen {
    Image testImage;

    public GameScreen(SpaceInvanders game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        initGraphics();
    }


    @Override
    public void render(float delta) {
        super.render(delta);
        update();
        handleKeyInput();

        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    //temporary in this class
    private void handleKeyInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            moveUp();
        }
    }

    //temporary in this class
    private void moveUp() {
        Action moveUP = Actions.moveBy(0, 10, 0.3f);
        testImage.addAction(moveUP);
    }

    private void update() {
        stage.act();
    }

    private void initGraphics() {
        testImage = new Image(new Texture(Gdx.files.internal(game.assets + "badlogic.jpg")));
        testImage.setX(100);
        testImage.setY(100);

        stage.addActor(testImage);

        //TO DO
        //testImage.addCaptureListener()
        // OR
        //testImage.addListener()
        //OR other way to handle keyboard input
    }
}
