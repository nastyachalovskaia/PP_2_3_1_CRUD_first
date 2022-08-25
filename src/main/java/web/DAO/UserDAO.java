package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    private static int USERS_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++USERS_COUNT, "John", "Wick", (byte) 42));
        users.add(new User(++USERS_COUNT, "Ada", "Wong", (byte) 30));
        users.add(new User(++USERS_COUNT, "Elza", "Jin", (byte) 25));
    }

    public List<User> index() {
        return users;
    }

    public User show(long id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++USERS_COUNT);
        users.add(user);
    }

    public void update(long id, User updatedUser) {
        User userToBeUpdated = show(id);
        userToBeUpdated.setName(updatedUser.getName());

    }

}
