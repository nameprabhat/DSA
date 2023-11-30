package arreys;

import java.sql.SQLOutput;
import java.util.Arrays;

public class swapnumbers {
    public static void main(String[] args) {

        int[] aa ={1,2,3};

        int[] bb ={1,2,3};

        System.out.println(aa==bb);
 /*       aa[0]=10;
        aa[5]=2;
        System.out.println(bb[5]);*/

       int [][] mm ={{1,21},{2,3}};
        System.out.println(mm[1]);
        System.out.println(mm.length);
        System.out.println("test".length());

/*
        int index1=0;
        int index2=1;
        //int numbers[]= {1,123,1,41,41,5,3,5,11,10,0};
        int numbers[] ={1,2,33,44,77,5};
        //int liss[] = swap( numbers,index1,index2);
        int liss[] = sortedlast(numbers);
        //System.out.println(Arrays.toString(liss));
*/



    }
    public static int[] swap(int[] numbers,  int a, int b){

        //int numbers[]= {1,123,1,41,41,5,3,5,11,10,0};
       // int[] array = {1, 2, 3, 4, 5};
        //swap 2 numbers in a array, index of those number will be given
        //System.out.println(array);
        int tmp =numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
        return  numbers;
    }

    public static int[] sortedlast(int[] numbers){
        //sorted list is given but last element of that is not sorted
        //put that element in its actual place with in list
        // [1,2,3,4,7,5] should become [1,2,3,4,5,7]
        //store the last element
        int ll= numbers.length -1;
        ll = numbers[ll];
        int[] myArray = new int[numbers.length];


       // System.out.println(ll);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < ll) continue;
            else
            {
                System.out.println(numbers[i]);
                System.out.println(i);
                myArray[i+1] = ll;
                System.out.println(Arrays.toString(myArray));
                break;

/*
                int[] firstHalf = Arrays.copyOfRange(numbers, 0, i);
                System.out.println(Arrays.toString(firstHalf));
                int[] secondHalf = Arrays.copyOfRange(numbers, i , numbers.length-1);
                System.out.println(Arrays.toString(secondHalf));*/

                // create a array with size of existing array
                //iternate over array firstHalf , number



            }
        }


        return numbers;
    }


}


