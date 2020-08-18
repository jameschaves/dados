package com.days.daysCounter.resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import daysCounter.repository.daysRepository;

@RestController
@RequestMapping(value="api")
public class Resource {
	
	@GetMapping(path = "/datas")
	public int getDias(@RequestParam String data1 , @RequestParam String data2 )
	{
		return daysRepository.XMLopener(data1, data2);
	}
}
