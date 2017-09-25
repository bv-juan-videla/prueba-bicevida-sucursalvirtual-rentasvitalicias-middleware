package cl.bicevida.beans.processors;

import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.http.common.HttpOperationFailedException;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bicevida.service.rest.exception.out.OutException;
import cl.bicevida.util.CreateCxfClient;
import cl.bicevida.linea_credito_servicios.view.ws.servicios.BVSaldoLCR;
import cl.bicevida.esb.camel.processors.SaldoResponse;
import cl.bicevida.esb.services.data.Credivida;
import cl.bicevida.esb.services.expose.data.Fde;

public class SaldoProcess implements Serializable  {
	/**
	 * serial id
	 */
	private static final long serialVersionUID = 1L;
    //@SuppressWarnings("unused")
	//private SaldoLineaCredito saldoLineaCredito; 
    private String estadoCodigo;
    private String mensaje;

	Logger logger = LoggerFactory.getLogger(SaldoProcess.class);

	/**
	 * Metodo que se utiliza para consultar los datos de Saldos fondo emergencia
	 * 
	 * @param exchange
	 *            process de camel
	 * @return
	 * @throws Exception
	 *             Excepcion.
	 */
	//public SaldoLineaCredito obtenersaldos(Exchange exchange) throws Exception {
	public Fde obtenersaldos(Exchange ex) throws Exception {
		logger.info("[obtenerpagosyaportes]Inicio...");
		
		estadoCodigo ="";

		Credivida vida = ex.getIn().getBody(Credivida.class);
		
		System.out.print("Cuenta JSON:");
		System.out.println(vida.getCuenta());
		
		String numeroCuenta= Integer.toString(vida.getCuenta());
        Fde saldoCred = new Fde();
		
		//try {
			//if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.endpoint.saldo}}");
				
				String rut = ex.getIn().getHeader("rut",String.class);
				logger.info("rutCliente: " + rut);
				SaldoResponse p = new SaldoResponse();
				//GetUrlPDFResponse outD = new GetUrlPDFResponse();
				//SaldoLineaCredito outD = new SaldoLineaCredito();
				

				BVSaldoLCR saldo = CreateCxfClient.createCXFClient(url);
				// PlanillaCajaWS cliente = CreateCxfClient.createCXFClient(url);
				 p.setSaldo(saldo.saldoLCR(numeroCuenta));
				//outD.setReturn(saldo.saldoLCR(numeroCuenta));
				//ex.getOut().setBody(p);
				
		        System.out.print("Monto Autorizado:");
		        System.out.println(p.getSaldo().getMontoAutorizado());
		        System.out.print("Monto Disponible:");
		        System.out.println(p.getSaldo().getMontoDisponible());
		        
		        //saldoCred.setEstado("0");
		        //saldoCred.setMensaje("OK");
		        saldoCred.setEstado(p.getSaldo().getEstado().getCodigo());
		        saldoCred.setMensaje(p.getSaldo().getEstado().getMensaje());		        
		        saldoCred.setMontoAutorizado(p.getSaldo().getMontoAutorizado());
		        saldoCred.setMontoDisponible(p.getSaldo().getMontoDisponible());
		        saldoCred.setMontoUtilizado(p.getSaldo().getMontoUtilizado());				
				ex.getOut().setBody(saldoCred);
		        //return saldoCred;
			//}
		//} catch (Exception e) {
			//throw new WebApplicationException(e);
		//	System.out.println("<<< Error de ws >>>");
		//}		
		
		//ex.getOut().setBody(saldoCred);


		logger.info("[obtenersaldos]Fin...");
		return saldoCred;
	}


	/**
	 * Metodo que conecta con nuestro cliente del servicioWEB
	 * 
	 * @return Objeto de pagos y aportes
	 */
	/*protected static PagosyAportes createCXFClient(String url) {
		long timeout = 300000L; // 300segundos
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PagosyAportes.class);
		factory.setAddress(url);
		
		
		PagosyAportes runtimeService = (PagosyAportes) factory.create();
		 
        Client client = ClientProxy.getClient(runtimeService);
        if (client != null) {
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            HTTPClientPolicy policy = new HTTPClientPolicy();
            policy.setConnectionTimeout(timeout);
            policy.setReceiveTimeout(timeout);
            conduit.setClient(policy);
        }
        return runtimeService;
	}*/

	/**
	 * Maneja la excepciones del servicio, para un retorno de error en la cabecera
	 * 
	 * @param ex
	 * @return
	 * @throws IOException
	 */
	/*public OutException exceptionProcess(Exchange ex) throws IOException {
		logger.info("[HistorialProcess][exceptionProcess]Inicio...");

		Exception causa = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		OutException out = new OutException();
		if (causa instanceof HttpOperationFailedException) {
			HttpOperationFailedException c = (HttpOperationFailedException) causa;
			out.setMensaje(c.getMessage());
			out.setStatusCode(c.getStatusCode());
			out.setStatusText(c.getStatusText());
			
		} else if (causa instanceof WebApplicationException) {
			WebApplicationException c = (WebApplicationException) causa;
			out.setMensaje(c.getCause().getMessage());
			out.setStatusCode(c.getResponse().getStatus());
			out.setStatusText(c.getMessage());
		
		} else {
			out.setMensaje(causa.getMessage());
			out.setStatusCode(500);
			out.setStatusText("Internal Server Error");
		}

		ex.getOut().setBody(out);
		ex.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
		ex.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, out.getStatusCode());
		
		logger.info("[HistorialProcess][exceptionProcess]Fin...");
		return out;
	}*/

}
