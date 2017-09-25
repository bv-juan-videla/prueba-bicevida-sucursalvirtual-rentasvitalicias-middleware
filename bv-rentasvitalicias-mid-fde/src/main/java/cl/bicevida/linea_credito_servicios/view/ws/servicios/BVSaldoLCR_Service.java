package cl.bicevida.linea_credito_servicios.view.ws.servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-09-14T09:36:15.770-03:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "BV_SaldoLCR", 
                  wsdlLocation = "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-fde/src/main/resources/wsdl/saldo.wsdl",
                  targetNamespace = "http://servicios.ws.view.linea_credito_servicios.bicevida.cl/") 
public class BVSaldoLCR_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://servicios.ws.view.linea_credito_servicios.bicevida.cl/", "BV_SaldoLCR");
    public final static QName BVSaldoLCRSoapHttpPort = new QName("http://servicios.ws.view.linea_credito_servicios.bicevida.cl/", "BV_SaldoLCRSoapHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-fde/src/main/resources/wsdl/saldo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BVSaldoLCR_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-fde/src/main/resources/wsdl/saldo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BVSaldoLCR_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BVSaldoLCR_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BVSaldoLCR_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BVSaldoLCR_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BVSaldoLCR_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BVSaldoLCR_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BVSaldoLCR
     */
    @WebEndpoint(name = "BV_SaldoLCRSoapHttpPort")
    public BVSaldoLCR getBVSaldoLCRSoapHttpPort() {
        return super.getPort(BVSaldoLCRSoapHttpPort, BVSaldoLCR.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BVSaldoLCR
     */
    @WebEndpoint(name = "BV_SaldoLCRSoapHttpPort")
    public BVSaldoLCR getBVSaldoLCRSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(BVSaldoLCRSoapHttpPort, BVSaldoLCR.class, features);
    }

}
