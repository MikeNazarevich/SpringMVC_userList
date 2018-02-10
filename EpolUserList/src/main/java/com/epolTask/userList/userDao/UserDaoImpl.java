package com.epolTask.userList.userDao;

import com.epolTask.userList.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    User user = new User("1", "sanek", "aristarhovich");
    User user1 = new User("2", "atulber", "bayan");
    User user2 = new User("3", "maga", "zamirovich");
    private List<User> users = Arrays.asList(user, user1, user2);

    public List<User> getAllUsers() {
        return users;
    }

    public void delete(String id) {
        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getId().toString() == id.toString()) {
                System.out.println("remove: " + id);
                users.remove(i);
            }
        }
    }
}
