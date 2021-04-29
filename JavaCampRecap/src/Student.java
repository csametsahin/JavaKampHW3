
public class Student extends User {
	    private int courseToLearnId;
		private int grade;
		public Student(int id, String firstName, String lastName, String email, String password, int courseToLearnId,
				int grade) {
			super(id, firstName, lastName, email, password);
			this.courseToLearnId = courseToLearnId;
			this.grade = grade;
		}
		public int getCourseToLearnId() {
			return courseToLearnId;
		}
		public void setCourseToLearnId(int courseToLearnId) {
			this.courseToLearnId = courseToLearnId;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
		
}
