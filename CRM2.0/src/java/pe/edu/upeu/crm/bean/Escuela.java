package pe.edu.upeu.crm.bean;
// Generated 11/11/2017 08:16:09 PM by Hibernate Tools 4.3.1


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
 * Escuela generated by hbm2java
 */
@Entity
@Table(name="escuela"
    ,catalog="dbcrm"
)
public class Escuela  implements java.io.Serializable {


     private Integer idEscuela;
     private Iglesia iglesia;
     private String escNombre;
     private Date escFechaCreacion;
     private String escEstado;
     private String escLugarReunion;
     private int escUsuAdd;
     private Integer escUsuUpd;
     private Integer escUsuDel;
     private Date escFechaAdd;
     private Date escFechaUpd;
     private Date escFechaDel;
     private Set<Grupo> grupos = new HashSet<Grupo>(0);

    public Escuela() {
    }

	
    public Escuela(Iglesia iglesia, String escNombre, Date escFechaCreacion, String escEstado, int escUsuAdd, Date escFechaAdd) {
        this.iglesia = iglesia;
        this.escNombre = escNombre;
        this.escFechaCreacion = escFechaCreacion;
        this.escEstado = escEstado;
        this.escUsuAdd = escUsuAdd;
        this.escFechaAdd = escFechaAdd;
    }
    public Escuela(Iglesia iglesia, String escNombre, Date escFechaCreacion, String escEstado, String escLugarReunion, int escUsuAdd, Integer escUsuUpd, Integer escUsuDel, Date escFechaAdd, Date escFechaUpd, Date escFechaDel, Set<Grupo> grupos) {
       this.iglesia = iglesia;
       this.escNombre = escNombre;
       this.escFechaCreacion = escFechaCreacion;
       this.escEstado = escEstado;
       this.escLugarReunion = escLugarReunion;
       this.escUsuAdd = escUsuAdd;
       this.escUsuUpd = escUsuUpd;
       this.escUsuDel = escUsuDel;
       this.escFechaAdd = escFechaAdd;
       this.escFechaUpd = escFechaUpd;
       this.escFechaDel = escFechaDel;
       this.grupos = grupos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idESCUELA", unique=true, nullable=false)
    public Integer getIdEscuela() {
        return this.idEscuela;
    }
    
    public void setIdEscuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idIGLESIA", nullable=false)
    public Iglesia getIglesia() {
        return this.iglesia;
    }
    
    public void setIglesia(Iglesia iglesia) {
        this.iglesia = iglesia;
    }

    
    @Column(name="ESC_NOMBRE", nullable=false, length=64)
    public String getEscNombre() {
        return this.escNombre;
    }
    
    public void setEscNombre(String escNombre) {
        this.escNombre = escNombre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ESC_FECHA_CREACION", nullable=false, length=10)
    public Date getEscFechaCreacion() {
        return this.escFechaCreacion;
    }
    
    public void setEscFechaCreacion(Date escFechaCreacion) {
        this.escFechaCreacion = escFechaCreacion;
    }

    
    @Column(name="ESC_ESTADO", nullable=false, length=1)
    public String getEscEstado() {
        return this.escEstado;
    }
    
    public void setEscEstado(String escEstado) {
        this.escEstado = escEstado;
    }

    
    @Column(name="ESC_LUGAR_REUNION")
    public String getEscLugarReunion() {
        return this.escLugarReunion;
    }
    
    public void setEscLugarReunion(String escLugarReunion) {
        this.escLugarReunion = escLugarReunion;
    }

    
    @Column(name="ESC_USU_ADD", nullable=false)
    public int getEscUsuAdd() {
        return this.escUsuAdd;
    }
    
    public void setEscUsuAdd(int escUsuAdd) {
        this.escUsuAdd = escUsuAdd;
    }

    
    @Column(name="ESC_USU_UPD")
    public Integer getEscUsuUpd() {
        return this.escUsuUpd;
    }
    
    public void setEscUsuUpd(Integer escUsuUpd) {
        this.escUsuUpd = escUsuUpd;
    }

    
    @Column(name="ESC_USU_DEL")
    public Integer getEscUsuDel() {
        return this.escUsuDel;
    }
    
    public void setEscUsuDel(Integer escUsuDel) {
        this.escUsuDel = escUsuDel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ESC_FECHA_ADD", nullable=false, length=19)
    public Date getEscFechaAdd() {
        return this.escFechaAdd;
    }
    
    public void setEscFechaAdd(Date escFechaAdd) {
        this.escFechaAdd = escFechaAdd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ESC_FECHA_UPD", length=19)
    public Date getEscFechaUpd() {
        return this.escFechaUpd;
    }
    
    public void setEscFechaUpd(Date escFechaUpd) {
        this.escFechaUpd = escFechaUpd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ESC_FECHA_DEL", length=19)
    public Date getEscFechaDel() {
        return this.escFechaDel;
    }
    
    public void setEscFechaDel(Date escFechaDel) {
        this.escFechaDel = escFechaDel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="escuela")
    public Set<Grupo> getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }




}


