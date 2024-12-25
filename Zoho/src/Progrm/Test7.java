package Progrm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		List<String> dir = Arrays.asList("RIGHT","LEFT","RIGHT","FORWARD");
		System.out.print(finalDirection(dir));
	}

	private static List<String> finalDirection(List<String> dir) {
		Map<String,String> oppDir = new HashMap<String,String>();
		oppDir.put("LEFT", "RIGHT");
		oppDir.put("RIGHT", "LEFT");
		oppDir.put("BACKWARD", "FORWARD");
		oppDir.put("FORWARD", "BACKWARD");
		
		if(dir.isEmpty()) {
			System.err.println("Empty list");
			return dir;
		}
		Stack<String> dirStack = new Stack<String>();
		for(String d : dir) {
			String peek ="";
			if(!dirStack.isEmpty())
				peek = dirStack.peek();
			if(dirStack.isEmpty() ) {
				dirStack.push(d);
			}else if(!oppDir.getOrDefault(d, "").equals(peek)) {
				dirStack.push(d);
			} else {
				dirStack.pop();
			}
		}
		return dirStack.stream().collect(Collectors.toList());
	}

}
