package 객체PK6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name="홍삼원";
		//final : fix되어 있으므로 변경 불가(고정값)
		
		//p1.nation"usa";
		//p1.ssn="123456-56789452";
		System.out.println(p1.name);
		

	}
}
