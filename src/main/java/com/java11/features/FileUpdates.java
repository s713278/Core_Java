package com.java11.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {

	public static void main(String[] args) {
		try {
			Path path = Files.writeString(Files.createTempFile("test",".txt"),"Java 11 Feature Testing..");
			String str = Files.readString(path);
			System.out.println("str from File "+path+ " :: "+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
