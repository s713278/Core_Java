package com.coding.programs;

public class UniqueLongestString {

	static int uniqueCounter =0;
	public static void test(String str) {
		System.out.println("-------------Actual String ---------------"+str);
		int length =str.length();
		String nextString ="";
		boolean matchFound= Boolean.FALSE;
		for(int i=0 ;i<length ; i++) {
			for(int j=1 ;j<length-i ; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					uniqueCounter++;
					String uniqueString = str.substring(i,j);
					System.out.println(i+" "+j+" UniqueCounter :"+uniqueCounter+" Unique String:"+uniqueString);
					nextString =str.substring(j,length);
					test(nextString);
					matchFound=Boolean.TRUE;
				}else {
					System.out.println(i+" "+j+" UniqueCounter :"+uniqueCounter+" Unique String:");
					continue;
				}
			}
			if(!matchFound) {
				return;
			}
			//Exit the loop
			
		}
	}
	public static void main(String[] args) {
		test("abcabcd");
		//System.out.println("abcab".substring(0,3));
		//System.out.println("abcab".substring(3,5));
	}

}
