package homeWork1;

import java.util.Scanner;

public class VowelConstantIf {
    public void VowelConstantIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву:");
        char symbol = scanner.nextLine().toLowerCase().charAt(0);
        if(symbol == ('a') || symbol == ('e') || symbol == ('i') || symbol == ('o') || symbol == ('u')){
            System.out.println(symbol + " - гласная буква");}
        else{ System.out.println(symbol + " - согласная буква");}
    }
}
