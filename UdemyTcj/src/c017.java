public class c017 {
    public static void main(String[] args){
        //integer has a width of 32
        int myValues = 2_147_483_647;
        int myNewInt= (myValues/2);
        System.out.println("my total = "+myNewInt);

        //byte has a width of 8
        byte myByteValue = 127;
        byte myNewByte = (byte) (myByteValue/2);
        System.out.println("the: "+myNewByte);

        //sort ha a width of 16
        short myShortValue = 32_767;
        short myNewShort = (short) (myShortValue/2);
        System.out.println(myNewShort);

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        System.out.printf("test %d", myLongValue);


        byte myByte = 30;
        short myShort = 3;
        int myInt = 20;
        long myTotal = 50000L+10L*(myByte+myShort+myInt);
        System.out.printf("\n the number is %d", myTotal);
    }
}
