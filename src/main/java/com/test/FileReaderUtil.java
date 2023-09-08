package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderUtil {

	
	public static void readFile(String filePath) throws Exception{
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(new File(filePath)));
			buffer.lines().forEach(System.out::println);
		}catch(Exception e) {
			System.err.println("Exception Details\t:"+e);
		}finally {
			if(buffer!=null) {
				buffer.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			double result =1d/2;
			
			readFile("C:\\Users\\Mahi\\git\\spring-java-annotation\\test.txt");
			System.out.println("1/2 Value::"+result);
		} catch (Exception e) {
			System.err.println("Exception Details\t:"+e);
		}
	}

}
