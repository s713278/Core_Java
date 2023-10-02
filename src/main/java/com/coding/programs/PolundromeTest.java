package com.coding.programs;

public class PolundromeTest {
    
    public static boolean isPolyndorm(String str) {
        if(str.length()==1){
            return true;
        }
        int strLen=str.length()/2;
        for(int i=0;i<strLen ;i++){
           if(str.charAt(i) != str.charAt(str.length()-1-i)) {
               return false;
           }
        }
        return true;
    }
    
    public static void main(String[] args) {
      System.out.println(" Is m isPolyndorm ?"+ isPolyndorm("m"));
      System.out.println(" Is mm isPolyndorm ?"+ isPolyndorm("mm"));
      System.out.println(" Is mn isPolyndorm ?"+ isPolyndorm("mn"));
      System.out.println(" Is madam isPolyndorm ?"+ isPolyndorm("madam"));
      System.out.println(" Is madamn isPolyndorm ?"+ isPolyndorm("madamn"));
      System.out.println(" Is maddam isPolyndorm ?"+ isPolyndorm("maddam"));
    }
}

