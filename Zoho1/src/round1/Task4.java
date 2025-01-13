package round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3,2,1,0,5);
		
		System.out.println("Result >> "+jumpToFinal(arr));
		
		
	}

	private static boolean jumpToFinal(List<Integer> arr) {
		if(arr.isEmpty()) return false;
		if(arr.size()==1) return true;
		
		int i=0;
		int add = arr.get(0);
		while(i<arr.size() && add!=0) {
			int jumpIndex = i;
			if(jumpIndex<arr.size() && arr.size()-1==(jumpIndex))
				return true;
			add--;
			
			if(arr.get(i)!=0)
				add =arr.get(i);
			
			i++;
		}
		return false;
	}

}
