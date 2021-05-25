package credentialsException;

public class CredentialsValidation {


    public static boolean isCredentialsValid(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean isValid = false;
        if (isLoginValid(login) && isPasswordValid(password, confirmPassword)) {
            isValid = true;
        } else {
            isValid = false;
        }

        return isValid;
    }

    public static boolean isLoginValid(String login) throws WrongLoginException {

        if (checkLoginLength(login) && checkLoginWithSpaces(login)) {
            return true;

        } else {
            throw new WrongLoginException("\"" + login + "\"" + " - логин не соответствует требованиям");
        }

    }

    public static boolean checkLoginLength(String login) {
        int setLength = 20;
        return login.length() < setLength;
    }

    public static boolean checkLoginWithSpaces(String login) {
        boolean isValid;
        if (!login.contains(" ")) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }


    public static boolean isPasswordValid(String password, String confirmPassword) throws WrongPasswordException {

        if (checkPasswordLength(password) && checkPasswordContainsDigit(password) && checkPasswordWithSpaces(password) && checkPasswordEqualsConfirmPassword(password, confirmPassword)) {
            return true;

        } else {
            throw new WrongPasswordException("\"" + password + "\"" + " - пароль не соответствует требованиям");
        }

    }

    public static boolean checkPasswordLength(String password) {
        int setPassword = 20;
        return password.length() < setPassword;
    }

    public static boolean checkPasswordContainsDigit(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordWithSpaces(String password) {
        boolean isValid;
        if (!password.contains(" ")) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static boolean checkPasswordEqualsConfirmPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }


}
