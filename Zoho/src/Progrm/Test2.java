package Progrm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = Arrays.asList(10,20,30);
		List<Integer> arr2 = Arrays.asList();
		
		List<Integer> resArr = formArr(arr1,arr2);
		
		System.out.println(resArr);
	}

	private static List<Integer> formArr(List<Integer> arr1, List<Integer> arr2) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<Integer>();
		int len = arr1.size()>arr2.size() ? arr1.size() :arr2.size();
		
		for(int i=0;i<len;i++) {
			if(i<arr1.size())
				res.add(arr1.get(i));
			if(i<arr2.size())
				res.add(arr2.get(i));
		}
		
		return res;
	}

}
