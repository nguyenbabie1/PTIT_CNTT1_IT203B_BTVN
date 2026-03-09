package sessoin2.Bai1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class  UserMain {
    public static void main(String[] args) {
     User user = new User("adminUser","admin@email.com","ADMIN");

        Predicate<User> isAdmin = u ->u.getRole().equals("ADMIN");

        Function<User,String>getUsername = u ->u.getUsername();

        Consumer<User>printUser =u -> System.out.println("Username: " + u.getUsername() +", Email: " + u.getEmail() +", Role: " + u.getRole());

        Supplier<User> defaultUser = () -> new User("guest", "guest@email.com", "USER");

        System.out.println("Is Admin: " + isAdmin.test(user));

        System.out.println("Username: " + getUsername.apply(user));

        printUser.accept(user);

        User newUser = defaultUser.get();
        System.out.println("\nDefault User Created:");
        printUser.accept(newUser);
    }
}