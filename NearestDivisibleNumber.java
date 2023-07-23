public class NearestDivisibleNumber {

    public static int findNearestDivisible(int num, int m) {
        int lowerDivisible = num - (num % m); 
        int higherDivisible = lowerDivisible + m; 

        if (Math.abs(num - lowerDivisible) <= Math.abs(num - higherDivisible)) {
            return lowerDivisible;
        } else {
            return higherDivisible;
        }
    }

    public static void main(String[] args) {
        int num = 67;
        int m = 8;
        int result = findNearestDivisible(num, m);
        System.out.println("The nearest number divisible by " + m + " and closest to " + num + " is: " + result);
    }
}
