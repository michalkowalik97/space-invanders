package com.project.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PlayerSpacecraft extends Spacecraft {

    Image playerImage;
    Texture playerTexture;
    TextureRegion region;



    public PlayerSpacecraft(int width, int height, int lifes) {
        super(width, height, lifes);
        region = new TextureRegion(playerTexture, 111, 73);
        setBounds(region.getRegionX(),
                region.getRegionY(),
                region.getRegionWidth(),
                region.getRegionHeight());

    }

    @Override
    protected void init() {
        playerTexture = new Texture(Gdx.files.internal(super.assets + "player.png"));
        playerImage = new Image(playerTexture);
    }

    @Override
    public void draw(Batch batch, float parentAlpha){
        Color color = getColor();
        batch.draw(region, getX(), getY(), getOriginX(),
                getOriginY(), getWidth(), getHeight(), getScaleX(),
                getScaleY(), getRotation());

    }
}
