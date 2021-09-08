package hangman.model;


import java.lang.*;

public class PowerScore implements GameScore {
  
	public PowerScore() {
        
	}

	public int calculateScore(int correctCount, int incorrectCount)  {
        int score = 0;

        for (int i = 0; i < correctCount; i++){

            score += Math.pow(5, i+1);
        }
        

        score -= incorrectCount * 8;

        if  (score < 0){    
            score = 0;            
        }
        if  (score > 500){    
            score = 500;            
        }
        return score;
	}

}