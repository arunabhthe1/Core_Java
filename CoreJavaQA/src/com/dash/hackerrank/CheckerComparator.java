package com.dash.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CheckerComparator implements Comparator<Player>{
	@Override
	public int compare(Player playerOne, Player playerTwo) {
		// TODO Auto-generated method stub
		if(playerOne.getScore()>playerTwo.getScore()){
			return 1;
		}
		else if(playerOne.getScore()<playerTwo.getScore()){
			return -1;
		}else{
			return playerOne.getName().compareTo(playerTwo.getName());
		}
	}
}

