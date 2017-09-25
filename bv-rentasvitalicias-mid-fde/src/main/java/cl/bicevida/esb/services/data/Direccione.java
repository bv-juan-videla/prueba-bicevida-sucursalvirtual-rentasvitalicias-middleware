
package cl.bicevida.esb.services.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "codigoTipoDireccion",
    "tipoDireccion",
    "calle",
    "numero",
    "depto",
    "complemento",
    "telefono",
    "vivienda",
    "comuna"
})
public class Direccione {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("codigoTipoDireccion")
    private Integer codigoTipoDireccion;
    @JsonProperty("tipoDireccion")
    private String tipoDireccion;
    @JsonProperty("calle")
    private String calle;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("depto")
    private Object depto;
    @JsonProperty("complemento")
    private Object complemento;
    @JsonProperty("telefono")
    private String telefono;
    @JsonProperty("vivienda")
    private Object vivienda;
    @JsonProperty("comuna")
    private Comuna comuna;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("codigoTipoDireccion")
    public Integer getCodigoTipoDireccion() {
        return codigoTipoDireccion;
    }

    @JsonProperty("codigoTipoDireccion")
    public void setCodigoTipoDireccion(Integer codigoTipoDireccion) {
        this.codigoTipoDireccion = codigoTipoDireccion;
    }

    @JsonProperty("tipoDireccion")
    public String getTipoDireccion() {
        return tipoDireccion;
    }

    @JsonProperty("tipoDireccion")
    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @JsonProperty("calle")
    public String getCalle() {
        return calle;
    }

    @JsonProperty("calle")
    public void setCalle(String calle) {
        this.calle = calle;
    }

    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    @JsonProperty("numero")
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @JsonProperty("depto")
    public Object getDepto() {
        return depto;
    }

    @JsonProperty("depto")
    public void setDepto(Object depto) {
        this.depto = depto;
    }

    @JsonProperty("complemento")
    public Object getComplemento() {
        return complemento;
    }

    @JsonProperty("complemento")
    public void setComplemento(Object complemento) {
        this.complemento = complemento;
    }

    @JsonProperty("telefono")
    public String getTelefono() {
        return telefono;
    }

    @JsonProperty("telefono")
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonProperty("vivienda")
    public Object getVivienda() {
        return vivienda;
    }

    @JsonProperty("vivienda")
    public void setVivienda(Object vivienda) {
        this.vivienda = vivienda;
    }

    @JsonProperty("comuna")
    public Comuna getComuna() {
        return comuna;
    }

    @JsonProperty("comuna")
    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
