package Progrm;

public class Test5 {

	public static void main(String[] args) {
		int num = 0;
		formPattern(num);
	}

	private static void formPattern(int num) {
		if(num<=0) {
			System.err.println("Give Grtr than 0");
		}
		int row_count = 1;
		for(int i=1;i<=num;i++) {
			row_count = i;
			int row_incr = num-1;
			int disNum = i;
			System.out.print(disNum);
			row_count--;
			if(row_count>0) {
				while(row_count>0) {
					disNum+=row_incr;
					System.out.print(" "+(disNum));
					row_incr--;
					row_count--;
				}
			}
			System.out.println();
		}
	}

}
