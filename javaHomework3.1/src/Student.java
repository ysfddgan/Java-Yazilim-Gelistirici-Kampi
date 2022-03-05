
public class Student extends User {
	int numberofcourses;
	
	public Student() {
		
	}
	
	public Student(int numberofcourses) {
		super();
		this.numberofcourses = numberofcourses;
	}

	public int getNumberofcourses() {
		return numberofcourses;
	}

	public void setNumberofcourses(int numberofcourses) {
		this.numberofcourses = numberofcourses;
	}
	
}
