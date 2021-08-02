package com.player;

import com.level.ILevelStrategy;

public class Computer extends Player {
	ILevelStrategy ilevelStrategy;
	public Computer(ILevelStrategy ilevelStrategy){
		this.ilevelStrategy = ilevelStrategy;
		System.out.println("Computer class created");
	}
	public void makeMove() {
		ilevelStrategy.makeMove();
	}
	
}
