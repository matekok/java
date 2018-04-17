public class c032 {
    public static void main (String [] args){
        //System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0, 2.0));

        for (int a =  2; a < 9; a++){
            System.out.println("10000 at "+a+"% interest = "+String.format("%.2f", calculateInterest(10000, a)));
        }
        for (int a=8; a>=2; a--){
            System.out.println("10000 at "+a+"% interest = "+String.format("%.2f", calculateInterest(10000, a)));
        }

        int count = 0;
        for(int i = 100; i<=10000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(count + ". prime number: " + i);
            }
            if (count == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1)return false;
        for (int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRat){
        return(amount*(interestRat/100));
    }
}
