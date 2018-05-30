package com.MethodQuiz;

public class Main {
    //procedure mean method returing void
	//method can also be called function or procedures
	public static void main(String[] args) {
		
		int table =calcuateHighScorePosition (1000) ;
		displayHighScorePosition("Fahad",table);
		
		table =calcuateHighScorePosition (900) ;
		displayHighScorePosition("Zainab",table);
		
		table =calcuateHighScorePosition (400) ;
		displayHighScorePosition("Hadi",table);
		
		table =calcuateHighScorePosition (50) ;
		displayHighScorePosition("Zara",table);
		
		}

	public static void displayHighScorePosition( String playerName, int playerPosition){
		
		System.out.println(playerName + " managed to get into position " + playerPosition + 
				" on the high score table");
	}
	
	public static int calcuateHighScorePosition ( int playerScore){
		
		int score = 4;
			
		if (playerScore >= 1000){
			 score = 1;
		}
		else if (playerScore >= 500 && playerScore < 1000){
			score = 2;
		}
		else if (playerScore >= 100 && playerScore < 500){
			score = 3;
		}
		return score;
	}
}
