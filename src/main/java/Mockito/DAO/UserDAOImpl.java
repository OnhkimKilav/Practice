package Mockito.DAO;

import Mockito.Model.User;

import java.util.Arrays;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private List<User> users;

    public UserDAOImpl() {
        this.users = Arrays.asList(
                new User("valik@gmail.com", "GUEST"),
                new User("andrey@gmail.com", "GUEST"),
                new User("vitalik@gmail.com", "GUEST")
        );
    }

    @Override
    public User getUserByUserName(String userName) throws Exception {
        return users.stream().filter(u -> u.getUserName().equals(userName)).findAny().orElse(null);
    }
}
