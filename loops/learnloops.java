package loops;

import java.util.Scanner;

public class learnloops {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();*/
        //System.out.println("printing table for your number "+ n );
/*        System.out.println( "prinint a sum till " + n);
        int sum = 0;
        int formula = 0;
        formula = n * (n+1)/2;
        System.out.println(formula);*/

        for (int i = 0; i < 20; i++) {

            if (i==2 || i==10 || i>15) continue;
            System.out.println("running " + i);
            /*if(i>=15)break;*/
        }


        /*for (int j=1, alll = 0 ; j <=n ; j++) {

            //sum = sum + j;
            sum += j;
            // alll  = alll +j;
            alll += j;
            if (j==n){
                System.out.println(alll);  // to only print when loop is going to end showing final total

            }

                    }

        System.out.println(sum);*/

/*       for (int i=1 ;i<11;i++){

            System.out.println( n + " * " + i + " = " +  n*i );


        }*/

/*        for(int i=0; i<=100; i++) {

            System.out.println("hello"+ i+  "words");
        }
        System.out.println("hello world");*/
    }
}
