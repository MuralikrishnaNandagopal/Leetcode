package leetcode;

public class MonotonicArray {

    public static void main(String[] args) {

        int[] A = {1,2,3,4,5,6,9};
        boolean output = isMono(A);
        System.out.println(output);

    }

    public static boolean isMono(int[] A){

        boolean inc = true;
        boolean dec = true;

       for (int i=0; i<A.length-1; i++)
       {

           if(A[i] > A[i+1]){
               inc = false;
           }

           if(A[i] < A[i+1]){
               dec = false;
           }


       }
            return inc || dec;
    }


}
