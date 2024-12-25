package Progrm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDup {

	Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
	List<Character> resArr = new ArrayList<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in);){
			RemoveDup obj = new RemoveDup();
			
			System.out.println("Enter the String");
			String str ="";
			System.out.println("The Result String --> "+obj.removeDup(str));
			 
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
	}

	private String removeDup(String str) {
		// TODO Auto-generated method stub
		String res = "";
		if(str.length()>0) {			
			for(char c:str.toCharArray()) {
				if(dupMap.getOrDefault(c,0)==0) {
					res+=c;
					dupMap.put(c, dupMap.getOrDefault(c,0)+1);
				}
			}
		} else {
			System.out.println("String is Empty");
		}
		return res;
	}
//
//	private boolean isPresent(String res, char ch) {
//		// TODO Auto-generated method stub
//		for(char c:res.toCharArray()) {
//			if(c==ch)
//				return true;
//		}
//		return false;
//	}

}
