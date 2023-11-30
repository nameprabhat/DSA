package methonds;

public class learnmethods {
    public static void main(String[] args) {
       // greet ();
        int a = 1 ;
        int b = 9;
        System.out.printf("random number between " + a + "and " + b + "is " + getRandom(a,b) );



    }
    public static  void greet(){

        System.out.println("greetings");
        System.out.println(average(12,14));
    }

    public static int average(int a , int b){

        //int avg = (a +b)/2;  //no need to add a avg variable here as value can be directly calculated

       return (a +b)/2 ;

    }

    public static int getRandom(int a, int b){
        double rr =  Math.random();

        return (int) (b * rr + a) ;



    }
}
