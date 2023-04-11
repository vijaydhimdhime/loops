package com.vijay.loops;

public class ForEachLoop1 {
	public static void main(String[] args) {
		String[] str = {"vijay","kunal","pune"};
		String[] str1 ={"pune","solapur","kolhapur","satara"};
		for(String s:str){
			System.out.print(s+" ");
		}
		for(String name:str1){
			System.out.println(name);
		}
	}

}
