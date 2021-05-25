package documentNumberWithExceptions;
import java.util.Scanner;

/**
 * Программа построенна на основе задания №0 темы "Строки".
 * Программа имеет собственный класс исключений, который используется для проверки последовательностей.
 */

public class Main_DocumentNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква. Например, 3652-abc-9047-mLv-5F7y.");
        String docNumber = sc.nextLine();

        System.out.println('\n');
        System.out.println("******* Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        System.out.println("Введите \"ABC\" или \"abc\" строку для сравнения с номером документа.");
        String sequence1_toCheck = sc.nextLine();
        try {
            DocumentNumber.isNewSequenceExistInExisting(docNumber, sequence1_toCheck);
        } catch (DocumentNumber_Exceptions e) {
            System.out.println("Перехваченное сообщение. " + e);
        }finally {
            sc.close();
        }

        System.out.println('\n');
        System.out.println("******* Проверить начинается ли номер документа с последовательности 555.");
        String sequence2_toCheck = "555";
        try {
            DocumentNumber.isNewSequenceExistInExisting(docNumber, sequence2_toCheck);
        } catch (DocumentNumber_Exceptions e) {
            System.out.println("Перехваченное сообщение. " + e);
        }

        System.out.println('\n');
        System.out.println("******* Проверить заканчивается ли номер документа на последовательность 1a2b.");
        String sequence3_toCheck = "1a2b";
        try {
            DocumentNumber.isDocNumberEndsOnEnteredSeq(docNumber, sequence3_toCheck);
        } catch (DocumentNumber_Exceptions e) {
            System.out.println("Перехваченное сообщение. " + e);
        }





    }
}
