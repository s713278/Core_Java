package com.coding.interfaces;

public class DataReaderExample {

	public static void main(String[] args) {
		DataReader fileDataReader = new FileDataReader();
		System.out.println(fileDataReader.readData());
		
		DataReader dbDatReader = new DBDataReader();
		System.out.println(dbDatReader.readData());

	}

}
