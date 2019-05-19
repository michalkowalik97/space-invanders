package com.project.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.project.game.SpaceInvanders;

public class MenuScreen extends AbstractScreen {
    private Texture menuImage;
    private Image image;

    private Button palyButton;
    private Button settingsButton;
    private Button exitButton;

    public MenuScreen(SpaceInvanders game) {
        super(game);

    }

    @Override
    protected void init() {
        initImages();
        initButtons();


    }

    private void initButtons() {
        palyButton = new Button(new Button.ButtonStyle());
        palyButton.setWidth(546);
        palyButton.setHeight(184);
        palyButton.setX(1331);
        palyButton.setY(545);
        palyButton.setDebug(true);

        stage.addActor(palyButton);

        palyButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                palyButton.setX(settingsButton.getY() - 20);
                return super.touchDown(event, x, y, pointer, button);
            }
        });


        settingsButton = new Button(new Button.ButtonStyle());
        settingsButton.setWidth(546);
        settingsButton.setHeight(184);
        settingsButton.setX(1331);
        settingsButton.setY(344);
        settingsButton.setDebug(true);

        stage.addActor(settingsButton);

        settingsButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //Gdx.app.exit();
                settingsButton.setX(settingsButton.getX() - 20);
                return super.touchDown(event, x, y, pointer, button);
            }
        });

        exitButton = new Button(new Button.ButtonStyle());
        exitButton.setWidth(546);
        exitButton.setHeight(184);
        exitButton.setX(1331);
        exitButton.setY(139);
        exitButton.setDebug(true);

        stage.addActor(exitButton);

        exitButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.exit();
                return super.touchDown(event, x, y, pointer, button);
            }
        });

    }

    private void initImages() {
        menuImage = new Texture(Gdx.files.internal(game.assets + "menu.png"));

        image = new Image(menuImage);
        image.setPosition(0, 0);
        stage.addActor(image);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }
}
