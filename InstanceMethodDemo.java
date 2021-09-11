
public class InstanceMethodDemo {
	
	public static void main(String args[]) {
		User usr = new User();
        usr.age();
        System.out.println("age :" + usr.age);
		usr.userName();
		usr.firstName();
		System.out.println(usr.userName);
		System.out.println(usr.lastName);
		usr.phoneNumber();
		usr.lastName();
	
		
		}
	
}
