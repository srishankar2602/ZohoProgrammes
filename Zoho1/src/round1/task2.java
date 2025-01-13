package round1;

import java.util.ArrayList;
import java.util.List;

public class task2 {
	List<Integer> amountDistr = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		task2 obj =new task2();
		
		int amount = 22;
		int children =3;
		System.out.println("result>>"+obj.divideAsEight(amount,children));
		
	}

	private int divideAsEight(int amount, int children) {
		if(amount<children) {
			return -1;
		}
		int sub = 8;
		int diff = 0;
		while(children>0) {
			
			
			diff = amount-sub;
			if(children==1) {
				if(amount==4) {
					if(amountDistr.size()<1)
						return -1;
					amountDistr.set(amountDistr.size()-1, amountDistr.get(amountDistr.size()-1)+1);
					amountDistr.add(amount-1);
					amount=0;
					children--;
				}else {					
					amountDistr.add(amount);
					amount=0;
					children--;
				}
			}else if(diff>=children) {
				if(sub==4) {
					amountDistr.set(amountDistr.size()-1, amountDistr.get(amountDistr.size()-1)+1);
					amountDistr.add(sub-1);
					amount=amount-(sub-1);
					children--;
				}else {					
					amountDistr.add(sub);
					amount=amount-sub;
					children--;
				}
					
			}
			else {
				sub--;
			}
		}
		int count =(int) amountDistr.stream().filter(f->f==8).count();
//		System.out.println(count);
		return count==0 ? -1 :count;
		
	}

}
