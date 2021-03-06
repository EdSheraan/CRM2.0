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
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,catalog="dbcrm"
)
public class Persona  implements java.io.Serializable {


     private Integer idPersona;
     private Documento documento;
     private String perNombres;
     private String perApellidos;
     private String perDocumento;
     private Date perFecNacimiento;
     private String perCorreo;
     private String perDireccion;
     private String perTelefono;
     private String perBautizado;
     private String perSexo;
     private Date perFechaBautismo;
     private String perFoto;
     private String perEstado;
     private int perUsuAdd;
     private Integer perUsuUpd;
     private Integer perUsuDel;
     private Date perFechaAdd;
     private Date perFechaUpd;
     private Date perFechaDel;
     private Set<Miembromin> miembromins = new HashSet<>(0);
     private Set<Usuario> usuarios = new HashSet<>(0);
     private Set<Miembrogp> miembrogps = new HashSet<>(0);

    public Persona() {
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPERSONA", unique=true, nullable=false)
    public Integer getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDOCUMENTO", nullable=false)
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    
    @Column(name="PER_NOMBRES", nullable=false, length=64)
    public String getPerNombres() {
        return this.perNombres;
    }
    
    public void setPerNombres(String perNombres) {
        this.perNombres = perNombres;
    }

    
    @Column(name="PER_APELLIDOS", nullable=false, length=64)
    public String getPerApellidos() {
        return this.perApellidos;
    }
    
    public void setPerApellidos(String perApellidos) {
        this.perApellidos = perApellidos;
    }

    
    @Column(name="PER_DOCUMENTO", nullable=false, length=15)
    public String getPerDocumento() {
        return this.perDocumento;
    }
    
    public void setPerDocumento(String perDocumento) {
        this.perDocumento = perDocumento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="PER_FEC_NACIMIENTO", length=10)
    public Date getPerFecNacimiento() {
        return this.perFecNacimiento;
    }
    
    public void setPerFecNacimiento(Date perFecNacimiento) {
        this.perFecNacimiento = perFecNacimiento;
    }

    
    @Column(name="PER_CORREO", length=128)
    public String getPerCorreo() {
        return this.perCorreo;
    }
    
    public void setPerCorreo(String perCorreo) {
        this.perCorreo = perCorreo;
    }

    
    @Column(name="PER_DIRECCION")
    public String getPerDireccion() {
        return this.perDireccion;
    }
    
    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    
    @Column(name="PER_TELEFONO", length=20)
    public String getPerTelefono() {
        return this.perTelefono;
    }
    
    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    
    @Column(name="PER_BAUTIZADO", nullable=false, length=1)
    public String getPerBautizado() {
        return this.perBautizado;
    }
    
    public void setPerBautizado(String perBautizado) {
        this.perBautizado = perBautizado;
    }

    
    @Column(name="PER_SEXO", nullable=false, length=1)
    public String getPerSexo() {
        return this.perSexo;
    }
    
    public void setPerSexo(String perSexo) {
        this.perSexo = perSexo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="PER_FECHA_BAUTISMO", length=10)
    public Date getPerFechaBautismo() {
        return this.perFechaBautismo;
    }
    
    public void setPerFechaBautismo(Date perFechaBautismo) {
        this.perFechaBautismo = perFechaBautismo;
    }

    
    @Column(name="PER_FOTO")
    public String getPerFoto() {
        return this.perFoto;
    }
    
    public void setPerFoto(String perFoto) {
        this.perFoto = perFoto;
    }

    
    @Column(name="PER_ESTADO", nullable=false, length=1)
    public String getPerEstado() {
        return this.perEstado;
    }
    
    public void setPerEstado(String perEstado) {
        this.perEstado = perEstado;
    }

    
    @Column(name="PER_USU_ADD", nullable=false)
    public int getPerUsuAdd() {
        return this.perUsuAdd;
    }
    
    public void setPerUsuAdd(int perUsuAdd) {
        this.perUsuAdd = perUsuAdd;
    }

    
    @Column(name="PER_USU_UPD")
    public Integer getPerUsuUpd() {
        return this.perUsuUpd;
    }
    
    public void setPerUsuUpd(Integer perUsuUpd) {
        this.perUsuUpd = perUsuUpd;
    }

    
    @Column(name="PER_USU_DEL")
    public Integer getPerUsuDel() {
        return this.perUsuDel;
    }
    
    public void setPerUsuDel(Integer perUsuDel) {
        this.perUsuDel = perUsuDel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PER_FECHA_ADD", nullable=false, length=19)
    public Date getPerFechaAdd() {
        return this.perFechaAdd;
    }
    
    public void setPerFechaAdd(Date perFechaAdd) {
        this.perFechaAdd = perFechaAdd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PER_FECHA_UPD", length=19)
    public Date getPerFechaUpd() {
        return this.perFechaUpd;
    }
    
    public void setPerFechaUpd(Date perFechaUpd) {
        this.perFechaUpd = perFechaUpd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PER_FECHA_DEL", length=19)
    public Date getPerFechaDel() {
        return this.perFechaDel;
    }
    
    public void setPerFechaDel(Date perFechaDel) {
        this.perFechaDel = perFechaDel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Miembromin> getMiembromins() {
        return this.miembromins;
    }
    
    public void setMiembromins(Set<Miembromin> miembromins) {
        this.miembromins = miembromins;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Miembrogp> getMiembrogps() {
        return this.miembrogps;
    }
    
    public void setMiembrogps(Set<Miembrogp> miembrogps) {
        this.miembrogps = miembrogps;
    }




}


