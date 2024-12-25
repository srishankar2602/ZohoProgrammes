package Progrm;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
	
	List<String> ipAddress = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 obj = new Test8();
		String ip = "000001";
		obj.ipAddress(ip);
		
	}

	private  void ipAddress(String ip) {
		StringBuilder sb= new StringBuilder();
		
		if(ip.length()<=12 && ip.length()>=4) {
			for(int i=1;i<ip.length()-2;i++) {
				for(int j=i+1;j<ip.length()-1;j++) {
					for(int k=j+1;k<ip.length();k++) {
						sb.append(ip.substring(0, i));
						sb.append(".");
						sb.append(ip.substring(i, j));
						sb.append(".");
						sb.append(ip.substring(j, k));
						sb.append(".");
						if(k<ip.length())
							sb.append(ip.substring(k,ip.length()));
						validIP(sb.toString());
						System.out.println(sb.toString());
						sb.setLength(0);
					}
				}
			}
		}
		System.out.println("Valid Ip Address >>>");
		System.out.println(ipAddress);
	}

	private boolean validIP(String ip) {
		String[] splitStr = ip.split("[.]");
		
		for(String adr:splitStr) {
			if(adr.contains("@"))
				return false;
			if(splitStr.length!=4 || Integer.parseInt(adr) >255 || Integer.parseInt(adr) <0 || (adr.charAt(0)=='0' && adr.length()>1) )
				return false;
			
		}
		ipAddress.add(ip);
		return true;
	}

}
