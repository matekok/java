public class c020 {
    public static void main(String[] args){
        //byte
        //short
        //int
        //long
        //float
        //Double
        //char
        //Boolean

        String myString = "my test string";
        System.out.println(myString);
        myString += ", and more";
        System.out.println(myString);
        myString += " \u00ae 2015";
        System.out.println(myString);

        String mySecString = "12,23";
        mySecString += "0,34";
        System.out.println(mySecString);

        String lastString = "10";
        Integer myInt = 50;
        lastString = lastString+myInt;
        System.out.println(lastString);
        Double myDoubleNumber = 23.23;
        lastString = lastString+myDoubleNumber;
        System.out.println(lastString);
    }
}
