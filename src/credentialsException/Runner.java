package credentialsException;
import static credentialsException.CredentialsValidation.*;

/**
 * Программа проверяет валидные ли login, password и confirmPassword.
 * Критерии валидности указаны в условии задачи.
 */

public class Runner {

    public static void main(String[] args) {

        try {
            isCredentialsValid("myLogin", "s1f", "s1f");
            System.out.println("Данные для учетной записи соответствуют требованиям.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Перехваченнное сообщение: " + e);
        }

    }
}

