package ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemooveDuplicateElementsInArray {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 5, 5, 6, 6, 7, 2};

		List<Integer> listWithoutDuplicates = Arrays.asList(a)
                        .stream()
                .distinct()
                .collect(Collectors.toList());
  
System.out.println(listWithoutDuplicates);
	
	}

}
