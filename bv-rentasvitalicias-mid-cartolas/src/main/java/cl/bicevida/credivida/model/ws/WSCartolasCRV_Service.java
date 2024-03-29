package cl.bicevida.credivida.model.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-09-21T17:12:20.058-03:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "WSCartolasCRV", 
                  wsdlLocation = "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-cartolas/src/main/resources/wsdl/cartola.wsdl",
                  targetNamespace = "http://ws.model.credivida.bicevida.cl/") 
public class WSCartolasCRV_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.model.credivida.bicevida.cl/", "WSCartolasCRV");
    public final static QName WSCartolasCRVSoapHttpPort = new QName("http://ws.model.credivida.bicevida.cl/", "WSCartolasCRVSoapHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-cartolas/src/main/resources/wsdl/cartola.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSCartolasCRV_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Sandbox/SVirtual/wspace10.4/bicevida-sucursalvirtual-rentasvitalicias-middleware/bv-rentasvitalicias-mid-cartolas/src/main/resources/wsdl/cartola.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSCartolasCRV_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSCartolasCRV_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCartolasCRV_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WSCartolasCRV_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSCartolasCRV_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSCartolasCRV_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WSCartolasCRV
     */
    @WebEndpoint(name = "WSCartolasCRVSoapHttpPort")
    public WSCartolasCRV getWSCartolasCRVSoapHttpPort() {
        return super.getPort(WSCartolasCRVSoapHttpPort, WSCartolasCRV.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCartolasCRV
     */
    @WebEndpoint(name = "WSCartolasCRVSoapHttpPort")
    public WSCartolasCRV getWSCartolasCRVSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(WSCartolasCRVSoapHttpPort, WSCartolasCRV.class, features);
    }

}
