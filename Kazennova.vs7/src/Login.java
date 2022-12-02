public class Login {
    public static boolean login(String login, String password, String confirmPassword){
        try {
            if (!login.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d_]).+")){
                throw new WrongLoginException("Используйте только латинские буквы, цифры и нижнее подчеркивание!");
            } if (login.length() > 21){
                throw new WrongLoginException("Логин должен содержать не более 20 символов!");
            } if (!password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d_]).+")){
                throw new WrongPasswordException("Используйте только латинские буквы, цифры и нижнее подчеркивание!");
            } if (password.length() > 21){
                throw new WrongPasswordException("Пароль должен содержать не более 20 символов!");
            } if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли должны совпадать!");
            }

        }
        catch (WrongLoginException | WrongPasswordException e){
            System.err.println(e);
            return false;
        }
        return true;
    }

}
