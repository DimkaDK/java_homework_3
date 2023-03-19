//Реализовать алгоритм сортировки слиянием

package java_homework_3;

import java.util.Arrays;
import java.util.Random;

public class task_1 {

    static void mergeSort(int[] array, int min, int max){

        if (max > min){
            int middle = min + (max - min) / 2;
            mergeSort(array, min, middle);
            mergeSort(array, middle + 1, max);            

            int[] buffer = Arrays.copyOf(array, array.length);

            for (int i = min; i <= max; i++){
                buffer[i] = array[i];
            }            

            int k = min;
            int j = middle + 1;

            for (int i = min; i <= max; i++){
                if (k > middle){
                    array[i] = buffer[j];
                    j++;
                }
                else if (j > max){
                    array[i] = buffer[k];
                    k++;
                }
                else if (buffer[j] > buffer[k]){
                    array[i] = buffer[k];
                    k++;
                }
                else{
                    array[i] = buffer[j];
                    j++;
                }
            }
        }
            
    }

    public static void main(String[] args){

        Random random = new Random();
        
        int[] array = new int[10];
        int min = 0;
        int max = array.length - 1;
        

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0, 10);
        }

        System.out.println(Arrays.toString(array));
        mergeSort(array, min, max);
        System.out.println(Arrays.toString(array));
    }
    
}
