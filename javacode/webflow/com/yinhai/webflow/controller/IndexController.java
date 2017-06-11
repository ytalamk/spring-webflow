package com.yinhai.webflow.controller;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yinhai.webflow.service.BookingService;
@RequestMapping("index")
@Controller
public class IndexController {
	
	@Autowired
	private BookingService bookingService;

    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> toIndex() {
    	Map<String, Object> map = new Hashtable<>();
    	map.put("abc", 1);
    	map.put("booking", bookingService.createBooking("cde", "456"));
        return map;
    }

}
