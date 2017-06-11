package com.yinhai.webflow.service;

import java.util.Map;

public interface BookingService {
	
	String start();
	
	String createBooking(String id, String user);
	
	String createBooking(String id, Map<String, Object> user);
}
