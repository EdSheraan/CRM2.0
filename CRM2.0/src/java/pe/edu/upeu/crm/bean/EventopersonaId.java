package pe.edu.upeu.crm.bean;
// Generated 11/11/2017 08:16:09 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EventopersonaId generated by hbm2java
 */
@Embeddable
public class EventopersonaId implements java.io.Serializable {

    private int idPersona;
    private int idEvento;

    public EventopersonaId() {
    }

    public EventopersonaId(int idPersona, int idEvento) {
        this.idPersona = idPersona;
        this.idEvento = idEvento;
    }

    @Column(name = "idPERSONA", nullable = false)
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Column(name = "idEVENTO", nullable = false)
    public int getIdEvento() {
        return this.idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof EventopersonaId)) {
            return false;
        }
        EventopersonaId castOther = (EventopersonaId) other;

        return (this.getIdPersona() == castOther.getIdPersona())
                && (this.getIdEvento() == castOther.getIdEvento());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdPersona();
        result = 37 * result + this.getIdEvento();
        return result;
    }

}
