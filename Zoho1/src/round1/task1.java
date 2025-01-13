package round1;

public class task1 {

	public static void main(String[] args) {
		int[] flowerBed = {1,0,1,0,0,0,1} ;
		int newFlowers = 1;
		
		System.out.println("Result --"+findAdjacent(flowerBed,newFlowers));
		
	}

	private static boolean findAdjacent(int[] flowerBed, int newFlowers) {
		if(flowerBed.length>0 && newFlowers>0) {
			for(int i=0;i<flowerBed.length;i++) {
				boolean leftOccupied = false;
				boolean rightOccupied = false;
				if(flowerBed[i]==0) {
					if(i>0 && flowerBed[i-1]==1)
						leftOccupied = true;
					if(i<flowerBed.length-1 && flowerBed[i+1]==1)
						rightOccupied = true;
					if(i==0 && !rightOccupied) {
						flowerBed[i]=1;
						newFlowers--;
					}else if(i==flowerBed.length-1 && !leftOccupied) {
						flowerBed[i]=1;
						newFlowers--;
					}else if(!leftOccupied && !rightOccupied) {						
						flowerBed[i]=1;
						newFlowers--;
					}
				}
			}
			
		}else {
			System.err.println("Empty plot..");
		}
		if(newFlowers>0)
			return false;
		return true;
	}

}
