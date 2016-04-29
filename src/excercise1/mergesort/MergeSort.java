package excercise1.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MergeSort {

	private static MergePrinter LOG = new MergePrinter();
	
	public static void main(String[] args) {
		LOG.printHeadline("Übung 1 - Mergesort");
		
		List<Integer> unsorted = new ArrayList<Integer>();
		unsorted.add(10);
		unsorted.add(8);
		unsorted.add(3);
		unsorted.add(6);
		unsorted.add(1);
		unsorted.add(4);
		unsorted.add(2);
		unsorted.add(5);
		unsorted.add(9);
		unsorted.add(7);
		
		
		LOG.print("Unsorted Array initialized:");
		LOG.printArray(unsorted);
		List<Integer> sorted = sort(unsorted);
		LOG.print("Array sorted:");
		LOG.printArray(sorted);

	}
	
	private static List<Integer> sort(List<Integer> array) {
		LOG.print("sorting...");
		
		return mergeSort(array);
	}
	
	private static List<Integer> mergeSort(List<Integer> list) {
		List<Integer> sorted = new ArrayList<Integer>();
		if (list.size() > 1) {
			double size = list.size();
			Double m = (Double) Math.ceil(size / 2D);
			List<Integer> left = mergeSort(list.subList(0, m.intValue()));
			List<Integer> right = mergeSort(list.subList(m.intValue(), list.size()));
			LOG.printArray(list);
			LOG.printArray(left);
			LOG.printArray(right);
			int l = 0;
			int r = 0;
			
			while (l < left.size() || r < right.size()) {
				if (l == left.size()) {
					sorted.add(right.get(r));
					r++;
				} else if (r == right.size()) {
					sorted.add(left.get(l));
					l++;
				} else if (left.get(l) <= right.get(r)) {
					sorted.add(left.get(l));
					l++;
				} else if (right.get(r) < left.get(l)) {
					sorted.add(right.get(r));
					r++;
				}
			}
			LOG.printArray(sorted);;
		} else {
			sorted = list;
		}
		
		
		
		return sorted;
	}

}
