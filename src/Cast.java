public class Cast {

    public static void main(String[] args) {

        char ch = 'a';
        byte bt = 126;
        short sh = 250;
        int i = 600;
        long l = 4657567L;

        float fl = 10.1245362450f;
        double dbl = 23.2345678901234567d;

        int castByteToInt = bt;
        int castShortToInt = sh;
        int castLongToInt = (int) l;


        double floatToDouble = fl;
        float doubleToFloat = (float) dbl;

        int castFloatToInt = (int) fl;

        System.out.println(castFloatToInt);

    }
}


