package com.retalia.daos;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.retalia.models.User;
import com.retalia.utils.HibernateUtil;

@Repository("userDao")
public class UserDao extends GenericDao {

	public User getMe() {
		return (User) this.get(User.class, "0");
	}

	public List<User> getFriends() {
		List<User> friends= (List<User>) this.get(User.class);
		friends.remove(0);
		return friends;
	}

	public User getUserByID(String id) throws Exception {
		User user=(User) this.get(User.class,id);
		if (user!=null){
			return user;
		}else{
			throw new Exception("El usuario no existe");
		}
	}

}
