
public class UserManager {
	
	
	public void add(User user) {
	         System.out.println(user.getFirstName() + " added to database");
	}
	public void update(User user) {
		      System.out.println(user.getFirstName()+ " updated");
	}
	public void getAll() {
		  System.out.println(" Tüm kullanýcýlar listelendi");
	}

}
