package PK12;

public class CharArray1 {
	public static void main(String[] args) {
		
		char[] alpahabets = new char[26];
		char ch = 'A';
		// 65 -->(2Áø¼ö) 1000001(65), 1000010(66)
		
		for(int i=0; i<alpahabets.length; i++, ch++) {
			alpahabets[i]=ch;
		}
		
		for(int i=0; i<alpahabets.length; i++) {
			System.out.println(alpahabets[i] + "," + (int)alpahabets[i]);
		}
		
		
		

	}
}