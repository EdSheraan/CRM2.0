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
 * Distrito generated by hbm2java
 */
@Entity
@Table(name="distrito"
    ,catalog="dbcrm"
)
public class Distrito  implements java.io.Serializable {


     private Integer idDistrito;
     private Campo campo;
     private String disNombre;
     private Date disFechaCreacion;
     private String disEstado;
     private Set<Iglesia> iglesias = new HashSet<Iglesia>(0);

    public Distrito() {
    }

	
    public Distrito(Campo campo, String disNombre, Date disFechaCreacion, String disEstado) {
        this.campo = campo;
        this.disNombre = disNombre;
        this.disFechaCreacion = disFechaCreacion;
        this.disEstado = disEstado;
    }
    public Distrito(Campo campo, String disNombre, Date disFechaCreacion, String disEstado, Set<Iglesia> iglesias) {
       this.campo = campo;
       this.disNombre = disNombre;
       this.disFechaCreacion = disFechaCreacion;
       this.disEstado = disEstado;
       this.iglesias = iglesias;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idDISTRITO", unique=true, nullable=false)
    public Integer getIdDistrito() {
        return this.idDistrito;
    }
    
    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCAMPO", nullable=false)
    public Campo getCampo() {
        return this.campo;
    }
    
    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    
    @Column(name="DIS_NOMBRE", nullable=false, length=64)
    public String getDisNombre() {
        return this.disNombre;
    }
    
    public void setDisNombre(String disNombre) {
        this.disNombre = disNombre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DIS_FECHA_CREACION", nullable=false, length=10)
    public Date getDisFechaCreacion() {
        return this.disFechaCreacion;
    }
    
    public void setDisFechaCreacion(Date disFechaCreacion) {
        this.disFechaCreacion = disFechaCreacion;
    }

    
    @Column(name="DIS_ESTADO", nullable=false, length=1)
    public String getDisEstado() {
        return this.disEstado;
    }
    
    public void setDisEstado(String disEstado) {
        this.disEstado = disEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="distrito")
    public Set<Iglesia> getIglesias() {
        return this.iglesias;
    }
    
    public void setIglesias(Set<Iglesia> iglesias) {
        this.iglesias = iglesias;
    }




}


