package dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;

import entity.User;

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
    public HibernateTemplate getHibernateTemplate() {
         return hibernateTemplate;
    }
   
    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
         this.hibernateTemplate = hibernateTemplate;
    }
	@Override
	public boolean checkUserExistsByUname(String uname) {
		String sql = "from User where uname = '"+uname+"'";
        List list = (List) hibernateTemplate.find(sql);
        if(list!=null&&list.size()>0){
             return true;
        }
       return false;
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}

}
