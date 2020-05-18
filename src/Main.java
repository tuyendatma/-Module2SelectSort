import java.util.Arrays;

public class Main {
    public static void  selectSort ( int [] array) {
        int  position ;
        for  ( int  i =  0 ; i <array.length; i ++) {
            int  j = i +  1 ;
            position = i;
            int  temp = array [i];
            for  (; j <array.length; j ++) {
                if  (array [j] <temp) {
                    temp = array [j];
                    position = j;
                }
            }
            array [position] = array [i];
            array [i] = temp;
        }
        System.out.println (Arrays.toString (array) +  "selectSort" );
    }
    public static void insertionSort(int[] arr){
        for  ( int  i =  1 ; i <arr.length; i ++) {
            int  temp = arr [i];
            int  j = i -  1 ;
            for  (; j >=  0  && arr [j]> temp; j--) {
                // Moves the value greater than temp back by one unit
                arr [j +  1 ] = arr [j];
            }
            arr [j +  1 ] = temp;
        }
        System.out.println (Arrays.toString (arr) +  "insertSort" );
    }

    public static void main(String[] args) {
        int[] arr = {5,1,12,-5,16};
        selectSort(arr);
        insertionSort(arr);
    }
}
