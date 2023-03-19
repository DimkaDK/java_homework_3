//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package java_homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;


public class task_3 {
    public static void main(String[] args){

        Random random = new Random();
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            list.add(random.nextInt(1, 11));
        }
        System.out.println(list.toString());

        int max = Collections.max(list);
        int min = Collections.min(list);
        OptionalDouble average = list.stream().mapToInt(a -> a).average();
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
        System.out.println("Среднее арифметическое: " + average.getAsDouble());
    }
}
