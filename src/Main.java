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

    public static void main(String[] args) {
        int[] arr = {5,1,12,-5,16};
        selectSort(arr);
    }
}
