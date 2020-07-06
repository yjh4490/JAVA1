package PK12;

public class TwoDimension2차원 {
	public static void main(String[] args) {
		
		
		int [][] arr = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("============");
		System.out.println(arr.length); // arr의 행
		System.out.println(arr[0].length); // arr의 1행의 열
		System.out.println(arr[1].length); // arr의 2행의 열

	}
}