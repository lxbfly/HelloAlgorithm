package com.xuebing.algorithm.interview;

/**
 * The subject website : http://blog.csdn.net/ns_code/article/details/21043665
 * 
 * Get substring information.
 */
public class SubstringObtain {

	public void commonMode(String str) {
		int length = str.length();
		if (str.isEmpty()) {
			new RuntimeException("The string is empty!");
		}
		for(int i = 0; i < length; i++) {
			for( int j = i; j < length; j++) {
				for (int k = i; k < j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SubstringObtain ssb = new SubstringObtain();
		ssb.commonMode("afasfafafafasdfd");
	}
}