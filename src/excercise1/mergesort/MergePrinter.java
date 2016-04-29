package excercise1.mergesort;

import java.util.List;

public class MergePrinter {

	private static final String SEPERATING_LINE = "-------------------------------";
	private static final String ARRAY_DIVIDER = "|";
	
	public void printHeadline(String string) {
		System.out.println(SEPERATING_LINE);
		System.out.println(string);
		System.out.println(SEPERATING_LINE);
	}
	
	public void print(String string) {
		System.out.println(string);
	}
	
	public void printArray(List<Integer> array) {
		System.out.print(ARRAY_DIVIDER);
		for (int i = 0; i < array.size(); i++) {
	         System.out.print(array.get(i).toString() + ARRAY_DIVIDER);
		}
		this.print("");
	}
}
