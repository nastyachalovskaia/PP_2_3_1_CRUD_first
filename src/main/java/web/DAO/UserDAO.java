package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(0,"John", "Wick", (byte) 42));
        users.add(new User(1, "Ada", "Wong", (byte) 30));
        users.add(new User(2, "Elza", "Jin", (byte) 25));
    }

   public List<User> index() {
        return users;
   }

   public User show (long id) {
    return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
   }


}
