package ��üPK6;

public class CarExample {
	public static void main(String[] args) {
		
		/*String com = "�����ڵ���";
		System.out.println(com);	//�ϵ��ڵ�  */
		
		// ��ü����!
		System.out.println("-------------�ʵ�Ȱ�� 1--------------");
		Car car1 = new Car(); // car1�� ���� CarŬ�������� �ൿ�Ҽ� �ְ� ��!
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		System.out.println("-------------�ʵ�Ȱ�� 2--------------");
		Car car2 = new Car("�ҳ�Ÿ"); 
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		System.out.println("-------------�ʵ�Ȱ�� 3--------------");
		Car car3 = new Car("���׽ý�","����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		System.out.println("-------------�ʵ�Ȱ�� 4--------------");
		Car car4 = new Car("�ý�","����",200);
		System.out.println("car4.comany : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
	}
}