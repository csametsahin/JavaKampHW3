
public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli Instructor veri taban�na eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli Instructor veri taban�nda g�ncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("T�m Instructorlar listelendi");
	}

			
	
}
