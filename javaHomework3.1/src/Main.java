
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin Demiroğ");
		instructor1.setAge(37);
		instructor1.setGender("Erkek");
		instructor1.setSalary(10000);
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Yusuf doğan");
		student1.setAge(29);
		student1.setGender("Erkek");
		student1.setNumberofcourses(2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
	}

}
