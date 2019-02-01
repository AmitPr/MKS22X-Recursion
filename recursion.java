public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
	public static double sqrt(double n, double tolerance){
		if (n == 0)
			return 0;
		return sqrtHelper (n, 1, tolerance);
	}
	public static double sqrtHelper(double n, double current, double tolerance){
		current = ( (n / current) + current) / 2;
		if (Math.abs(((current * current) - n)) < tolerance)
			return current;
		else
			return sqrtHelper(n, current, tolerance);
	}

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n) {
		return fibHelper(n - 2, 1, 0);
	}

	public static int fibHelper(int n, int last, int last2) {
		if (n <= 0){
			return last + last2;
		}
		return fibHelper(n - 1, last + last2, last);
	}

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}