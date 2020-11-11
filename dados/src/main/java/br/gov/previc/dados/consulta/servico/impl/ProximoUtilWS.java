package br.gov.previc.dados.consulta.servico.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import java.io.InputStream;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import br.gov.previc.dados.consulta.servico.IProximoUtilWS;
import br.gov.previc.dados.utils.Utils;

@Stateless
public class ProximoUtilWS implements IProximoUtilWS{
	static final Logger logger = LogManager.getLogger();
	@Override
	public Response doConsultaUtil(UriInfo uriInfo, HttpServletRequest request, String data1) {
		try{
			return Response.ok().entity(proximoUtil(data1)).build();
		}
		catch (Exception e){
			logger.info("Erro na requisicao de origem "+Utils.getClientIp(request) +" com a mensagem "+e.getMessage());
			return Response.status(403).entity(e.getMessage()).build();
		}
	}

	String proximoUtil (String data1) {
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
			InputStream file =  DiasUteisWS.class.getClassLoader().getResourceAsStream("dias_uteis.xml");

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
		}	

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