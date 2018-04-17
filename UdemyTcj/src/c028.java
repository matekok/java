//30-as video
public class c028 {
    public static void main (String [] args){
        boolean gameOver = false;
        int score = 10;
        int bonus = 200;

        int returnScore = calculateCorrectScore(gameOver, score, bonus);
        System.out.printf("\n %d the return score", returnScore);

        score = 100;
        returnScore = calculateCorrectScore(gameOver, score, bonus);
        System.out.printf("\n %d the return score", returnScore);

        gameOver = true;
        returnScore = calculateCorrectScore(gameOver, score, bonus);
        System.out.printf("\n %d the return score", returnScore);
        displayHighScorePosition();
    }
    protected static int calculateCorrectScore(boolean gameOver, int score, int bonus){
        if(!gameOver){
            return score+bonus;
        }
        return -1;
    }

    protected static void displayHighScorePosition(){
        char name = 'm';
        int score = 5000;
        int position = calculateHighScorePosition(score);
        System.out.printf("\n %s  score: %d",name, position);
    }

    protected static int calculateHighScorePosition(int score){
        if(score<500){
            return 1;
        }else if(score<=1500){
            return 2;
        }else if(score<=2500){
            return 3;
        }
        return 4;
    }
}
