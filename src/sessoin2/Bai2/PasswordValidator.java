package sessoin2.Bai2;

@FunctionalInterface
public interface PasswordValidator {
    boolean validate(String password);
}