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
 * Grupo generated by hbm2java
 */
@Entity
@Table(name="grupo"
    ,catalog="dbcrm"
)
public class Grupo  implements java.io.Serializable {


     private Integer idGrupo;
     private Escuela escuela;
     private String gpoNombre;
     private String gpoLugarReunion;
     private Date gpoFechaCreacion;
     private String gpoEstado;
     private int gpoUsuAdd;
     private Integer gpoUsuUpd;
     private Integer gpoUsuDel;
     private Date gpoFechaAdd;
     private Date gpoFechaUpd;
     private Date gpoFechaDel;
     private Set<Miembrogp> miembrogps = new HashSet<Miembrogp>(0);

    public Grupo() {
    }

	
    public Grupo(Escuela escuela, String gpoNombre, String gpoEstado, int gpoUsuAdd, Date gpoFechaAdd) {
        this.escuela = escuela;
        this.gpoNombre = gpoNombre;
        this.gpoEstado = gpoEstado;
        this.gpoUsuAdd = gpoUsuAdd;
        this.gpoFechaAdd = gpoFechaAdd;
    }
    public Grupo(Escuela escuela, String gpoNombre, String gpoLugarReunion, Date gpoFechaCreacion, String gpoEstado, int gpoUsuAdd, Integer gpoUsuUpd, Integer gpoUsuDel, Date gpoFechaAdd, Date gpoFechaUpd, Date gpoFechaDel, Set<Miembrogp> miembrogps) {
       this.escuela = escuela;
       this.gpoNombre = gpoNombre;
       this.gpoLugarReunion = gpoLugarReunion;
       this.gpoFechaCreacion = gpoFechaCreacion;
       this.gpoEstado = gpoEstado;
       this.gpoUsuAdd = gpoUsuAdd;
       this.gpoUsuUpd = gpoUsuUpd;
       this.gpoUsuDel = gpoUsuDel;
       this.gpoFechaAdd = gpoFechaAdd;
       this.gpoFechaUpd = gpoFechaUpd;
       this.gpoFechaDel = gpoFechaDel;
       this.miembrogps = miembrogps;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idGRUPO", unique=true, nullable=false)
    public Integer getIdGrupo() {
        return this.idGrupo;
    }
    
    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idESCUELA", nullable=false)
    public Escuela getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    
    @Column(name="GPO_NOMBRE", nullable=false, length=64)
    public String getGpoNombre() {
        return this.gpoNombre;
    }
    
    public void setGpoNombre(String gpoNombre) {
        this.gpoNombre = gpoNombre;
    }

    
    @Column(name="GPO_LUGAR_REUNION")
    public String getGpoLugarReunion() {
        return this.gpoLugarReunion;
    }
    
    public void setGpoLugarReunion(String gpoLugarReunion) {
        this.gpoLugarReunion = gpoLugarReunion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="GPO_FECHA_CREACION", length=10)
    public Date getGpoFechaCreacion() {
        return this.gpoFechaCreacion;
    }
    
    public void setGpoFechaCreacion(Date gpoFechaCreacion) {
        this.gpoFechaCreacion = gpoFechaCreacion;
    }

    
    @Column(name="GPO_ESTADO", nullable=false, length=1)
    public String getGpoEstado() {
        return this.gpoEstado;
    }
    
    public void setGpoEstado(String gpoEstado) {
        this.gpoEstado = gpoEstado;
    }

    
    @Column(name="GPO_USU_ADD", nullable=false)
    public int getGpoUsuAdd() {
        return this.gpoUsuAdd;
    }
    
    public void setGpoUsuAdd(int gpoUsuAdd) {
        this.gpoUsuAdd = gpoUsuAdd;
    }

    
    @Column(name="GPO_USU_UPD")
    public Integer getGpoUsuUpd() {
        return this.gpoUsuUpd;
    }
    
    public void setGpoUsuUpd(Integer gpoUsuUpd) {
        this.gpoUsuUpd = gpoUsuUpd;
    }

    
    @Column(name="GPO_USU_DEL")
    public Integer getGpoUsuDel() {
        return this.gpoUsuDel;
    }
    
    public void setGpoUsuDel(Integer gpoUsuDel) {
        this.gpoUsuDel = gpoUsuDel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="GPO_FECHA_ADD", nullable=false, length=19)
    public Date getGpoFechaAdd() {
        return this.gpoFechaAdd;
    }
    
    public void setGpoFechaAdd(Date gpoFechaAdd) {
        this.gpoFechaAdd = gpoFechaAdd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="GPO_FECHA_UPD", length=19)
    public Date getGpoFechaUpd() {
        return this.gpoFechaUpd;
    }
    
    public void setGpoFechaUpd(Date gpoFechaUpd) {
        this.gpoFechaUpd = gpoFechaUpd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="GPO_FECHA_DEL", length=19)
    public Date getGpoFechaDel() {
        return this.gpoFechaDel;
    }
    
    public void setGpoFechaDel(Date gpoFechaDel) {
        this.gpoFechaDel = gpoFechaDel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupo")
    public Set<Miembrogp> getMiembrogps() {
        return this.miembrogps;
    }
    
    public void setMiembrogps(Set<Miembrogp> miembrogps) {
        this.miembrogps = miembrogps;
    }




}


