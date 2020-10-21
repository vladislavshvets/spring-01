package spring.intro.dao;

import java.util.List;
import spring.intro.model.User;

public interface UserDao {
    void add(User user);

    User findById(Long id);

    List<User> listUsers();
}
