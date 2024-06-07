/* Printing only Even count in string
 * 
 * -- set enhansed for loop & split these string with empty space 
 * then count lentgh of that string then % 2 & check it s  == to 0 or not*/
package com.EvenWord;

public class EvenWord {

	public static void main(String[] args) {
		String str="Hell World My Progam Is Even Count";
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

	}

}
