package homeWork1;

import java.util.Scanner;

public class SeasonMonth {
    public void SeasonMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String month = scanner.nextLine().toLowerCase();
        switch (month) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println(month + " - это зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println(month + " - это весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println(month + " - это лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println(month + " - это лето");
                break;
            default:
                System.out.println(month + " - некорректное название месяца");
        }
    }
}
