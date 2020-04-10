package lt.viktoras.post;

import java.util.List;

public interface UserDao {
List<CreateUserCommand> getUsers();
void createUser(CreateUserCommand createUserCommand);
void deleteUser(String username);

}