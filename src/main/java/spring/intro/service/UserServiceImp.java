package spring.intro.service;

import java.util.List;
import org.springframework.stereotype.Service;
import spring.intro.dao.UserDao;
import spring.intro.model.User;

@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
