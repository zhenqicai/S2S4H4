package service;

import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import entity.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
    
    public UserDao getUserDao() {
    	return userDao;
    }
    @Resource
    public void setUserDao(UserDao userDao) {
    	this.userDao=userDao;
    }
	@Override
	public boolean exists(User user) {
		return userDao.checkUserExistsByUname( user.getUname());
	}

	@Override
	@Transactional
	public void add(User user) {
		userDao.save( user);
	}

}
