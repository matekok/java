public class c021 {
    public static void main(String[] args) {
        int result = 1 + 2;
        int PreviousResult = result;
        result =result-1;
        System.out.printf("%d - 1 : %d \n", PreviousResult, result);

        PreviousResult = result;
        result =result*10;
        System.out.printf("%d * 10 : %d \n", PreviousResult, result);

        PreviousResult = result;
        result =result/5;
        System.out.printf("%d / 5 : %d \n", PreviousResult, result);

        PreviousResult = result;
        result =result%3;
        System.out.printf("%d div 3 : %d \n", PreviousResult, result);

        result = result+1;
        System.out.println("result is:"+ result);
        result++;
        System.out.println("result is:"+ result);
        result--;
        System.out.println("result is:"+ result);

        result+=2;
        System.out.println("result is:"+ result);

        result*=10;
        System.out.println("result is:"+ result);

        result-=10;
        System.out.println("result is:"+ result);

        result /= 10;
        System.out.println("result is:"+ result);

        boolean isAlien = false;

        if(isAlien==false)
            System.out.println("It is't alien! ");

        int TopScore = 100;
        if(TopScore == 100){
            System.out.println("it's top score");
        }
        if(TopScore>=100){
            System.out.println("It's equal or more then top score");
        }
        if(TopScore!=100)
            System.out.println("It's note 100");
        int SecTopScore = 60;
        if((TopScore >= SecTopScore) && (TopScore <=100)){
            System.out.println("Multiple is true");
        }

        if((TopScore>80) || (SecTopScore < 100)){
            System.out.println("multiple or TRUE");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("this is true");
        }

        boolean isCar = true;
        boolean wasCar = isCar?true:false;
        if(isCar) System.out.println("is car");
        if(wasCar) System.out.println("wasCar");

        //create a Double variable with 20
        double chalangeDouble = 20d;
        //create a secound variable (double) with value 80
        double chalangeDoubleSec = 80d;
        //add both number up and multiple by 25
        double chalangeValue = chalangeDouble+chalangeDoubleSec*25;
        System.out.println(chalangeValue);

        double chalangeValueSecound = chalangeValue % 40;
        if(chalangeValueSecound<=20) System.out.println("total was over the limit");


    }
}
