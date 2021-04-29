
public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli Instructor veri tabanýna eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli Instructor veri tabanýnda güncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("Tüm Instructorlar listelendi");
	}

			
	
}
