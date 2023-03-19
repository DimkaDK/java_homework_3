//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package java_homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_2 {
    public static void main(String[] args){

        Random random = new Random();
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(1, 11));
        }
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;              
            }
        }
        System.out.println(list.toString());        

    }
}
