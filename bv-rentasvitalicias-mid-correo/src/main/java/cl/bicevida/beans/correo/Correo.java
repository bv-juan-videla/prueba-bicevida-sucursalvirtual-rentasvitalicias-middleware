package cl.bicevida.beans.correo;

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
    "envio_mail",
    "mail_principal"
})
public class Correo {

    @JsonProperty("envio_mail")
    private Integer envioMail;
    @JsonProperty("mail_principal")
    private String mailPrincipal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("envio_mail")
    public Integer getEnvioMail() {
        return envioMail;
    }

    @JsonProperty("envio_mail")
    public void setEnvioMail(Integer envioMail) {
        this.envioMail = envioMail;
    }

    @JsonProperty("mail_principal")
    public String getMailPrincipal() {
        return mailPrincipal;
    }

    @JsonProperty("mail_principal")
    public void setMailPrincipal(String mailPrincipal) {
        this.mailPrincipal = mailPrincipal;
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
