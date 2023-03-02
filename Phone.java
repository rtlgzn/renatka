import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone{
    private Map<String, String> contacts;

    public Phone() {
        this.contacts = new HashMap<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Телефонная книга:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Просмотреть все контакты");
            System.out.println("3. Обновить контакт");
            System.out.println("4. Поиск контакта по имени");
            System.out.println("5. Выход");

            System.out.print("Введите номер операции: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    updateContact(scanner);
                    break;
                case 4:
                    searchContact(scanner);
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Некорректный ввод. Повторите попытку.");
            }
        }
    }

    private void addContact(Scanner scanner) {
        System.out.print("Введите имя контакта: ");
        String name = scanner.next();
        System.out.print("Введите телефонный номер: ");
        String phone = scanner.next();
        contacts.put(name, phone);
    }

    private void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Контактов нет.");
            return;
        }
        System.out.println("Контакты:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private void updateContact(Scanner scanner) {
        System.out.print("Введите имя контакта для обновления: ");
        String name = scanner.next();
        if (!contacts.containsKey(name)) {
            System.out.println("Контакт не найден.");
            return;
        }
        System.out.print("Введите новый телефонный номер: ");
        String phone = scanner.next();
        contacts.put(name, phone);
    }

    private void searchContact(Scanner scanner) {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.next();
        if (!contacts.containsKey(name)) {
            System.out.println("Контакт не найден.");
            return;
        }
        System.out.println("Результаты поиска:");
        System.out.println(name + " - " + contacts.get(name));
    }
}
