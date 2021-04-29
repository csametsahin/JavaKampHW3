
public class Main {

	public static void main(String[] args) {
		   Instructor instructor = new Instructor(1,"Engin","Demiroğ","engin@demirog.io","engindemirog",33,1);
		   Student student = new Student(2,"Samet","Şahin","csametsahin@gmail.com","sametsahin",1,4);
		   
		   
		   UserManager userManager = new StudentManager();
		   userManager.add(student);  // Student
		   userManager.update(student);  // Student
		   userManager.getAll();  // Student
		   
		   userManager = new InstructorManager();
		   userManager.add(instructor);
		   userManager.update(instructor);
		   userManager.getAll();
	}

}
