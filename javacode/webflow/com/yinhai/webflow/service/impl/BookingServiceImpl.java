package com.yinhai.webflow.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.yinhai.webflow.service.BookingService;
@Service(value="bookingService")
public class BookingServiceImpl implements BookingService {

	@Override
	public String start() {
		return "开始";
	}
	
	@Override
	public String createBooking(String id, String user) {
		return id + user;
	}

	@Override
	public String createBooking(String id, Map<String, Object> user) {
		return null;
	}

	
	
}
