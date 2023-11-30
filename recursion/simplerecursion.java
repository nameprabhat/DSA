package recursion;

public class simplerecursion {

    public static void main(String[] args) {

        System.out.println(sumrecusion(100));
        // formula to calculate sum of contineous n numbers...
        int n =100;
        int summ = n * (n+1)/2;
        System.out.println(summ);
    }

    static int sumrecusion(int a){
        if (a ==1) return 1;
        return sumrecusion(a-1) + a;

    }
}
