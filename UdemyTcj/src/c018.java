public class c018 {
    public static void main(String[] args){
        //width of integer is 32 (it is 4 bytes)
        int IntValue= 5/3;
        //width of float is 32 (4byte)
        float FloatValue = 5f/3f;
        //width of double is 64 (8byte)
        double DoubleValue = 5d/3d;
        System.out.println("my intValue: "+IntValue);
        System.out.println("my floatValue: "+ FloatValue);
        System.out.println("my doubleValue: "+ DoubleValue);

        //convert a given number of pounds to kilograms
        // 1. create a variable to number of pounds
        // 2. calculate the number of kilogram and store that in variable
        // 3. print the result
        //
        // note 1 pounds is equal is 0.45359237 kilogram

        float ph = 20f;
        float phToKg = 0.453_592_37f;
        double kg = ph*phToKg;

        System.out.println(ph+" is "+kg+" kg");
    }
}
