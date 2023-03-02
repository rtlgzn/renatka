import java.util.Scanner;
import java.util.Arrays;
public class Main5 {

    public static void main(String[] args) {
        //задача 1
        double a = 10, b = 2;
        System.out.println((a + b) + " " + (a * b) + " " + (a + b) + " " + (a / b) + " " + (a % b));
        //задача 2
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) System.out.println(i + " ");
        }
        //задача 3
        double temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        //задача 4
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = num1;

        if (num2 > max) max = num2;

        if (num3 > max) max = num3;

        System.out.println(max);

        //задача 5
        if (a > 0) System.out.println("положительное");
        System.out.println("отрицательное");


        //задача 6
        char[] charArray = {'a', 'a', 'b', 'b'};

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') charArray[i] = 'b';
        }

        //задача 7
        int[] intArray = {1, 2, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        System.out.println(sum);

        //задача 8
        Arrays.sort(intArray);
        System.out.println(intArray[intArray.length - 2]);

        //задача Shuffle String
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        System.out.println(result);

        //задача Palindrome number
        int num = 12321;
        boolean k;
        String str = Integer.toString(num);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                k = false;
            }
            left++;
            right--;
        }
        k = true;
        System.out.println(k);

        //задача Number of Steps to Reduce a Number to Zero
        int number = 14, count = 0;
        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number -= 1;
            }
            count++;
        }
        System.out.println(count);

        //задача Sum of All Odd Length Subarrays
        int mas[] = {1, 4, 2, 5, 3};
        int sum1 = 0;
        for (int len = 1; len <= mas.length; len += 2) {
            for (int i = 0; i <= mas.length - len; i++) {
                for (int j = i; j < i + len; j++) {
                    sum1 += mas[j];
                }
            }
        }
        System.out.println(sum1);

    }
}