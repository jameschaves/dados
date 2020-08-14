package com.days.daysCounter.resources;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

import com.days.daysCounter.DaysCounterApplication;

import daysCounter.models.Days;
import daysCounter.repository.daysRepository;

@RestController
@RequestMapping(value="api")
public class Resource {
	
	@GetMapping(path = "/datas")
	public String getDias(@RequestParam String data1 , @RequestParam String data2 )
	{
		return daysRepository.XMLopener();
	}
}
