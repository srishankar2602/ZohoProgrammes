package round1;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin = 10;
		System.out.println(formStairs(coin));
	}

	private static int formStairs(int coin) {
		if(coin<1) return 0;
//		if(coin==1) return 1;
		
		boolean loopCompleted = true;
		int row_count = 1;
		int coin_row_count = 0;
		
		while(coin>0) {
			if(coin>=row_count) {
				coin-=row_count;
			} else {
				coin-=row_count;
				loopCompleted=false;
			}
//			for(int i=0;i<row_count;i++) {
//				if(coin>0) {
//					System.out.print("*"+" ");
//					coin--;
//				}else {
//					loopCompleted = false;
//					break;
//				}
//			}
			if(loopCompleted)
				coin_row_count++;
			if(coin<1) break;
			row_count++;
			
		}
		return coin_row_count;
	}

}
