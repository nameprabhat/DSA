package sorting;

//import java.sql.SQLOutput;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] numbers ={12,14,122,12313,11};
        buuleSort(numbers);
    }
    public static void buuleSort(int[] ll){
        // ll.length - 1 ..length -1 is to so that last index is covered
        for (int i = 0; i < ll.length - 1; i++) {
            // if //{a[0],a[1],a[2],a[3],a[4],a[5]....};
            //a[0]> a[1] then swap them
            //a[1]>a[2] then swap them
            //a[2]>a[3] then swap them
            //a[n-2]>a[n-1] then swap them  n is length of array
            System.out.println("i is "+ i);
            boolean isswap = false;
            // ll.length-i-1 ..this loop run i less time than outer loop because for each loop right element is sorted
            for (int j = 0; j < ll.length-i-1; j++) {
                System.out.println("j is "+ j);
                if (ll[j]> ll[j+1])
                {
                    int tmp = ll[j] ;
                    ll[j]=ll[j+1];
                    ll[j+1] = tmp;
                    isswap = true;
                    System.out.println(Arrays.toString(ll));
            }
            }
            if (!isswap) break; //if swapping stops no need to run outer for loop as well to save time
        }
        System.out.println(Arrays.toString(ll));

    }
}

