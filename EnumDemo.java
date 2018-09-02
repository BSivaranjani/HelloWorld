public class EnumDemo
{
  enum Student
  {
	SIVARANJANI(19),KALAINESAN(17),SIDDHARTH(23),SIBIRAJ(18);
	private int age;
	private Student(int age)
	{
		this.age=age;
	}
 }
 public static void main(String[] args)
 {
	for(Student s:Student.values())
	{
		System.out.println(s+" "+s.age);
	}
 }
}
