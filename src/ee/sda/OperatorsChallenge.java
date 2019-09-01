package ee.sda;

public class OperatorsChallenge {
      public static void main(String[] args) {

            double doubleOne = 20.00;
            double doubleTwo = 80.00;
            double sumMult = (doubleOne + doubleTwo) * 100.00;
            System.out.println(sumMult + " is the sum of two numbers multiplied by 100.00");

            double remainderResult = sumMult % 40.00;
            System.out.println(remainderResult + " is the remainder result");

            boolean isNoremainder = (remainderResult ==0) ;
            System.out.println("isNoremainder = " + isNoremainder);


            if (!isNoremainder) {
                  System.out.println("yeah " + !isNoremainder);
            } else {
                  System.out.println("no " + isNoremainder);
            }

      }
}
