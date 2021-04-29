
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli student veri tabanına eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli student veri tabanında güncellendi");
	}

	@Override
	public void getAll() {
		System.out.println("Tüm studentlar listelendi");
	}

}
