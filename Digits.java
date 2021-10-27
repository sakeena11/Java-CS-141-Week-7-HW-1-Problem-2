public class Digits {
    public static int sumOfDigits(int n) {
        //TODO: complete this method
        if (n < 10) {
            return n; }
        else {
            int x = (n % 10);
            int y = (n / 10);
            return x + sumOfDigits(y);
        }
    }


    public static void main(String[] args) {
        //optional main method if you want to use it to test your code
        //offline.  you do not need to complete it for this assignment
        //Mimir will test only the above method
    }
}