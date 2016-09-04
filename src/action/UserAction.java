package action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;
import service.UserService;

public class UserAction extends ActionSupport{
	 private String uname;
     private String pwd;
     private String repwd;
     private UserService userService;
    
     public String getUname() {
    	 return uname;
     }

     public void setUname(String uname) {
    	 this. uname = uname;
     }

     public String getPwd() {
    	 return pwd;
     }

     public void setPwd(String pwd) {
    	 this. pwd = pwd;
     }
     public String getRepwd() {
    	 return repwd;
     }

     public void setRepwd(String repwd) {
    	 this. repwd = repwd;
     }

     public UserService getUserService() {
    	 return userService;
     }
    
     @Resource
     public void setUserService(UserService userService) {
    	 this. userService = userService;
     }

     @Override
     public String execute() throws Exception {
    	 User user = new User();
         user.setUname( uname);
         user.setPwd( pwd);
         if( userService.exists( user)){
              return INPUT;
        }
         userService.add( user);
         return SUCCESS;
     }
}
