package java_odev3_kamp;


public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " isimli öğrenci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " isimli öğrenci silindi");
	}
}
