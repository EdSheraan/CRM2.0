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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name="rol"
    ,catalog="dbcrm"
)
public class Rol  implements java.io.Serializable {


     private Integer idRol;
     private String rolNombre;
     private String rolCodigo;
     private String rolEstado;
     private Set<Privilegio> privilegios = new HashSet<Privilegio>(0);
     private Set<Detrol> detrols = new HashSet<Detrol>(0);

    public Rol() {
    }

	
    public Rol(String rolNombre, String rolCodigo, String rolEstado) {
        this.rolNombre = rolNombre;
        this.rolCodigo = rolCodigo;
        this.rolEstado = rolEstado;
    }
    public Rol(String rolNombre, String rolCodigo, String rolEstado, Set<Privilegio> privilegios, Set<Detrol> detrols) {
       this.rolNombre = rolNombre;
       this.rolCodigo = rolCodigo;
       this.rolEstado = rolEstado;
       this.privilegios = privilegios;
       this.detrols = detrols;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idROL", unique=true, nullable=false)
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    
    @Column(name="ROL_NOMBRE", nullable=false, length=64)
    public String getRolNombre() {
        return this.rolNombre;
    }
    
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    
    @Column(name="ROL_CODIGO", nullable=false, length=4)
    public String getRolCodigo() {
        return this.rolCodigo;
    }
    
    public void setRolCodigo(String rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    
    @Column(name="ROL_ESTADO", nullable=false, length=1)
    public String getRolEstado() {
        return this.rolEstado;
    }
    
    public void setRolEstado(String rolEstado) {
        this.rolEstado = rolEstado;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="detprivilegio", catalog="dbcrm", joinColumns = { 
        @JoinColumn(name="idROL", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="idPRIVILEGIO", nullable=false, updatable=false) })
    public Set<Privilegio> getPrivilegios() {
        return this.privilegios;
    }
    
    public void setPrivilegios(Set<Privilegio> privilegios) {
        this.privilegios = privilegios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Detrol> getDetrols() {
        return this.detrols;
    }
    
    public void setDetrols(Set<Detrol> detrols) {
        this.detrols = detrols;
    }




}


