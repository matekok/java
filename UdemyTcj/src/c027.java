public class c027 {
    public static void main(String[] args){
        boolean GameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;
        finalScore = calculateScore(GameOver, score, levelCompleted, bonus, finalScore);
        System.out.printf("\nthe final score %d", finalScore);
    }
    public static int calculateScore(boolean GameOver, int score, int levelCompleted, int bonus, int finalScore){

        if(GameOver){
            finalScore = score +(levelCompleted*bonus);
        }
        System.out.printf("\nthe final score is %d", finalScore);
        return finalScore;
    }
}
