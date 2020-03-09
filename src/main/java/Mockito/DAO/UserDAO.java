package Mockito.DAO;

import Mockito.Model.User;

public interface UserDAO {
    User getUserByUserName(String userName) throws Exception;
}
