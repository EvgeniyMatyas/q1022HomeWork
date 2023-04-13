package homeWork1;

import java.util.Scanner;

public class Exit {
    public void Exit() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово:");
            String newWord = scanner.nextLine().toLowerCase();
            if (newWord.equals("exit")) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Вы ввели:" + newWord);
            }
        }
    }
}
