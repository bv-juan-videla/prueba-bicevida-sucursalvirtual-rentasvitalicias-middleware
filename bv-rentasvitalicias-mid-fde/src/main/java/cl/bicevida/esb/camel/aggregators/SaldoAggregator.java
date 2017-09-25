package cl.bicevida.esb.camel.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.log4j.Logger;

//import cl.bicevida.linea_credito_servicios.view.ws.servicios.BVSaldoLCR;
import cl.bicevida.linea_credito_servicios.view.ws.servicios.SaldoLineaCredito;

import cl.bicevida.esb.services.expose.data.Fde;
//import cl.bicevida.esb.services.expose.data.Producto;

public class SaldoAggregator implements AggregationStrategy {
	
	Logger logger = Logger.getLogger(SaldoAggregator.class);
	
	Integer i = 0;

	@Override
	public Exchange aggregate(Exchange oldex, Exchange newex) {
		
		Fde clienteResponse = null;
		
		i++;
		logger.info("count de aggregator " + i);
		
		if(oldex == null){
			
			logger.info("Primera llamada del aggregator");
			oldex = newex.copy();
			clienteResponse = new Fde();			
			oldex.getIn().setBody(clienteResponse);			
		}
		
		clienteResponse = oldex.getIn().getBody(Fde.class);
		
		Object o = newex.getIn().getBody();
		
		logger.info("objeto -> " + o.getClass().getName());
		
		if(o instanceof cl.bicevida.esb.services.data.Credivida){
			logger.info("Objecto Cliente llega a aggregator");
			cl.bicevida.esb.services.data.Credivida cl = (cl.bicevida.esb.services.data.Credivida)o;
			
			//clienteResponse.setCuenta(cl.getCuenta());
			//clienteResponse.setEstado(cl.getEstado());
			//clienteResponse.setGlosa(cl.getGlosa());
		}
		
		if(o instanceof SaldoLineaCredito){
			logger.info("Objecto ProductosApv llega a aggregator");
			SaldoLineaCredito prods = (SaldoLineaCredito)o;
			 
			if(prods != null){
			     //for (cl.bicevida.linea_credito_servicios.view.ws.servicios.SaldoLineaCredito p : prods. ) {
					//SaldoLineaCredito saldoResponse = new SaldoLineaCredito();
					//saldoResponse.setEstado(prods.getEstado());
					//saldoResponse.setMontoAutorizado(prods.getMontoAutorizado());
					//saldoResponse.setMontoDisponible(prods.getMontoDisponible());
					//saldoResponse.setMontoUtilizado(prods.getMontoUtilizado());
					
					//clienteResponse.setMontoAutorizado( Integer.parseInt(prods.getMontoAutorizado()) );
					//clienteResponse.setMontoDisponible(Integer.parseInt(prods.getMontoDisponible()));
					//clienteResponse.setMontoUtilizado( Integer.parseInt(prods.getMontoUtilizado()));
			     //}
			}
			
		}
		
		oldex.getIn().setBody(clienteResponse);				
		
		return oldex;
	}	
	

}
