package ��üPK6;

public class CarGas {
	//�ʵ�
	int gas;
	//������
	//�޼ҵ�
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas()	{
		//gas�� 0�̸� gas�� �����ϴ�. -> false
		//�ݴ�
		if (gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		//gas�� 0���� ũ�� �޸��ϴ� gas������  
		//�ݴ�
		while(true) {
			if(gas>0) {
				System.out.println("�������Դϴ�. (gas�ܿ��� : " + gas + ")");
				gas -=1;
			}
			else {
				System.out.println("�����մϴ�. (gas�ܿ��� : " + gas + ")");
				return;
			}
		}
		
		
		
		
		
	}
}
