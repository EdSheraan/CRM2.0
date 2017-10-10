package pe.edu.upeu.crm.bean;
// Generated 05/10/2017 07:39:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Evento generated by hbm2java
 */
@Entity
@Table(name="evento"
    ,catalog="dbcrm"
)
public class Evento  implements java.io.Serializable {


     private int idEvento;
     private Periodo periodo;
     private Tipoevento tipoevento;
     private String evtNombre;
     private String evtDescripcion;
     private String evtLugar;
     private Date evtFecha;
     private Date evtFechaLimite;
     private int evtDistrito;
     private int evtIglesia;
     private String evtEstado;
     private int evtUsuAdd;
     private Integer evtUsuUpd;
     private Integer evtUsuEli;
     private Date evtFechaAdd;
     private Date evtFechaUpd;
     private Date evtFechaEli;
     private Set<Asistenciaevt> asistenciaevts = new HashSet<Asistenciaevt>(0);

    public Evento() {
    }

	
    public Evento(int idEvento, Periodo periodo, Tipoevento tipoevento, String evtNombre, Date evtFecha, int evtDistrito, int evtIglesia, int evtUsuAdd, Date evtFechaAdd) {
        this.idEvento = idEvento;
        this.periodo = periodo;
        this.tipoevento = tipoevento;
        this.evtNombre = evtNombre;
        this.evtFecha = evtFecha;
        this.evtDistrito = evtDistrito;
        this.evtIglesia = evtIglesia;
        this.evtUsuAdd = evtUsuAdd;
        this.evtFechaAdd = evtFechaAdd;
    }
    public Evento(int idEvento, Periodo periodo, Tipoevento tipoevento, String evtNombre, String evtDescripcion, String evtLugar, Date evtFecha, Date evtFechaLimite, int evtDistrito, int evtIglesia, String evtEstado, int evtUsuAdd, Integer evtUsuUpd, Integer evtUsuEli, Date evtFechaAdd, Date evtFechaUpd, Date evtFechaEli, Set<Asistenciaevt> asistenciaevts) {
       this.idEvento = idEvento;
       this.periodo = periodo;
       this.tipoevento = tipoevento;
       this.evtNombre = evtNombre;
       this.evtDescripcion = evtDescripcion;
       this.evtLugar = evtLugar;
       this.evtFecha = evtFecha;
       this.evtFechaLimite = evtFechaLimite;
       this.evtDistrito = evtDistrito;
       this.evtIglesia = evtIglesia;
       this.evtEstado = evtEstado;
       this.evtUsuAdd = evtUsuAdd;
       this.evtUsuUpd = evtUsuUpd;
       this.evtUsuEli = evtUsuEli;
       this.evtFechaAdd = evtFechaAdd;
       this.evtFechaUpd = evtFechaUpd;
       this.evtFechaEli = evtFechaEli;
       this.asistenciaevts = asistenciaevts;
    }
   
     @Id 

    
    @Column(name="idEVENTO", unique=true, nullable=false)
    public int getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPERIODO", nullable=false)
    public Periodo getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTIPOEVENTO", nullable=false)
    public Tipoevento getTipoevento() {
        return this.tipoevento;
    }
    
    public void setTipoevento(Tipoevento tipoevento) {
        this.tipoevento = tipoevento;
    }

    
    @Column(name="EVT_NOMBRE", nullable=false, length=64)
    public String getEvtNombre() {
        return this.evtNombre;
    }
    
    public void setEvtNombre(String evtNombre) {
        this.evtNombre = evtNombre;
    }

    
    @Column(name="EVT_DESCRIPCION")
    public String getEvtDescripcion() {
        return this.evtDescripcion;
    }
    
    public void setEvtDescripcion(String evtDescripcion) {
        this.evtDescripcion = evtDescripcion;
    }

    
    @Column(name="EVT_LUGAR")
    public String getEvtLugar() {
        return this.evtLugar;
    }
    
    public void setEvtLugar(String evtLugar) {
        this.evtLugar = evtLugar;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVT_FECHA", nullable=false, length=19)
    public Date getEvtFecha() {
        return this.evtFecha;
    }
    
    public void setEvtFecha(Date evtFecha) {
        this.evtFecha = evtFecha;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVT_FECHA_LIMITE", length=19)
    public Date getEvtFechaLimite() {
        return this.evtFechaLimite;
    }
    
    public void setEvtFechaLimite(Date evtFechaLimite) {
        this.evtFechaLimite = evtFechaLimite;
    }

    
    @Column(name="EVT_DISTRITO", nullable=false)
    public int getEvtDistrito() {
        return this.evtDistrito;
    }
    
    public void setEvtDistrito(int evtDistrito) {
        this.evtDistrito = evtDistrito;
    }

    
    @Column(name="EVT_IGLESIA", nullable=false)
    public int getEvtIglesia() {
        return this.evtIglesia;
    }
    
    public void setEvtIglesia(int evtIglesia) {
        this.evtIglesia = evtIglesia;
    }

    
    @Column(name="EVT_ESTADO", length=1)
    public String getEvtEstado() {
        return this.evtEstado;
    }
    
    public void setEvtEstado(String evtEstado) {
        this.evtEstado = evtEstado;
    }

    
    @Column(name="EVT_USU_ADD", nullable=false)
    public int getEvtUsuAdd() {
        return this.evtUsuAdd;
    }
    
    public void setEvtUsuAdd(int evtUsuAdd) {
        this.evtUsuAdd = evtUsuAdd;
    }

    
    @Column(name="EVT_USU_UPD")
    public Integer getEvtUsuUpd() {
        return this.evtUsuUpd;
    }
    
    public void setEvtUsuUpd(Integer evtUsuUpd) {
        this.evtUsuUpd = evtUsuUpd;
    }

    
    @Column(name="EVT_USU_ELI")
    public Integer getEvtUsuEli() {
        return this.evtUsuEli;
    }
    
    public void setEvtUsuEli(Integer evtUsuEli) {
        this.evtUsuEli = evtUsuEli;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVT_FECHA_ADD", nullable=false, length=19)
    public Date getEvtFechaAdd() {
        return this.evtFechaAdd;
    }
    
    public void setEvtFechaAdd(Date evtFechaAdd) {
        this.evtFechaAdd = evtFechaAdd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVT_FECHA_UPD", length=19)
    public Date getEvtFechaUpd() {
        return this.evtFechaUpd;
    }
    
    public void setEvtFechaUpd(Date evtFechaUpd) {
        this.evtFechaUpd = evtFechaUpd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVT_FECHA_ELI", length=19)
    public Date getEvtFechaEli() {
        return this.evtFechaEli;
    }
    
    public void setEvtFechaEli(Date evtFechaEli) {
        this.evtFechaEli = evtFechaEli;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="evento")
    public Set<Asistenciaevt> getAsistenciaevts() {
        return this.asistenciaevts;
    }
    
    public void setAsistenciaevts(Set<Asistenciaevt> asistenciaevts) {
        this.asistenciaevts = asistenciaevts;
    }




}

