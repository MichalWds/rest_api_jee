package rest_api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("users")
public class UserController {


 @Path("all")
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public String getUsers() throws JsonProcessingException {

     ObjectMapper objectMapper = new ObjectMapper();
     objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);   //ustawienie serializacji objektow java na json
     return objectMapper.writeValueAsString(UserDao.getUsers());




 }


}
