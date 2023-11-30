package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] ll = {9,5,3,1,2};
        selcionSort(ll);
    }
    ///this code does selection sort also explains use of print statement to fetch values
    // at different point in time in loop
    //print can be helpful to understand how loop is working..
    public static void selcionSort(int[] listt){
        int len = listt.length;
       // System.out.println(len);
        // intitaing a loop to go from index 0 to last index
        for (int i = 0; i < len - 1; i++) {
            int min = i ;
            System.out.println("outerloop starts with " + min );
            System.out.println("current array "+ Arrays.toString(listt));

            for (int j = i+1; j < len;  j++) {
                //System.out.println(listt[j]);
                //System.out.println(listt[i]);
                // i was adding listt[i] in below condition which make it very hard for me understand what was happening
                //and why i was not able to write a simple loop
                // this suggests that even small mistakes can make you loose confidance
                // if conition to check if current element in list is lower than min selected
                if (listt[j] < listt[min]){
                    min = j;
                    //System.out.println("miniumvalue");
                    //System.out.println("minimum index is " +min);
                    //System.out.println("minimum value is " +listt[min]);
                }
            }
            int tmp = listt[min];
            listt[min] = listt[i];
            listt[i] = tmp;
            System.out.println("looped change array to  "+ Arrays.toString(listt));
            // here min is now j smallest element
            System.out.println("outerloop ends finding out min value and replacing " + listt[min] + " with index " + listt[i] );
            System.out.println("outerloop ends finding out min index and replacing index " + min + " with index " + i );
        }
        System.out.println("final array  "+Arrays.toString(listt));
    }
}