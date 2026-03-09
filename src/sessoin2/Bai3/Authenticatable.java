package sessoin2.Bai3;

@FunctionalInterface
public interface Authenticatable {
    String getPassword();
    default boolean isAuthenticated(){
        String password = getPassword();
        return password != null && !password.isEmpty();

    }
    static String encrypt(String rawPassword) {
        if (rawPassword == null) {
            return null;
        }
        return "ENC_" + rawPassword.hashCode();
    }
}
