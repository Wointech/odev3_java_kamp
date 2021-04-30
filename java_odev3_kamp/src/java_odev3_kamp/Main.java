package java_odev3_kamp;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id=1;
		student.firstName="�mer";
		student.lastName="Y�ld�r�m";
		student.age=25;
		student.level="1";
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiro�";
		instructor.age=30;
		instructor.branch="Java";
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

	}

}
