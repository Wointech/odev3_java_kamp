package java_odev3_kamp;


public class InstructorManager extends UserManager{

	public void add(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli e�itmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli e�itmen silindi");
	}
}
