package Progrm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in);){
			
			System.out.println("Enter the Length");
//			int len = scan.nextInt();
			int len = 10;
			System.out.println("Enter the values");
			
			List<Integer> arrList = Arrays.asList(1,2,0,4,3,0,5,0);
			
			List<Integer> resList = moveZero(arrList); 
			System.out.println(resList);
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static List<Integer> moveZero(List<Integer> arrList) {
		if(!arrList.isEmpty()) {
			for(int i=0;i<arrList.size();i++) {
				if(arrList.get(i)==0) {
					arrList = swapToEnd(arrList,i);
				}
			}
		} else {
			System.err.println("Empty List");
		}
		
		return arrList;
	}

	private static List<Integer> swapToEnd(List<Integer> arrList, int i) {
		while(i<arrList.size()-1) {
			int temp = arrList.get(i);
			arrList.set(i, arrList.get(i+1));
			arrList.set(i+1, temp);
			i++;
		}
		return arrList;
	}

}
