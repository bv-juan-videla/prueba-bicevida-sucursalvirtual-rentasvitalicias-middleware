<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="NumeroCuenta"/>
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		    <soap:Body xmlns:ns1="http://servicios.ws.view.linea_credito_servicios.bicevida.cl/">
		        <ns:saldoLCR>
	                <NumeroCuenta><xsl:value-of select="$NumeroCuenta" /></NumeroCuenta>
		        </ns:saldoLCR>
		    </soap:Body>
		</soap:Envelope>		
	</xsl:template>
</xsl:stylesheet>