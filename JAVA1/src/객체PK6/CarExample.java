package 객체PK6;

public class CarExample {
	public static void main(String[] args) {
		
		/*String com = "현대자동차";
		System.out.println(com);	//하드코딩  */
		
		// 객체생성!
		System.out.println("-------------필드활용 1--------------");
		Car car1 = new Car(); // car1을 만들어서 Car클래스에서 행동할수 있게 함!
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		System.out.println("-------------필드활용 2--------------");
		Car car2 = new Car("소나타"); 
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		System.out.println("-------------필드활용 3--------------");
		Car car3 = new Car("제네시스","빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		System.out.println("-------------필드활용 4--------------");
		Car car4 = new Car("택시","검정",200);
		System.out.println("car4.comany : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
	}
}