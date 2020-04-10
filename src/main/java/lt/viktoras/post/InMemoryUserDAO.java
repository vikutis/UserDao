package lt.viktoras.post;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserDAO implements UserDao {

	private final List<CreateUserCommand> users = new CopyOnWriteArrayList<>();

	@Override
	public List<CreateUserCommand> getUsers() {

		return users;

	}

	@Override
	public void createUser(CreateUserCommand user) {
		users.add(user);

	}

	@Override
	public void deleteUser(String username) {
		for (CreateUserCommand user : users) {

			if (username.equals(user.getUsername())) {
				users.remove(user);
				break;

			}

		}

	}

}