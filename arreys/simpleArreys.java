package arreys;

public class simpleArreys {

    public static void main(String[] args) {
       // int[] numberss ={1,2,3,};

/*
        Integer maxNumber = Integer.MAX_VALUE;
        Integer miiii = Integer.MIN_VALUE;*/

        //initialize a array, declare it as well

        //int numbers[]= {1,123,1,41,41,5,3,5,11,10,0};

        //loop to calculate sum
/*        int sum = 0;

        for (int ind: numbers) {
            System.out.println(ind); //priniting all numbers

            sum += ind;
                    }
        System.out.println("total sum " + sum);*/


        // findout smallest number
        int numbers[]= {1,123,1,41,41,5,3,5,11,10,0};


        int resultmin = numbers[0];   // assuming minimum is first element of array
        int resultmax = numbers[0];   // assuming minimum is first element of array
        for (int small: numbers
             ) {
            if (small < resultmin)
                resultmin = small;

        }
        for (int max: numbers
             ) {

            if (max > resultmax )
                resultmax = max;

        }
        System.out.println("min is  "+resultmin);
        System.out.println("max is  " +resultmax);
    }
}
