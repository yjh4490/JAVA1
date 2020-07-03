package °´Ã¼PK6;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		
		myCalc.powerOn();
		
		System.out.println("x + y : " + myCalc.plus(7, 14));
		
		System.out.println("x / y : " + myCalc.divide(7, 14));
		
		myCalc.powerOff();
		
// ================================================================
		
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(5, 6);
//		System.out.println("x + y : " + result1);
//		
//		byte x =10;
//		byte y =4;
		
		
		
	}
}