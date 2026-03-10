package sessoin3.Bai1;

import java.util.List;

record User(String username,String email, String status){}
public class RecordMain {
        public static void main(String[] args){

            List<User> users = List.of(
                    new User("nguyen", "nguyen@email.com", "ACTIVE"),
                    new User("trang", "trang@email.com", "INACTIVE"),
                    new User("minh", "minh@email.com", "ACTIVE")
            );
            users.forEach(user -> System.out.println(
                    user.username() + "-"+
                            user.email()+"-"+
                                user.status()
            )
            );
        }
}
