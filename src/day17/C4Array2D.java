package day17;

public class C4Array2D {
    public static void main(String[] args) {

        int arr[][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
       // System.out.println(arr.length);
      //  System.out.println(arr[1].length);
        for(int i = 0; i <arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
