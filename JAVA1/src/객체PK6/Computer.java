package 객체PK6;

public class Computer {
	// 메소드 1
	
	//int[] values = new values[] {1,2,3};
	
	int sum1(int[] values) {
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	// 메소드 2
	
	int sum2(int ... values) {
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
}
