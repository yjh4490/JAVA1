package PK12;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new  Book[5];
		
		library[0]=new Book("�¹���", "������");
		library[2]=new Book("���̾�", "�츣�� �켼");
		library[3]=new Book("��� �� ���ΰ�", "���ù�");
		library[4]=new Book("����", "�ڰ渮");
		library[1]=new Book("�����", "�������丮");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookinfo();
		}
			System.out.println();
		
			for (int i = 0; i < library.length; i++) {
				System.out.println(library[i]);
			}
		


	}
}