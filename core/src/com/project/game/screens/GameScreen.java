package com.project.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.project.game.SpaceInvanders;
import com.project.game.actors.PlayerSpacecraft;
import com.project.game.shootBehavior.SingleShoot;

public class GameScreen extends AbstractScreen {
    Image testImage;
    private PlayerSpacecraft player;

    public GameScreen(SpaceInvanders game) {
        super(game);
        init();
    }

    @Override
    protected void init() {
        initGraphics();
        initObjects();
    }

    private void initObjects() {
        player = new PlayerSpacecraft(111, 73, 3);
        player.setShootBehavior(new SingleShoot());


        player.setX(10);
        player.setY(540);

        stage.addActor(player);
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
            player.moveUp();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            player.moveDown();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            player.moveLeft();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            player.moveRight();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            player.shoot();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }


    }

    //temporary in this class
    /*private void moveUp() {
        Action moveUP = Actions.moveBy(0, 10, 0.3f);
        testImage.addAction(moveUP);
    }*/

    private void update() {
        stage.act();
    }

    private void initGraphics() {
        testImage = new Image(new Texture(Gdx.files.internal(game.assets + "game\\player.png")));
        testImage.setX(100);
        testImage.setY(100);

        //stage.addActor(testImage);

        //TO DO
        //testImage.addCaptureListener()
        // OR
        //testImage.addListener()
        //OR other way to handle keyboard input
    }


}
