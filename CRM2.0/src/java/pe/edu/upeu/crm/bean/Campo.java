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
 * Campo generated by hbm2java
 */
@Entity
@Table(name="campo"
    ,catalog="dbcrm"
)
public class Campo  implements java.io.Serializable {


     private Integer idCampo;
     private Unionp unionp;
     private String cmpNombre;
     private Date cmpFechaCreacion;
     private String cmpEstado;
     private Set<Distrito> distritos = new HashSet<Distrito>(0);

    public Campo() {
    }

	
    public Campo(Unionp unionp, String cmpNombre, Date cmpFechaCreacion, String cmpEstado) {
        this.unionp = unionp;
        this.cmpNombre = cmpNombre;
        this.cmpFechaCreacion = cmpFechaCreacion;
        this.cmpEstado = cmpEstado;
    }
    public Campo(Unionp unionp, String cmpNombre, Date cmpFechaCreacion, String cmpEstado, Set<Distrito> distritos) {
       this.unionp = unionp;
       this.cmpNombre = cmpNombre;
       this.cmpFechaCreacion = cmpFechaCreacion;
       this.cmpEstado = cmpEstado;
       this.distritos = distritos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idCAMPO", unique=true, nullable=false)
    public Integer getIdCampo() {
        return this.idCampo;
    }
    
    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idUNION", nullable=false)
    public Unionp getUnionp() {
        return this.unionp;
    }
    
    public void setUnionp(Unionp unionp) {
        this.unionp = unionp;
    }

    
    @Column(name="CMP_NOMBRE", nullable=false, length=64)
    public String getCmpNombre() {
        return this.cmpNombre;
    }
    
    public void setCmpNombre(String cmpNombre) {
        this.cmpNombre = cmpNombre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CMP_FECHA_CREACION", nullable=false, length=10)
    public Date getCmpFechaCreacion() {
        return this.cmpFechaCreacion;
    }
    
    public void setCmpFechaCreacion(Date cmpFechaCreacion) {
        this.cmpFechaCreacion = cmpFechaCreacion;
    }

    
    @Column(name="CMP_ESTADO", nullable=false, length=1)
    public String getCmpEstado() {
        return this.cmpEstado;
    }
    
    public void setCmpEstado(String cmpEstado) {
        this.cmpEstado = cmpEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="campo")
    public Set<Distrito> getDistritos() {
        return this.distritos;
    }
    
    public void setDistritos(Set<Distrito> distritos) {
        this.distritos = distritos;
    }




}

