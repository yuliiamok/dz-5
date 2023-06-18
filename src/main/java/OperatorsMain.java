public class OperatorsMain {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 6;
        int d = 5;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean compareResult1 = sum1 < sum2;
        System.out.println("sum1 < sum2 = " + sum1 + " < " + sum2 + " = " + compareResult1);

        sum1 += 1 ;
        sum2 -= 2;

        boolean compareResult2 = sum1 > sum2;
        System.out.println("sum1Incremented > sum2Decremented = " + sum1 + " > " + sum2 + " = " + compareResult2);

        if (sum1 % 2 == 0 || sum2 % 2 == 0) {
            System.out.println("OR: result after modulus operation is: True");
        } else {
            System.out.println("OR: result after modulus operation is: False");
        }
    }
}
