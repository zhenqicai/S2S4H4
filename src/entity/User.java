package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	private int id;
    private String uname;
    private String pwd;
    @Id
    @GeneratedValue
    public int getId() {
         return id;
    }
    public void setId(int id) {
         this.id = id;
    }
    public String getUname() {
         return uname;
    }
    public void setUname(String uname) {
         this.uname = uname;
    }
    public String getPwd() {
         return pwd;
    }
    public void setPwd(String pwd) {
         this.pwd = pwd;
    }

}
