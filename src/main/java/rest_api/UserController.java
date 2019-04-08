package rest_api;

import java.util.List;

public class UserController {

 public List<User> getUsers(){

     return UserDao.getUsers();

 }


}
