
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alux9127477l
 */
public class ScoreBoard extends JLabel implements IncrementScorer {

    private int score;

    public ScoreBoard() {
        super();
        score = 0;
        setText("Score: 0");

    }

    @Override
    public void increment(int points) {
        score += points;
        setText("Score: " + score);
    }

    @Override
    public void reset() {
        score = 0;
        setText("Score: 0");
    }
    
    public int getScore(){
        return score;
    }

}
