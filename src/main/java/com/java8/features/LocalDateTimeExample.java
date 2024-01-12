package com.java8.features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime :"+localDateTime);
		localDateTime = LocalDateTime.now(ZoneId.of("UTC"));
		System.out.println("LocalDateTime :"+localDateTime);
		
	//	Define a timezone (for example, "Europe/London")
        ZoneId zoneId = ZoneOffset.UTC;
        
        // Get the current date and time in the specified timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        
        // Extract LocalDateTime from ZonedDateTime
         localDateTime = zonedDateTime.toLocalDateTime();
        
        // Print the LocalDateTime with the associated timezone
        System.out.println("LocalDateTime in " + zoneId + ": " + localDateTime);
	}

}
