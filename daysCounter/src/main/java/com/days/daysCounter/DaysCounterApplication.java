package com.days.daysCounter;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;

import daysCounter.repository.daysRepository;

@SpringBootApplication
public class DaysCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaysCounterApplication.class, args);
	}
}
