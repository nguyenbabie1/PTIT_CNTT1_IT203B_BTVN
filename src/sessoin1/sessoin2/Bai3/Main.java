package sessoin2.Bai3;

public class Main {
    public static void main(String[] args) {

        Authenticatable user = new User("123456");

        System.out.println("Authenticated: " + user.isAuthenticated());

        String encrypted = Authenticatable.encrypt("123456");

        System.out.println("Encrypted password: " + encrypted);
    }
}