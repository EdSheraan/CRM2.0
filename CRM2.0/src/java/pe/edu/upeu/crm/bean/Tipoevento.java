package pe.edu.upeu.crm.bean;
// Generated 05/10/2017 11:55:25 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipoevento generated by hbm2java
 */
@Entity
@Table(name="tipoevento"
    ,catalog="dbcrm"
)
public class Tipoevento  implements java.io.Serializable {


     private Integer idTipoevento;
     private String tipNombre;
     private String tipCodigo;
     private String tipEstado;
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public Tipoevento() {
    }

	
    public Tipoevento(String tipNombre, String tipCodigo, String tipEstado) {
        this.tipNombre = tipNombre;
        this.tipCodigo = tipCodigo;
        this.tipEstado = tipEstado;
    }
    public Tipoevento(String tipNombre, String tipCodigo, String tipEstado, Set<Evento> eventos) {
       this.tipNombre = tipNombre;
       this.tipCodigo = tipCodigo;
       this.tipEstado = tipEstado;
       this.eventos = eventos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idTIPOEVENTO", unique=true, nullable=false)
    public Integer getIdTipoevento() {
        return this.idTipoevento;
    }
    
    public void setIdTipoevento(Integer idTipoevento) {
        this.idTipoevento = idTipoevento;
    }

    
    @Column(name="TIP_NOMBRE", nullable=false, length=64)
    public String getTipNombre() {
        return this.tipNombre;
    }
    
    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }

    
    @Column(name="TIP_CODIGO", nullable=false, length=4)
    public String getTipCodigo() {
        return this.tipCodigo;
    }
    
    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    
    @Column(name="TIP_ESTADO", nullable=false, length=1)
    public String getTipEstado() {
        return this.tipEstado;
    }
    
    public void setTipEstado(String tipEstado) {
        this.tipEstado = tipEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoevento")
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }




}


