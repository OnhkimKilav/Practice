package Mockito.Service;

import Mockito.DAO.UserDAO;
import Mockito.Model.User;

public class UserService {
    private UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public boolean checkUserPresence(User user) throws Exception {
        User u = dao.getUserByUserName(user.getUserName());

        return u != null;
    }
}
