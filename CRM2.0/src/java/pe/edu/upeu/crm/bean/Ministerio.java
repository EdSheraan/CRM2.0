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
 * Ministerio generated by hbm2java
 */
@Entity
@Table(name="ministerio"
    ,catalog="dbcrm"
)
public class Ministerio  implements java.io.Serializable {


     private Integer idMinisterio;
     private Iglesia iglesia;
     private String minNombre;
     private String minDescripcion;
     private String minLugarReunion;
     private String minNombreCorto;
     private String minDiaTrabajo;
     private String minEstado;
     private Date minFechaCreacion;
     private int minUsuAdd;
     private Integer minUsuUpd;
     private Integer minUsuDel;
     private Date minFechaAdd;
     private Date minFechaUpd;
     private Date minFechaDel;
     private Set<Miembromin> miembromins = new HashSet<Miembromin>(0);

    public Ministerio() {
    }

	
    public Ministerio(Iglesia iglesia, String minNombre, String minNombreCorto, String minDiaTrabajo, String minEstado, Date minFechaCreacion, int minUsuAdd, Date minFechaAdd) {
        this.iglesia = iglesia;
        this.minNombre = minNombre;
        this.minNombreCorto = minNombreCorto;
        this.minDiaTrabajo = minDiaTrabajo;
        this.minEstado = minEstado;
        this.minFechaCreacion = minFechaCreacion;
        this.minUsuAdd = minUsuAdd;
        this.minFechaAdd = minFechaAdd;
    }
    public Ministerio(Iglesia iglesia, String minNombre, String minDescripcion, String minLugarReunion, String minNombreCorto, String minDiaTrabajo, String minEstado, Date minFechaCreacion, int minUsuAdd, Integer minUsuUpd, Integer minUsuDel, Date minFechaAdd, Date minFechaUpd, Date minFechaDel, Set<Miembromin> miembromins) {
       this.iglesia = iglesia;
       this.minNombre = minNombre;
       this.minDescripcion = minDescripcion;
       this.minLugarReunion = minLugarReunion;
       this.minNombreCorto = minNombreCorto;
       this.minDiaTrabajo = minDiaTrabajo;
       this.minEstado = minEstado;
       this.minFechaCreacion = minFechaCreacion;
       this.minUsuAdd = minUsuAdd;
       this.minUsuUpd = minUsuUpd;
       this.minUsuDel = minUsuDel;
       this.minFechaAdd = minFechaAdd;
       this.minFechaUpd = minFechaUpd;
       this.minFechaDel = minFechaDel;
       this.miembromins = miembromins;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idMINISTERIO", unique=true, nullable=false)
    public Integer getIdMinisterio() {
        return this.idMinisterio;
    }
    
    public void setIdMinisterio(Integer idMinisterio) {
        this.idMinisterio = idMinisterio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idIGLESIA", nullable=false)
    public Iglesia getIglesia() {
        return this.iglesia;
    }
    
    public void setIglesia(Iglesia iglesia) {
        this.iglesia = iglesia;
    }

    
    @Column(name="MIN_NOMBRE", nullable=false, length=64)
    public String getMinNombre() {
        return this.minNombre;
    }
    
    public void setMinNombre(String minNombre) {
        this.minNombre = minNombre;
    }

    
    @Column(name="MIN_DESCRIPCION")
    public String getMinDescripcion() {
        return this.minDescripcion;
    }
    
    public void setMinDescripcion(String minDescripcion) {
        this.minDescripcion = minDescripcion;
    }

    
    @Column(name="MIN_LUGAR_REUNION")
    public String getMinLugarReunion() {
        return this.minLugarReunion;
    }
    
    public void setMinLugarReunion(String minLugarReunion) {
        this.minLugarReunion = minLugarReunion;
    }

    
    @Column(name="MIN_NOMBRE_CORTO", nullable=false, length=16)
    public String getMinNombreCorto() {
        return this.minNombreCorto;
    }
    
    public void setMinNombreCorto(String minNombreCorto) {
        this.minNombreCorto = minNombreCorto;
    }

    
    @Column(name="MIN_DIA_TRABAJO", nullable=false, length=1)
    public String getMinDiaTrabajo() {
        return this.minDiaTrabajo;
    }
    
    public void setMinDiaTrabajo(String minDiaTrabajo) {
        this.minDiaTrabajo = minDiaTrabajo;
    }

    
    @Column(name="MIN_ESTADO", nullable=false, length=1)
    public String getMinEstado() {
        return this.minEstado;
    }
    
    public void setMinEstado(String minEstado) {
        this.minEstado = minEstado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MIN_FECHA_CREACION", nullable=false, length=10)
    public Date getMinFechaCreacion() {
        return this.minFechaCreacion;
    }
    
    public void setMinFechaCreacion(Date minFechaCreacion) {
        this.minFechaCreacion = minFechaCreacion;
    }

    
    @Column(name="MIN_USU_ADD", nullable=false)
    public int getMinUsuAdd() {
        return this.minUsuAdd;
    }
    
    public void setMinUsuAdd(int minUsuAdd) {
        this.minUsuAdd = minUsuAdd;
    }

    
    @Column(name="MIN_USU_UPD")
    public Integer getMinUsuUpd() {
        return this.minUsuUpd;
    }
    
    public void setMinUsuUpd(Integer minUsuUpd) {
        this.minUsuUpd = minUsuUpd;
    }

    
    @Column(name="MIN_USU_DEL")
    public Integer getMinUsuDel() {
        return this.minUsuDel;
    }
    
    public void setMinUsuDel(Integer minUsuDel) {
        this.minUsuDel = minUsuDel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MIN_FECHA_ADD", nullable=false, length=19)
    public Date getMinFechaAdd() {
        return this.minFechaAdd;
    }
    
    public void setMinFechaAdd(Date minFechaAdd) {
        this.minFechaAdd = minFechaAdd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MIN_FECHA_UPD", length=19)
    public Date getMinFechaUpd() {
        return this.minFechaUpd;
    }
    
    public void setMinFechaUpd(Date minFechaUpd) {
        this.minFechaUpd = minFechaUpd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MIN_FECHA_DEL", length=19)
    public Date getMinFechaDel() {
        return this.minFechaDel;
    }
    
    public void setMinFechaDel(Date minFechaDel) {
        this.minFechaDel = minFechaDel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ministerio")
    public Set<Miembromin> getMiembromins() {
        return this.miembromins;
    }
    
    public void setMiembromins(Set<Miembromin> miembromins) {
        this.miembromins = miembromins;
    }




}


