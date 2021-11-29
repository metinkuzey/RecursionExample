public class Result {
    /**
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     **/
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
