package cl.bicevida.beans.creditosvigentes;

//import java.io.Serializable;
//import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"monto_maximo",
"monto_solicitado",
"monto_preaprobado"
})

//public class CreditosVigentes implements Serializable {
public class CreditoDisponible {
	// private static final long serialVersionUID = 1L;

	@JsonProperty("monto_maximo")
	private int monto_maximo;
	@JsonProperty("monto_solicitado")
    private int monto_solicitado;
	@JsonProperty("monto_preaprobado")
    private int monto_preaprobado;

	@JsonProperty("monto_maximo")
	public int getMonto_maximo() {
		return monto_maximo;
	}
	@JsonProperty("monto_maximo")
	public void setMonto_maximo(int monto_maximo) {
		this.monto_maximo = monto_maximo;
	}
	@JsonProperty("monto_solicitado")
	public int getMonto_solicitado() {
		return monto_solicitado;
	}
	@JsonProperty("monto_solicitado")
	public void setMonto_solicitado(int monto_solicitado) {
		this.monto_solicitado = monto_solicitado;
	}
	@JsonProperty("monto_preaprobado")
	public int getMonto_preaprobado() {
		return monto_preaprobado;
	}
	@JsonProperty("monto_preaprobado")
	public void setMonto_preaprobado(int monto_preaprobado) {
		this.monto_preaprobado = monto_preaprobado;
	}
    	
}
