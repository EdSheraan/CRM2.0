package pe.edu.upeu.crm.bean;
// Generated 11/11/2017 08:16:09 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Eventopersona generated by hbm2java
 */
@Entity
@Table(name = "eventopersona", catalog = "dbcrm"
)
public class Eventopersona implements java.io.Serializable {

    private EventopersonaId id;
    private String asistecia;

    public Eventopersona() {
    }

    public Eventopersona(EventopersonaId id) {
        this.id = id;
    }

    public Eventopersona(EventopersonaId id, String asistecia) {
        this.id = id;
        this.asistecia = asistecia;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "idPersona", column = @Column(name = "idPERSONA", nullable = false)),
        @AttributeOverride(name = "idEvento", column = @Column(name = "idEVENTO", nullable = false))})
    public EventopersonaId getId() {
        return this.id;
    }

    public void setId(EventopersonaId id) {
        this.id = id;
    }

    @Column(name = "ASISTECIA", length = 1)
    public String getAsistecia() {
        return this.asistecia;
    }

    public void setAsistecia(String asistecia) {
        this.asistecia = asistecia;
    }

}
