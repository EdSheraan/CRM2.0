package pe.edu.upeu.crm.bean;
// Generated 05/10/2017 07:39:29 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario",
         catalog = "dbcrm"
)
public class Usuario implements java.io.Serializable {

    private Integer idUsuario;
    private Persona persona;
    private String usuUsuario;
    private String usuClave;
    private String usuEstado;
    private String usuEstadoClave;
    private Set<Detrol> detrols = new HashSet<Detrol>(0);

    public Usuario() {
    }

    public Usuario(Persona persona, String usuUsuario, String usuClave, String usuEstado, String usuEstadoClave) {
        this.persona = persona;
        this.usuUsuario = usuUsuario;
        this.usuClave = usuClave;
        this.usuEstado = usuEstado;
        this.usuEstadoClave = usuEstadoClave;
    }

    public Usuario(Persona persona, String usuUsuario, String usuClave, String usuEstado, String usuEstadoClave, Set<Detrol> detrols) {
        this.persona = persona;
        this.usuUsuario = usuUsuario;
        this.usuClave = usuClave;
        this.usuEstado = usuEstado;
        this.usuEstadoClave = usuEstadoClave;
        this.detrols = detrols;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idUSUARIO", unique = true, nullable = false)
    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPERSONA", nullable = false)
    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Column(name = "USU_USUARIO", nullable = false, length = 64)
    public String getUsuUsuario() {
        return this.usuUsuario;
    }

    public void setUsuUsuario(String usuUsuario) {
        this.usuUsuario = usuUsuario;
    }

    @Column(name = "USU_CLAVE", nullable = false, length = 64)
    public String getUsuClave() {
        return this.usuClave;
    }

    public void setUsuClave(String usuClave) {
        this.usuClave = usuClave;
    }

    @Column(name = "USU_ESTADO", nullable = false, length = 1)
    public String getUsuEstado() {
        return this.usuEstado;
    }

    public void setUsuEstado(String usuEstado) {
        this.usuEstado = usuEstado;
    }

    @Column(name = "USU_ESTADO_CLAVE", nullable = false, length = 1)
    public String getUsuEstadoClave() {
        return this.usuEstadoClave;
    }

    public void setUsuEstadoClave(String usuEstadoClave) {
        this.usuEstadoClave = usuEstadoClave;
    }
    
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Detrol> getDetrols() {
        return this.detrols;
    }

    public void setDetrols(Set<Detrol> detrols) {
        this.detrols = detrols;
    }

}
