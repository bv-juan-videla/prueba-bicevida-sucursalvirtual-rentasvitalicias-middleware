package cl.bicevida.credivida.model.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-09-21T17:12:20.046-03:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://ws.model.credivida.bicevida.cl/", name = "WSCartolasCRV")
@XmlSeeAlso({com.oracle.webservices.internal.literal.ObjectFactory.class, cl.bicevida.credivida.model.ws.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WSCartolasCRV {

    @WebMethod(action = "http://ws.model.credivida.bicevida.cl//getCartolaUnificada")
    @WebResult(name = "getCartolaUnificadaResponseElement", targetNamespace = "http://ws.model.credivida.bicevida.cl/types/", partName = "parameters")
    public cl.bicevida.credivida.model.ws.types.GetCartolaUnificadaResponseElement getCartolaUnificada(
        @WebParam(partName = "parameters", name = "getCartolaUnificadaElement", targetNamespace = "http://ws.model.credivida.bicevida.cl/types/")
        cl.bicevida.credivida.model.ws.types.GetCartolaUnificadaElement parameters
    );
}
