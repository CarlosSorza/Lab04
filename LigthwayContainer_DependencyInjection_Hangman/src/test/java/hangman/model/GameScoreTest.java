import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;
public class GameScoreTest {


    GameScore score;

    /* Original Score */

    @Test
    public void points_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(0,0);
        Assert.assertEquals(100,numero);   


    }

    @Test
    public void wrong_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(0,1);
        Assert.assertEquals(90,numero);       
  
    }

    @Test
    public void min_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(0,11);
        Assert.assertEquals(0,numero);       
  
    }

    @Test
    public void no_bonus_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(1,2);
        Assert.assertEquals(80,numero);       
  
    }

    /* Bonus Score */

    @Test
    public void points_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(0,0);
        Assert.assertEquals(0,numero);   


    }

    @Test
    public void bonus_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(1,0);
        Assert.assertEquals(10,numero);   

    }

    @Test
    public void wrong_bonus_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(2,1);
        Assert.assertEquals(15,numero);   

    }

    @Test
    public void min_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(0,1);
        Assert.assertEquals(0,numero);   

    }

    /* Power Bonus Score */

    @Test
    public void points_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(0,0);
        Assert.assertEquals(0,numero);   

    }

    @Test
    public void Bonus_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(3,0);
        Assert.assertEquals(155,numero);   

    }

    @Test
    public void wrong_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(3,10);
        Assert.assertEquals(75,numero);   

    }

    @Test
    public void min_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(1,5);
        Assert.assertEquals(0,numero);   

    }

    @Test
    public void max_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(4,0);
        Assert.assertEquals(500,numero);   

    }

}