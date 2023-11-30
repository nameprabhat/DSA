package arreys;
import java.util.Arrays;
public class orderArreys {

    public static void main(String[] args) {

        int[] numbers ={11,22,34,55,67,68,35};


        System.out.println("input array " + Arrays.toString(numbers));
        order(numbers);
    }
    public static void order(int[] llll) {
        //sorted list is given but last element of that is not sorted
        //put that element in its actual place with in list
        // [1,2,3,4,7,5] should become [1,2,3,4,5,7]
        //store the last element
        int last = llll[llll.length-1];
        System.out.println("last digit is "+ last);
        //find out the index number where this last variable will be stored

        int acutalindex = 0;

        while (llll[acutalindex] < last  ){
            acutalindex++;
            //System.out.println(acutalindex);
        }
        System.out.println("actual index place for last digit is "+ acutalindex);

        //rearrange array so that all values are in increasing order
        //{1,2,34,55,67,69};
        // loop will start from length -1 and will go on till acualindex +2 value
        //{a[0],a[1],a[2],a[3],a[4],a[5]};
        ///{1,2,34,55,67,12}; for this acualindex is 2 so:
        // a[5]=a[4], a[4]=a[3], a[3]=a[2]

        for (int i = llll.length -1; i >= acutalindex + 2; i--) {
            llll[i] = llll[i-1];
        }
        // putting last variable in correct order
        llll[acutalindex] = last;

        System.out.println(Arrays.toString(llll));

    }
}
