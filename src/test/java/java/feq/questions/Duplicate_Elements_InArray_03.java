package java.feq.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_Elements_InArray_03 {
	//Brute Froce
	public static void main(String[] args) {
		String arr[] = {"Amazon","Amazon","Audi","Merc","BMW","Audi"};
		System.out.println("Brute Force");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("***Hah Set**");
		Set<String> data = new HashSet<String>();
		for(String e:arr) {
			if(data.add(e)==false) {
				System.out.println(e);
			}
		}
		System.out.println("***HashMap");
		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		for(String e:arr) {
			Integer count = infraMap.get(e);
			if(count == null) {
				infraMap.put(e, 1);
			}
			else {
				infraMap.put(e, ++count);
			}
		}
		//Printing all the duplicate elements
		Set<Entry<String, Integer>> entrySet = infraMap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("***Streams ***");
		Set<String> dataSet = new HashSet<String>();
		Set<String> duplicateSet = Arrays.asList(arr).stream().filter(e->
		!dataSet.add(e)).collect(Collectors.toSet());
		System.out.println(duplicateSet);
	}
}


