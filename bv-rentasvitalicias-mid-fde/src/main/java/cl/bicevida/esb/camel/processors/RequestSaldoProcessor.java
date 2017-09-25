package cl.bicevida.esb.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import cl.bicevida.esb.camel.aggregators.SaldoAggregator;

public class RequestSaldoProcessor implements Processor {

	Logger logger = Logger.getLogger(RequestSaldoProcessor.class);
	
	@Override
	public void process(Exchange ex) throws Exception {
		
		String rut = ex.getIn().getHeader("rut", String.class);
		
		logger.info("Creando objeto Saldos con rut " + rut);
		
		/* GetProductosAPV req = new GetProductosAPV();
		InProducto inprod = new InProducto();
		
		inprod.setRut(Long.parseLong(rut));
		req.setInProducto1(inprod);
		
		logger.info("Cargando objecto a exchange inprod.getRut " + inprod.getRut());
		*/
		ex.getOut().setHeaders(ex.getIn().getHeaders());
		//ex.getOut().setBody(req);		

	}
	
	
	public String transformar(String a) {
		// TODO Auto-generated method stub
		return "Hola";
	}

}
