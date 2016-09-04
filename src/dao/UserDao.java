package dao;

import entity.User;

public interface UserDao {
	
	boolean checkUserExistsByUname(String uname);

    void save(User user);
}
