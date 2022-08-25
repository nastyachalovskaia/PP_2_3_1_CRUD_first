package web.service;

import web.model.User;

import javax.persistence.Id;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    void delete(Long id);

    User show(Long id);

    void update(Long id, User updatedUser);



}
