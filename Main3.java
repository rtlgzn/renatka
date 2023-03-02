import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
public class Main3{
    public static void main(String[] args) {
        //задача 6
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors: " + colors);

        //задача 7
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        if (list1.equals(list2)) {
            System.out.println("одинаковые");
        } else {
            System.out.println("разные");
        }

        //задача 8
        int newNumber = 5;
        list1.set(1, newNumber);

        System.out.println("Numbers: " + list1);

        //задача 9
        LinkedList<String> colorss = new LinkedList<>();
        colorss.add("красный");
        colorss.add("зеленый");
        colorss.add("зеленый");
        colorss.add("желтый");
        colorss.add("зеленый");

        String colorToFind = "зеленый";
        int firstIndex = colorss.indexOf(colorToFind);
        int lastIndex = colorss.lastIndexOf(colorToFind);

        System.out.println("первый по счету " + colorToFind + ": " + firstIndex);
        System.out.println("второй по счету " + colorToFind + ": " + lastIndex);

        //задача 10
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Before: " + colors);

        String temp = colors.get(1);
        colors.set(1, "Purple");
        colors.set(3, temp);

        System.out.println("After: " + colors);

        //задача 11
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> set3 = new HashSet<>(set1);
        set3.retainAll(set2);

        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);
        System.out.println("Одинаковые элементы: " + set3);

        //задача 12
        if (set1.isEmpty()) {
            System.out.println("HashSet пустой");
        } else {
            System.out.println("HashSet не пустой");
        }

        //задача 13
        Set<Integer> newSet = new HashSet<>(set1);
        System.out.println("HashSet new: " + newSet);

        //задача 14
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        boolean containsValue = hashMap.containsValue(2);
        if (containsValue) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
