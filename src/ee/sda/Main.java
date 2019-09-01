package ee.sda;

public class Main {

    public static void main(String[] args) {
//	CASTING

        byte byteValue = 2;
        short shortValue = 4211;
        int intValue = 123214;
        long longValue = 50000L + 10L * (byteValue + shortValue);

        System.out.println(longValue);


        short shortTotal = (short) (1000+10 * (byteValue + shortValue + intValue));

        System.out.println(shortTotal);


    }
}
