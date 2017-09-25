package com.oracle.xmlns.bv_consultasaldo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-09-21T18:05:26.020-03:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "BV_ConsultaSaldo", 
                  wsdlLocation = "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-credivida/src/main/resources/wsdl/consultasaldo.wsdl",
                  targetNamespace = "http://xmlns.oracle.com/BV_ConsultaSaldo") 
public class BVConsultaSaldo_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/BV_ConsultaSaldo", "BV_ConsultaSaldo");
    public final static QName BVConsultaSaldoPort = new QName("http://xmlns.oracle.com/BV_ConsultaSaldo", "BV_ConsultaSaldoPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-credivida/src/main/resources/wsdl/consultasaldo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BVConsultaSaldo_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-credivida/src/main/resources/wsdl/consultasaldo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BVConsultaSaldo_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BVConsultaSaldo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BVConsultaSaldo_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BVConsultaSaldo_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BVConsultaSaldo_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BVConsultaSaldo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BVConsultaSaldo
     */
    @WebEndpoint(name = "BV_ConsultaSaldoPort")
    public BVConsultaSaldo getBVConsultaSaldoPort() {
        return super.getPort(BVConsultaSaldoPort, BVConsultaSaldo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BVConsultaSaldo
     */
    @WebEndpoint(name = "BV_ConsultaSaldoPort")
    public BVConsultaSaldo getBVConsultaSaldoPort(WebServiceFeature... features) {
        return super.getPort(BVConsultaSaldoPort, BVConsultaSaldo.class, features);
    }

}
