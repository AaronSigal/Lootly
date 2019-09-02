package com.roguelike.lootly.character;

import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.roguelike.lootly.classes.Archer;
import com.roguelike.lootly.classes.Classes;
import com.roguelike.lootly.classes.Crusader;
import com.roguelike.lootly.classes.Mage;

//For handling all the character-class specific functions that will likely need to be called in more than one class, and for more than one reason.
public class CharacterClassManager {
	
	private HashMap<Classes, Boolean> unlockMap;
	
	public void init() {
		
	}
	
	public boolean isUnlocked(Classes characterClass) {
		if (unlockMap.containsKey(characterClass)) {
			return unlockMap.get(characterClass);
		} else {
			return false;
		}
	}

	public static Sprite getClassSprite(Classes characterClasses) {
		switch (characterClasses) {
			case CRUSADER:
				return Crusader.getClassSprite();
			case ARCHER:
				return Archer.getClassSprite();
			case MAGE:
				return Mage.getClassSprite();
			default:
				return Mage.getClassSprite();
		}
	}
}
