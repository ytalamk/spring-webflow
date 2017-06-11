package com.yinhai.webflow.controller;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yinhai.webflow.service.BookingService;
@RequestMapping("cart")
@Controller(value="cartController")
public class CartController {
	
	@Autowired
	private BookingService bookingService;

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> cart() {
    	Map<String, Object> map = new Hashtable<>();
    	map.put("abc", 1);
    	map.put("booking", bookingService.createBooking("123", "456"));
        return map;
    }

}
