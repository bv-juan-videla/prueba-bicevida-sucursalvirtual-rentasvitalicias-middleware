package cl.bicevida.esb.camel.rest.services2;

//import java.io.Serializable;
//import java.util.List;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import cl.bicevida.beans.creditosvigentes.CreditoDisponible;;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"creddisponible"
})

public class CreditoDisponible_ {
	
	@JsonProperty("creddisponible")
	private CreditoDisponible creddisponible;

	@JsonProperty("creddisponible")
	public CreditoDisponible getCreddisponible() {
		return creddisponible;
	}

	@JsonProperty("credvigente")
	public void setCredvigente(CreditoDisponible creddisponible) {
		this.creddisponible = creddisponible;
	}
	

}
