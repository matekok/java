public class c029 {
    public static void main(String [] args){
        calculateScore(100000);
        int newScore = calculateScore("mat", 1000);
        System.out.println("the new score = "+ newScore);
        double cm = calcFeetAndInchesToCentimeters(10, 10);
        System.out.println(cm);

        cm = calcFeetAndInchesToCentimeters(123);
        System.out.println(cm);
    }
    public static int calculateScore(int score){
        System.out.printf("unnamed player earn: %d  \n", score);
        return score;
    }
    public static int calculateScore(String playerName,int score){
        System.out.printf("%s earn: %d  \n", playerName, score);
        return score;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0 || inches<0 || inches>12) {
            System.out.println("invalide value");
            return -1;
        }
        double centimeter = (feet*12)*2.54;
        centimeter += inches*2.54;
        System.out.printf("%s feet %s inches = %s cm", feet, inches, centimeter);
        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("invalide value");
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        double cm = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return cm;
    }
}
