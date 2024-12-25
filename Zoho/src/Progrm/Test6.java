package Progrm;

public class Test6 {

	public static void main(String[] args) {
		int num = -1;
		displayPattern(num);
	}

	private static void displayPattern(int n) {
		if(n<1) {
			System.err.println("Enter valid number !!!");
		}else {
			
			int size=n+(n-1);
			int display[][] = new int[size][size];
			
			for(int i=0;i<n;i++) {
				for(int j=i;j<size-i;j++) {
					for(int k=i;k<size-i;k++) {
						display[j][k] = n-i;
					}
				}
			}
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.print(display[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
}
