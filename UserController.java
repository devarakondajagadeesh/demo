
public class UserController {
	
	public User createUser(User user) {
		System.out.println("createUser :");
		System.out.println(user.userId);
		System.out.println(user.userName);
		System.out.println("created user succesfully");
		return user;
	}

}
