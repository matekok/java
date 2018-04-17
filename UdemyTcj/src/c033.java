public class c033 {
    public static void main (String [] args){
        /*int count = 0;
        while(count != 5){
            System.out.println("count: "+count);
            count++;
        }

        for(int i = 0; i!=5; i++){
            System.out.println("count: "+i);
        }

        count = 0;
        while (true){
            if(count == 5) break;
            System.out.println("count: "+count);
            count++;
        }
        System.out.println("do while");
        count = 0;
        do{
            System.out.println("count "+count);
            count++;
        }while(count != 6);*/

        int count = 1;
        int CO = 0;
        while(count<=100){
            count++;
            if(!isEvenNumber(count)) continue;
            System.out.println(count+" is even ");
            CO++;
            if(CO==5)break;
            //count++;
        }
        System.out.println(CO);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}
