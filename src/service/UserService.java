package service;

import entity.User;

public interface UserService {
	
	boolean exists(User user);

    void add(User user);
}
