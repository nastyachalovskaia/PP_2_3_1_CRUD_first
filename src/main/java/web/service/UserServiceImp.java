package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Override
    public void update(Long id, User updatedUser) {
        userDao.update(id, updatedUser);
    }
}
