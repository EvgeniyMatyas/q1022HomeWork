package homeWork1;

import java.util.Scanner;

public class VowelConstantSwitch {
    public void VowelConstantSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву:");
        String symbol = scanner.nextLine().toLowerCase();
        switch (symbol) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(symbol + " - гласная буква");
                break;
            default:
                System.out.println(symbol + " - согласная буква");
        }
    }
}
