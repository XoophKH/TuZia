package it.cefi.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RicercaModel {


	public static List<Integer> list = new ArrayList<>(); 
	
	public static int ricerca(List<Integer> list, Integer key) {
		
		Integer[]arr = list.stream().toArray(Integer[] ::new);
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, key);
			
		return index;
	}
	
	public static boolean isContiene(List<Integer> list, Integer str) {
		
		boolean flag = false;
		
		if(list.contains(str)) {
			flag = true;
		}
		
		return flag;
	}
	
	public static String status(List<Integer> list, Integer str) {
		
		String status = null;
		
		if(isContiene(list, str)) {
			status = "L'elemento si trova nella posizione " + RicercaModel.ricerca(list, str); 
		}else {
			status = "Elemento non esiste";
		}
		
		return status;
		
	}
	
}
