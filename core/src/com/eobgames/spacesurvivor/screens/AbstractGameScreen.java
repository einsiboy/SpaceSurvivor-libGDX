package com.eobgames.spacesurvivor.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public abstract class AbstractGameScreen implements Screen {
	
	protected Game game;
	
	public AbstractGameScreen(Game game){
		this.game = game;
	}

	public abstract void render(float deltaTime);

	public abstract void resize(int width, int height);

	public abstract void show();
	
	public abstract void hide();
	
	public abstract void pause();

	public abstract void resume();

	public abstract void dispose();

}
