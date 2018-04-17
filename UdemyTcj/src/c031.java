public class c031 {
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("the value is the one");
                break;
            case 2:
                System.out.println("the value is teh two");
                break;
            default:
                System.out.println("else");
                break;
        }

        char val = 'C';

        switch (val){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                //System.out.println("this are found");
                System.out.printf("this is %c", val);
                break;
                default:
                    System.out.println("not found");
                    break;
        }

        String StrVal = "January";
        switch (StrVal.toLowerCase()) {
            case "november":
            case "december":
            case "january":
            case "february":
                System.out.printf("this monts is in winter: %s", StrVal);
                break;
        }
    }
}
