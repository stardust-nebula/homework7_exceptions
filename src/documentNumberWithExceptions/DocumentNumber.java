package documentNumberWithExceptions;

public class DocumentNumber {


    public static void isNewSequenceExistInExisting(String str, String newSeq) throws DocumentNumber_Exceptions {
        // Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        // Привела строку к .toLowerCase для случаев с буквами, чтобы проверять не учитывая регистр.

        String strLowerCase = str.toLowerCase();
        String newSeqLowerCase = newSeq.toLowerCase();

        if (newSeqLowerCase.equalsIgnoreCase("abc") || newSeqLowerCase.equalsIgnoreCase("555")) {

            if (strLowerCase.contains(newSeqLowerCase)) {
                System.out.println("Подстрока " + newSeq + " входит в " + str + " (не учитывая регистр для букв)");
            } else {
                throw new DocumentNumber_Exceptions(newSeq, "не входит в строку");
            }
        } else {
            throw new DocumentNumber_Exceptions(newSeq, "По заданию должна быть другая строка для сравнения с номером документа.");
        }

    }

    public static void isDocNumberEndsOnEnteredSeq(String str, String newSeq) throws DocumentNumber_Exceptions {
        // Проверить заканчивается ли номер документа на последовательность 1a2b.
        // Привела строку к .toLowerCase для случаев с буквами, чтобы проверять не учитывая регистр.

        String strLowerCase = str.toLowerCase();
        String newSeqLowerCase = newSeq.toLowerCase();

        if (strLowerCase.endsWith(newSeqLowerCase)) {
            System.out.println(str + " номер документа содержит " + newSeq + " (не учитывая регистр для букв)");
        } else {
            throw new DocumentNumber_Exceptions(newSeq, "Номер документа не содержит заданную последовательность (не учитывая регистр для букв)");
        }

    }


}
