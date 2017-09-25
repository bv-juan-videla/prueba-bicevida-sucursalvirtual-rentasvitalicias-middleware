package cl.bicevida.util;

import java.io.IOException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cl.bicevida.linea_credito_servicios.view.ws.servicios.BVSaldoLCR;
//import cl.bicevida.linea_credito_servicios.view.ws.servicios.SaldoLineaCredito;

public class CreateCxfClient {
	

	public static BVSaldoLCR createCXFClient(String url) throws IOException{
		
//		obtengo el endpoint correspondiente al servicio del sam desde el archivo properties
		String url2 = GetProperties.obtieneValorProperties("url.endpoint.saldo");	
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BVSaldoLCR.class);
		factory.setAddress(url2);
		return (BVSaldoLCR)factory.create();		
	} 
	

}
