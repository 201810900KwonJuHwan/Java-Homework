package Homewokr2;

class Course {
	String code;
	String name;
	public Course(String c, String n){
		code= c;
		name= n;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

class OnlineCourse extends Course{
	OnlineCourse(String c,String n){
		super(c, n);
	}

	@Override
	public String toString() {
		return "Code: "+code+", Name: "+name+", Type: Online";
	}
}

class OfflineCourse extends Course{
	OfflineCourse(String c, String n){
		super(c, n);

	}

	@Override
	public String toString() {
		return "Code: "+code+", Name: "+name+", Type: Offline";
	}
	
}

public class Homework6 {
	public static void main(String[] args) {
		OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
		OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
		System.out.println (course1);
		System.out.println (course2);

		
	}

}
