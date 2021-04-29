
public class Instructor extends User {
	private int certificateId;
	private int courseToTeachId;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, int certificateId,
			int courseToTeachId) {
		super(id, firstName, lastName, email, password);
		this.certificateId = certificateId;
		this.courseToTeachId = courseToTeachId;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public int getCourseToTeachId() {
		return courseToTeachId;
	}

	public void setCourseToTeachId(int courseToTeachId) {
		this.courseToTeachId = courseToTeachId;
	}
	
	

}
