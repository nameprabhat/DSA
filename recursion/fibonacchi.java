package recursion;

import java.util.Arrays;

public class fibonacchi {
    public static void main(String[] args) {
        // f(n) = f(n-1) + f(n-2)  ;;; and f(0)= 0; f(1) =1;
        //function takes a integer value and return a list of fibonacchi till that number
        long inputNumber = 60;
        //creating a array and putting values on it as -1.
        System.out.println(fibbb(inputNumber));
    }

    //declaring a list and storing the values of fibbonaci into it..
    // //.but need to find out how to put input values inside it...like instead of giving value 61 provide some variable
    public static long[] memoizationTable =new long[61];

    static long fibbb(long n ){
        if (n <= 1) {
            return n;
        }
        //System.out.println("input array " + Arrays.toString(memoizationTable));

        if (memoizationTable[(int)n] != 0) {
            return memoizationTable[(int)n];
        }
        long result = fibbb(n-1) + fibbb(n-2);
        memoizationTable[(int)n] = result;
        return result;


    }
}
