package 객체PK6;

public class CarGas {
	//필드
	int gas;
	//생성자
	//메소드
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas()	{
		//gas가 0이면 gas가 없습니다. -> false
		//반대
		if (gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		//gas가 0보다 크면 달립니다 gas보유량  
		//반대
		while(true) {
			if(gas>0) {
				System.out.println("주행중입니다. (gas잔여량 : " + gas + ")");
				gas -=1;
			}
			else {
				System.out.println("정차합니다. (gas잔여량 : " + gas + ")");
				return;
			}
		}
		
		
		
		
		
	}
}
