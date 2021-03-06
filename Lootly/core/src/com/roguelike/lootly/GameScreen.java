package com.roguelike.lootly;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.roguelike.lootly.gui.ItemDisplayBox;

public class GameScreen implements Screen, InputProcessor {
	final Lootly game;
	private Stage gameStage;//stage that contains all the game elements
	private Stage uiStage;//stage that contains all the UI elements
	ItemDisplayBox itemBox = new ItemDisplayBox(Lootly.cloner.deepClone(Lootly.itemList.get(0))); //TODO: Remove debugging object
	ItemDisplayBox itemBoxClone = new ItemDisplayBox(Lootly.cloner.deepClone(Lootly.itemList.get(1)));
	

	
	public GameScreen(Lootly game) {
		this.game = game;
		gameStage = new Stage(game.viewport_game);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(gameStage);
		
		//Actor instantiation
		itemBox.setX(Gdx.graphics.getWidth()/2);
		itemBox.setY(Gdx.graphics.getHeight()/2);
		
		itemBoxClone.setX(Gdx.graphics.getWidth()/2 + 300);
		itemBoxClone.setY(Gdx.graphics.getHeight()/2);
		
		//Actor staging
		gameStage.addActor(itemBox);
		gameStage.addActor(itemBoxClone);
	}

	@Override
	public void render(float delta) {
		game.batch.setProjectionMatrix(game.viewport_game.getCamera().combined);
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		gameStage.act(delta);
		gameStage.draw();

	}

	@Override
	public void resize(int width, int height) {
		// 

	}

	@Override
	public void pause() {
		

	}

	@Override
	public void resume() {
		

	}

	@Override
	public void hide() {
		

	}

	@Override
	public void dispose() {
		

	}

	@Override
	public boolean keyDown(int keycode) {
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		
		return false;
	}
	
	

}
