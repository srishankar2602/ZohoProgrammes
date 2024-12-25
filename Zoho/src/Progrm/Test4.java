package Progrm;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "xxxx";
		String str2 = "yyyx";
		
		System.out.println(concate(str1,str2)); 
		
		
	}

	private static String concate(String str1, String str2) {
		int len = str1.length()>str2.length()?str1.length():str2.length();
		
		String res1="";
		String res2="";
		
		Map<Character,Integer> strMap1= new HashMap<Character,Integer>();
		Map<Character,Integer> strMap2= new HashMap<Character,Integer>();
		
		for(int i=0;i<len;i++) {
			if(i<str1.length()) {
				strMap1.put(str1.charAt(i),strMap1.getOrDefault(str1.charAt(i), 0)+1);
				
			}
			if(i<str2.length()) {
				strMap2.put(str2.charAt(i),strMap2.getOrDefault(str2.charAt(i), 0)+1);
			}
		}
		
		for(int i=0;i<len;i++) {
			if(i<str1.length() && strMap2.getOrDefault(str1.charAt(i), 0)==0) {
				res1+=str1.charAt(i);
				
			}
			if(i<str2.length() && strMap1.getOrDefault(str2.charAt(i), 0)==0) {
				res2+=str2.charAt(i);
			}
		}
		
		
		String res = res1+res2;
		
		if(res.isEmpty())
			return "-1";
		return res;
		
//		for(int i=0;i<len;i++) {
//			if(i<str1.length() && !isPesent(str1.charAt(i),str2)) {
//				res1+=str1.charAt(i);
//				
//			}
//			if(i<str2.length() && !isPesent(str2.charAt(i),str1)) {
//				res2+=str2.charAt(i);
//			}
//		}
		
	}

	private static boolean isPesent(char c, String str) {
		for(char ch :str.toCharArray()) {
			if(ch==c)
				return true;
		}
		return false;
	}

}
