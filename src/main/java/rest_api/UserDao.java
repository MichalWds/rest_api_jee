package rest_api;

import java.util.ArrayList;
import java.util.List;

//data acces object
public class UserDao {

 public static List <User> getUsers(){              //static by nie tworzyc obiektu

     List <User> users = new ArrayList<User>();

     users.add(new User(1, "Maciek", "maciek@maciek.pl" , "haslo"));


     return users;
 }

}
