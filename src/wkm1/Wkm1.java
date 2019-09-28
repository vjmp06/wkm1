package wkm1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wkm1 {

	static Integer[] arr = { 32, 47, 41, 7, 47, 9, 36, 32, 20, 15 , 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43  };
	static int min = 1, max = 50;
		
	public static void main(String[] args) {
		
		for(int i: arrayOrdenado(min, max, arr)) {
			System.out.println(i);
		}
		
	}
	
	public static int[] arrayOrdenado(int min, int max, Integer[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i = min; i <= max; i++) {
			list.add(i);
		}
		list.removeAll(Arrays.asList(arr));
		
		int[] missingNumbers = list.stream().mapToInt(i->i).toArray();
		
		
	
		return missingNumbers;
	}

}
