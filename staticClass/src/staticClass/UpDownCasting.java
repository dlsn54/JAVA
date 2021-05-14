package staticClass;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String dept;
    String grade;

    public Student(String name) {
        super(name);
    }
}

public class UpDownCasting {
	
	    public static void main(String[] args) {
	    	
	        // 업캐스팅 선행
	        Person p = new Student("홍길동");
	        System.out.println(p.name);
	        // 다운캐스팅
	        Student s;
	        s= (Student) p;
	        System.out.println(s.name);
	        // Okay!
	        s.name = "김";

	        // Okay!
	        s.dept = "Computer Eng";
	        System.out.println(s.name+s.dept);
	        
	    }
	
	

}
