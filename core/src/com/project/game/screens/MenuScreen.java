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
    private Button hiScooresButton;
    private Button infoButton;
    private Button exitButton;

    public MenuScreen(SpaceInvanders game) {
        super(game);

    }

    @Override
    protected void init() {
        initGraphics();
        initButtons();


    }

    private void initButtons() {
        initPlayButton();
        initSettingsButton();
        initInfoButton();
        initExitButton();
    }



    private void initPlayButton() {
        palyButton = new Button(new Button.ButtonStyle());
        palyButton.setWidth(546);
        palyButton.setHeight(184);
        palyButton.setX(1093);
        palyButton.setY(663);
        palyButton.setDebug(true);

        stage.addActor(palyButton);

        palyButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                game.setScreen(new GameScreen(game));
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }

    private void initSettingsButton() {
        settingsButton = new Button(new Button.ButtonStyle());
        settingsButton.setWidth(546);
        settingsButton.setHeight(184);
        settingsButton.setX(1093);
        settingsButton.setY(447);
        settingsButton.setDebug(true);

        stage.addActor(settingsButton);

        settingsButton.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

                game.setScreen(new SettingsScreen(game));
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }


    private void initInfoButton() {

        infoButton = new Button(new Button.ButtonStyle());
        infoButton.setWidth(546);
        infoButton.setHeight(184);
        infoButton.setX(308);
        infoButton.setY(447);
        infoButton.setDebug(true);

        stage.addActor(infoButton);

        infoButton.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new InfoScreen(game));
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }


    private void initExitButton() {
        exitButton = new Button(new Button.ButtonStyle());
        exitButton.setWidth(546);
        exitButton.setHeight(184);
        exitButton.setX(643);
        exitButton.setY(32);
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

    private void initGraphics() {
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
