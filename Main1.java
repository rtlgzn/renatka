
public class Main1 {

    public static void main(String[] args) {

        //задача 1
        for (Colors color : Colors.values()) {
            System.out.println(color);
        }

        //задача 2
        for (Weekday day : Weekday.values()) {
            printMessage(day);
        }
    }

    public static void printMessage(Weekday day) {
        String message = "Today is " + day + ". ";
        if (day.isWeekDay()) {
            message += "It's a weekday.";
        } else {
            message += "It's a holiday.";
        }
        System.out.println(message);
    }
}


