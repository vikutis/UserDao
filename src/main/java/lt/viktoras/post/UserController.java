package lt.viktoras.post;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/users")
public class UserController {


///ArrayList<CreateUserCommand> users = new ArrayList<>();
@Autowired
UserDao userDao;

@RequestMapping(method = RequestMethod.POST)
@ResponseStatus(HttpStatus.CREATED)
public CreateUserCommand createUser(@RequestBody final CreateUserCommand createUserCommand) {

System.out.println(createUserCommand.getUsername());
//users.add(createUserCommand);
userDao.createUser(createUserCommand);
return createUserCommand;
}


@RequestMapping(path = "/{username}", method =

RequestMethod.DELETE)

@ResponseStatus(HttpStatus.NO_CONTENT)
public void deleteUser(@PathVariable final String username) {
System.out.println("Deleting user: " + username);

}





@RequestMapping(method = RequestMethod.GET)
public List<CreateUserCommand> getUsers() {

return userDao.getUsers();

}




}
