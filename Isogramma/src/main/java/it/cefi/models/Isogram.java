package it.cefi.models;

import java.util.Arrays;

public class Isogram {
	
	
	public static boolean isIsogram(String str) {
		
		str.toLowerCase();
		str.replaceAll(" ", "");
		
		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		for(int i = 0; i < str.length()-1; i++) {
			
			if(arr[i] == arr[i + 1]) {
				return false;
			}
		}

		return true;
	}
	
	public static String statusString(String str) {
		
		if(isIsogram(str)) {
			str = "La frase e' un Isogramma";
		}else {
			str = "La frase non e' un Isogramma";
		}
		
		return str;
	}
}
