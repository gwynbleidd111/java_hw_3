/**
 * Задача №2_____________________________________________________________
 * */
import java.util.ArrayList;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println(getRandomList());
        System.out.println(removeEvenNumbers(getRandomList()));
    }

    private static List<Integer> getRandomList() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int number = (int) (Math.random() * (100) + 1);
            array.add(number);
        }
        return array;
    }

    private static List<Integer> removeEvenNumbers(List<Integer> array) {
        for (int i = 0; i < array.size();) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            } else {
                i++;
            }
        }
        return array;
    }
}
