package sessoin2.Bai2;

public class Main {

    public static void main(String[] args) {

        // Lambda expression
        PasswordValidator validator = password -> password.length() >= 8;

        // Test mật khẩu
        System.out.println(validator.validate("12345678"));
        System.out.println(validator.validate("1234"));
    }
}