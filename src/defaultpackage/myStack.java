package defaultpackage;

import java.util.ArrayList;

public class myStack implements IStack{

	private ArrayList<String> list;
	
	public myStack() {
		list = new ArrayList<>();
	}
	
	public void push(String c) {
		list.add(0, c);
	}

	public String pop() {
		return list.remove(0);
	}

	public String peek() {
		return list.get(0);
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public int size() {
		return list.size();
	}

}
