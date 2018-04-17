public class c026 {
    public static void main(String[] args){
        boolean GameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int savedFinalScore = 0;

        /*if(score<5000 && score>1000){
            System.out.printf("your score: %d", score);
        }else if(score <1000){
            System.out.println("your score less then 1000");
        }else{
            System.out.println("Game over");
        }*/
        calculateFinalScore(GameOver, score, bonus, levelCompleted);


//        if(GameOver){
//            int finalScore = score +(levelCompleted*bonus);
//            savedFinalScore = finalScore;
//            System.out.printf("Your final score is %d", finalScore);
//        }
//        System.out.printf("Saved final score: %d", savedFinalScore);


        score = 10000;
        bonus = 200;
        levelCompleted = 8;
        calculateFinalScore(GameOver, score, bonus, levelCompleted);
//        System.out.printf("Saved final score: %d", savedFinalScore);

    }
    public static void calculateFinalScore(boolean GameOver, int score, int bonus, int levelCompleted){
        if(GameOver){
            int finalScore = score +(levelCompleted*bonus);
         //   savedFinalScore = finalScore;
            System.out.printf("\nYour final score is %d", finalScore);
        }
    }
}
