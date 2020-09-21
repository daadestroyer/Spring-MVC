package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional // to enable writing mode
	public int createUser(User user) {
		int res = (Integer)this.hibernateTemplate.save(user);
		return res;
	}
}
