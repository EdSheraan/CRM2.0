package pe.edu.upeu.crm.bean;
// Generated 05/10/2017 07:39:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Miembrogp generated by hbm2java
 */
@Entity
@Table(name="miembrogp"
    ,catalog="dbcrm"
)
public class Miembrogp  implements java.io.Serializable {


     private Integer idMiembrogp;
     private Grupo grupo;
     private Persona persona;
     private Date mgpFechaRegistro;
     private String mgpEstado;
     private Set<Asmiemgp> asmiemgps = new HashSet<Asmiemgp>(0);

    public Miembrogp() {
    }

	
    public Miembrogp(Grupo grupo, Persona persona, Date mgpFechaRegistro, String mgpEstado) {
        this.grupo = grupo;
        this.persona = persona;
        this.mgpFechaRegistro = mgpFechaRegistro;
        this.mgpEstado = mgpEstado;
    }
    public Miembrogp(Grupo grupo, Persona persona, Date mgpFechaRegistro, String mgpEstado, Set<Asmiemgp> asmiemgps) {
       this.grupo = grupo;
       this.persona = persona;
       this.mgpFechaRegistro = mgpFechaRegistro;
       this.mgpEstado = mgpEstado;
       this.asmiemgps = asmiemgps;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idMIEMBROGP", unique=true, nullable=false)
    public Integer getIdMiembrogp() {
        return this.idMiembrogp;
    }
    
    public void setIdMiembrogp(Integer idMiembrogp) {
        this.idMiembrogp = idMiembrogp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idGRUPO", nullable=false)
    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPERSONA", nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MGP_FECHA_REGISTRO", nullable=false, length=19)
    public Date getMgpFechaRegistro() {
        return this.mgpFechaRegistro;
    }
    
    public void setMgpFechaRegistro(Date mgpFechaRegistro) {
        this.mgpFechaRegistro = mgpFechaRegistro;
    }

    
    @Column(name="MGP_ESTADO", nullable=false, length=1)
    public String getMgpEstado() {
        return this.mgpEstado;
    }
    
    public void setMgpEstado(String mgpEstado) {
        this.mgpEstado = mgpEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="miembrogp")
    public Set<Asmiemgp> getAsmiemgps() {
        return this.asmiemgps;
    }
    
    public void setAsmiemgps(Set<Asmiemgp> asmiemgps) {
        this.asmiemgps = asmiemgps;
    }




}

