package daysCounter.repository;

import org.slf4j.LoggerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;

import com.days.daysCounter.DaysCounterApplication;

import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import daysCounter.models.Days;

public class daysRepository {

	final static Logger logger = LoggerFactory.getLogger(daysRepository.class);

	public static String XMLopener() {
		boolean isFileUnlocked = false;
		String dados = null;
		Document doc = null;
		Days dia1 = new Days("tralala", 2);
		int k = 5;
		String check = null;
		try {
			File file = new File(DaysCounterApplication.class.getClassLoader().getResource("dias_uteis.xml").getFile());

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList listaDias = doc.getElementsByTagName("dia_util");
			List<Days> dias = new ArrayList<>();

			for (int i = 0; i < listaDias.getLength(); i++) {

				Node noDia = listaDias.item(i);

				if (noDia.getNodeType() == Node.ELEMENT_NODE) {

					Element elementoDia = (Element) noDia;
					String data = elementoDia.getElementsByTagName("data").item(0).getTextContent();
					int acumulado = Integer.parseInt(elementoDia.getElementsByTagName("acumulado").item(0).getTextContent());
					Days dia = new Days(data, acumulado);
					dia.setData(data);
					dia.setAcumulado(acumulado);
					dias.add(dia);

					dados = "teste " + dias + i;
				}
			}
		}
		/*
		 * try { org.apache.commons.io.FileUtils.touch(file); isFileUnlocked = true; }
		 * catch (IOException e) { isFileUnlocked = false; }
		 */

		catch (Exception ex) {
			System.out.print(2);
			System.out.print("   ERROOOOOOOOOOOO  ");
			logger.error(ex.getMessage());
		}

		return dados;
	}
}