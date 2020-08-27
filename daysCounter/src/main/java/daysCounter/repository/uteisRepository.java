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

public class uteisRepository {

	final static Logger logger = LoggerFactory.getLogger(daysRepository.class);

	public static String BusinessCalculator(String data1) {
        String data = null;
        int acumulado = 0;
        int pos = 0;
        int util = 0;
        Days date = null; 
        Days comp = null;
        String res = null;
		Document doc = null;
        int acumulado1 = 0;
        List<Days> dias = new ArrayList<Days>() ;
		try {
			File file = new File(DaysCounterApplication.class.getClassLoader().getResource("dias_uteis.xml").getFile());

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList listaDias = doc.getElementsByTagName("dia_util");

			for (int i = 0; i < listaDias.getLength(); i++) {

				Node noDia = listaDias.item(i);

				if (noDia.getNodeType() == Node.ELEMENT_NODE) {

					Element elementoDia = (Element) noDia;
					data = elementoDia.getElementsByTagName("data").item(0).getTextContent();
					acumulado = Integer.parseInt(elementoDia.getElementsByTagName("acumulado").item(0).getTextContent());
					Days dia = new Days(data, acumulado);
					dia.setData(data);
					dia.setAcumulado(acumulado);
                    dias.add(dia);
					if(data.equals(data1)) {
                        acumulado1 = acumulado;
                        pos = dias.indexOf(dia);
                    }
				}
			}
		}		/*
		 * try { org.apache.commons.io.FileUtils.touch(file); isFileUnlocked = true; }
		 * catch (IOException e) { isFileUnlocked = false; }
		 */

		catch (Exception ex) {
			logger.error(ex.getMessage());
        }
        date = dias.get(pos);
        comp = dias.get(--pos);

        if(date.getAcumulado() != comp.getAcumulado()){
            util = 1;
            res = date.getData();
        }
        else{
            while(util == 0)
            {
                Days next = dias.get(++pos);
                if(next.getAcumulado() != date.getAcumulado()){
                    res = next.getData();
                    util = 1;
                }
            }
        }
		return res;
	}
}