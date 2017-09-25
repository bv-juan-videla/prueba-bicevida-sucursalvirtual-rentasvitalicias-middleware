
package cl.bicevida.esb.services.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rut",
    "dv",
    "nombres",
    "apellidoPaterno",
    "apellidoMaterno",
    "fechaNacimiento",
    "fechaDefuncion",
    "email",
    "celular",
    "numeroCasilla",
    "correoCasilla",
    "tipoEnvioCorrespondencia",
    "direcciones",
    "sys_usuario"
})
public class Cliente {

    @JsonProperty("rut")
    private Integer rut;
    @JsonProperty("dv")
    private String dv;
    @JsonProperty("nombres")
    private String nombres;
    @JsonProperty("apellidoPaterno")
    private String apellidoPaterno;
    @JsonProperty("apellidoMaterno")
    private String apellidoMaterno;
    @JsonProperty("fechaNacimiento")
    private Long fechaNacimiento;
    @JsonProperty("fechaDefuncion")
    private Object fechaDefuncion;
    @JsonProperty("email")
    private String email;
    @JsonProperty("celular")
    private String celular;
    @JsonProperty("numeroCasilla")
    private Object numeroCasilla;
    @JsonProperty("correoCasilla")
    private Object correoCasilla;
    @JsonProperty("tipoEnvioCorrespondencia")
    private Integer tipoEnvioCorrespondencia;
    @JsonProperty("direcciones")
    private List<Direccione> direcciones = null;
    @JsonProperty("sys_usuario")
    private Object sysUsuario;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rut")
    public Integer getRut() {
        return rut;
    }

    @JsonProperty("rut")
    public void setRut(Integer rut) {
        this.rut = rut;
    }

    @JsonProperty("dv")
    public String getDv() {
        return dv;
    }

    @JsonProperty("dv")
    public void setDv(String dv) {
        this.dv = dv;
    }

    @JsonProperty("nombres")
    public String getNombres() {
        return nombres;
    }

    @JsonProperty("nombres")
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @JsonProperty("apellidoPaterno")
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    @JsonProperty("apellidoPaterno")
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @JsonProperty("apellidoMaterno")
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    @JsonProperty("apellidoMaterno")
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @JsonProperty("fechaNacimiento")
    public Long getFechaNacimiento() {
        return fechaNacimiento;
    }

    @JsonProperty("fechaNacimiento")
    public void setFechaNacimiento(Long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @JsonProperty("fechaDefuncion")
    public Object getFechaDefuncion() {
        return fechaDefuncion;
    }

    @JsonProperty("fechaDefuncion")
    public void setFechaDefuncion(Object fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("celular")
    public String getCelular() {
        return celular;
    }

    @JsonProperty("celular")
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @JsonProperty("numeroCasilla")
    public Object getNumeroCasilla() {
        return numeroCasilla;
    }

    @JsonProperty("numeroCasilla")
    public void setNumeroCasilla(Object numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    @JsonProperty("correoCasilla")
    public Object getCorreoCasilla() {
        return correoCasilla;
    }

    @JsonProperty("correoCasilla")
    public void setCorreoCasilla(Object correoCasilla) {
        this.correoCasilla = correoCasilla;
    }

    @JsonProperty("tipoEnvioCorrespondencia")
    public Integer getTipoEnvioCorrespondencia() {
        return tipoEnvioCorrespondencia;
    }

    @JsonProperty("tipoEnvioCorrespondencia")
    public void setTipoEnvioCorrespondencia(Integer tipoEnvioCorrespondencia) {
        this.tipoEnvioCorrespondencia = tipoEnvioCorrespondencia;
    }

    @JsonProperty("direcciones")
    public List<Direccione> getDirecciones() {
        return direcciones;
    }

    @JsonProperty("direcciones")
    public void setDirecciones(List<Direccione> direcciones) {
        this.direcciones = direcciones;
    }

    @JsonProperty("sys_usuario")
    public Object getSysUsuario() {
        return sysUsuario;
    }

    @JsonProperty("sys_usuario")
    public void setSysUsuario(Object sysUsuario) {
        this.sysUsuario = sysUsuario;
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
