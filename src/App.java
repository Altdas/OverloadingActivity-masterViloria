public class App {
    public App() {
    }

    /**
     * modifying methods to computeSum()
     */
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * method to return greater int value
     */
    public static int greaterValue(int Num1, int Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }
    /**
     * method to return greater double value
     */
    public static double greaterValue(double Num1, double Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * using overloading
         */

        System.out.println("Sum of two numbers 20 and 30: " + computeSum(20, 30));
        System.out.println("Sum of three numbers 20, 30 , 40: " + computeSum(20, 30, 40));
        System.out.println("================================================");
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 59 and 66 is " + greaterValue(59,66));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 1.2 and 6.6 is " + greaterValue(1.2,6.6));

    }
}