package ��üPK6;

public class Computer {
	// �޼ҵ� 1
	
	//int[] values = new values[] {1,2,3};
	
	int sum1(int[] values) {
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	// �޼ҵ� 2
	
	int sum2(int ... values) {
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
}
