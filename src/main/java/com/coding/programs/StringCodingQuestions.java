package com.coding.programs;

public class StringCodingQuestions {
	private static final char R = 'R';
	private static final char L = 'L';

	/**
	 * 1. Given a String like 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10 print range of a number which is repeated most number of times continiuously.
		Example: 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1 Answer: 6,11 (2 repeated most number of times from index 6 to 11)
	 * @param str
	 * @return
	 */
	public static int getMostRepestedChar(String str) {
		char array[]=str.toCharArray();
		int maxCounter=0;
		int currentCount=0;
		int startIndex=0;
		int endIndex=0;
		char matchNo='a';
		for (int i = 0; i < array.length; i++) {
			for (int j = (i+1); j < array.length; j++) {
				if(array[i]==array[j]) {
					matchNo =array[i];
					currentCount++;
					endIndex=j;
				}else {
					if(currentCount>maxCounter) {
						maxCounter=currentCount;
						startIndex=i;
					}
					//Increment to next char comparision
					i =j;
				}
			}
		}
		System.out.println("Highest repeased no ="+matchNo+"Start index:"+startIndex+" Endindex\t:"+endIndex);
		return maxCounter;
	}
	
	
	/**
	 *
	 * 1. Given a string containing only R and L. Find the number of balanced
	 * substrings(equal number of L’s and R’s) you will encounter where you can
	 * traverse only in the left-right direction. Example 1: RLRRLLRLRL Answer: 4
	 * (RL, RRLL, RL, RL) Example 2: LLLLRRRR Answer:1 (LLLLRRRR)
	 * 
	 * @param str
	 * @return
	 */
	public static int getBalancedStrings(String str) {
		System.out.println("Input string ::" + str);
		StringBuffer balancedStr = new StringBuffer();
		char chAr[] = str.toCharArray();
		int rCount = 0;
		int lCount = 0;
		int banaceStrCntr = 0;
		for (int i = 0; i < chAr.length; i++) {
			switch (chAr[i]) {
			case R:
				rCount++;
				balancedStr.append(chAr[i]);
				break;
			case L:
				lCount++;
				balancedStr.append(chAr[i]);
				break;
			default:
				rCount = 0;
				lCount = 0;
			}
			if (rCount > 0 && lCount > 0 && rCount == lCount) {
				banaceStrCntr++;
				// Reset
				rCount = 0;
				lCount = 0;
				System.out.println("Balance String " + banaceStrCntr + " \t:" + balancedStr);
				balancedStr.setLength(0);
			}
		}
		System.out.println("Total balance strings\t:" + banaceStrCntr);
		System.out.println();
		return banaceStrCntr;
	}

	public static void main(String[] args) {
		/*System.out.println("No Of Balance String \t:" + getBalancedStrings("LLLLRRRR"));
		System.out.println("No Of Balance String \t:" + getBalancedStrings("RLRRLLRLRL"));
		System.out.println("No Of Balance String \t:" + getBalancedStrings("RL"));
		System.out.println("No Of Balance String \t:" + getBalancedStrings("ABCDRL"));*/
		
		System.out.println(getMostRepestedChar("11223422222278910"));
	}

}
