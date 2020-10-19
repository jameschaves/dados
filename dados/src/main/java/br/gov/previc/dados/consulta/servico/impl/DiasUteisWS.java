package br.gov.previc.dados.consulta.servico.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.text.SimpleDateFormat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import br.gov.previc.dados.consulta.servico.IDiasUteisWS;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class DiasUteisWS implements IDiasUteisWS{
	static final Logger logger = LogManager.getLogger();
	@Override
	public Response doConsulta(UriInfo uriInfo, HttpServletRequest request, Date data1, Date data2) {
		try{
			return Response.ok().entity(contadorDias(request.getParameter("data1"),request.getParameter("data1"))).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}
	
	String contadorDias (String dt1, String dt2) {
		boolean isFileUnlocked = false;
		int uteis = 0;
		int f = 0;
		String saida = "retorno";
		Document doc = null;
		int acumulado1 = 0, acumulado2 =0;
			
		try {
			File file = new File(IDiasUteisWS.class.getClassLoader().getResource("dias_uteis.xml").getFile());

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(file);
			
			try {
			    org.apache.commons.io.FileUtils.touch(file);
			    isFileUnlocked = true;
			} catch (IOException e) {
			    isFileUnlocked = false;
			}
				
			doc.getDocumentElement().normalize();

			NodeList listaDias = doc.getElementsByTagName("dia_util");

			for (int i = 0; i < listaDias.getLength(); i++) {

				Node noDia = listaDias.item(i);

				if (noDia.getNodeType() == Node.ELEMENT_NODE) {

					Element elementoDia = (Element) noDia;
					String data = elementoDia.getElementsByTagName("data").item(0).getTextContent();
					int acumulado = Integer.parseInt(elementoDia.getElementsByTagName("acumulado").item(0).getTextContent());
					Days dia = new Days(data, acumulado);
					dia.setData(data);
					dia.setAcumulado(acumulado);
					if(data.equals(dt1)) {
						acumulado1 = acumulado;
					}
					if(data.equals(dt2)) {
						acumulado2 = acumulado;
					}	
				}
			}
		}		
		catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		uteis  = acumulado2 - acumulado1;
		return dt1;
	}
	
	class Days {

		public Days(String data, int acumulado) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Days [data =" + data + ", acumulado=" + acumulado + "]";
		}
		public int getAcumulado() {
			return acumulado;
		}
		public void setAcumulado(int acumulado) {
			this.acumulado = acumulado;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		private int acumulado;
		private String data;
	}

}
