/**
 * Задача №3_____________________________________________________________
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        
        getMaxMinMean(getRandomList());
    }
    private static List<Integer> getRandomList(){
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int number = (int) (Math.random()*(100)+1);
            array.add(number);
        }
        return array;
    }
    private static void getMaxMinMean(List<Integer> array){
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        System.out.println("Минимальное: " + array.get(0));
        System.out.println("Максимальное: " + array.get(array.size()-1));
        System.out.println("Среднее: " + array.get(array.size()/2));
    }
}
