package hangman.model;

public class OriginalScore implements GameScore {
 

	public OriginalScore() {
        
	}

	public int calculateScore(int correctCount, int incorrectCount) {
        int score;
        score = 100 - (incorrectCount * 10);
        if  (score < 0){    

            score = 0;            
        }
        return score;
	}
}