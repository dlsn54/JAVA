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
	    	
	        // ��ĳ���� ����
	        Person p = new Student("ȫ�浿");
	        System.out.println(p.name);
	        // �ٿ�ĳ����
	        Student s;
	        s= (Student) p;
	        System.out.println(s.name);
	        // Okay!
	        s.name = "��";

	        // Okay!
	        s.dept = "Computer Eng";
	        System.out.println(s.name+s.dept);
	        
	    }
	
	

}
