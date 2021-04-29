
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli student veri taban�na eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli student veri taban�nda g�ncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("T�m studentlar listelendi");
	}

}
