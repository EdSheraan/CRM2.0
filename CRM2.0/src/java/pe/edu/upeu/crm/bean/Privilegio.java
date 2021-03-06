package pe.edu.upeu.crm.bean;
// Generated 11/11/2017 08:16:09 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Privilegio generated by hbm2java
 */
@Entity
@Table(name = "privilegio",
         catalog = "dbcrm"
)
public class Privilegio implements java.io.Serializable {

    private Integer idPrivilegio;
    private String prvNombre;
    private int prvOrden;
    private int prvIdPadre;
    private String prvIcono;
    private String prvLink;
    private String prvEstado;
    private String prvColor;
    private String prvDescripcion;
    private Set<Rol> rols = new HashSet<>(0);

    public Privilegio() {
    }

    public Privilegio(String prvNombre, int prvOrden, int prvIdPadre, String prvIcono, String prvLink, String prvEstado) {
        this.prvNombre = prvNombre;
        this.prvOrden = prvOrden;
        this.prvIdPadre = prvIdPadre;
        this.prvIcono = prvIcono;
        this.prvLink = prvLink;
        this.prvEstado = prvEstado;
    }


    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idPRIVILEGIO", unique = true, nullable = false)
    public Integer getIdPrivilegio() {
        return this.idPrivilegio;
    }

    public void setIdPrivilegio(Integer idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    @Column(name = "PRV_NOMBRE", nullable = false, length = 64)
    public String getPrvNombre() {
        return this.prvNombre;
    }

    public void setPrvNombre(String prvNombre) {
        this.prvNombre = prvNombre;
    }

    @Column(name = "PRV_ORDEN", nullable = false)
    public int getPrvOrden() {
        return this.prvOrden;
    }

    public void setPrvOrden(int prvOrden) {
        this.prvOrden = prvOrden;
    }

    @Column(name = "PRV_ID_PADRE", nullable = false)
    public int getPrvIdPadre() {
        return this.prvIdPadre;
    }

    public void setPrvIdPadre(int prvIdPadre) {
        this.prvIdPadre = prvIdPadre;
    }

    @Column(name = "PRV_ICONO", nullable = false, length = 64)
    public String getPrvIcono() {
        return this.prvIcono;
    }

    public void setPrvIcono(String prvIcono) {
        this.prvIcono = prvIcono;
    }

    @Column(name = "PRV_LINK", nullable = false, length = 64)
    public String getPrvLink() {
        return this.prvLink;
    }

    public void setPrvLink(String prvLink) {
        this.prvLink = prvLink;
    }

    @Column(name = "PRV_ESTADO", nullable = false, length = 1)
    public String getPrvEstado() {
        return this.prvEstado;
    }

    public void setPrvEstado(String prvEstado) {
        this.prvEstado = prvEstado;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "privilegios")
    public Set<Rol> getRols() {
        return this.rols;
    }

    public void setRols(Set<Rol> rols) {
        this.rols = rols;
    }

    @Column(name = "PRV_COLOR", length = 45)
    public String getPrvColor() {
        return this.prvColor;
    }

    public void setPrvColor(String prvColor) {
        this.prvColor = prvColor;
    }

    @Column(name = "PRV_DESCRIPCION", length = 255)
    public String getPrvDescripcion() {
        return this.prvDescripcion;
    }

    public void setPrvDescripcion(String prvDescripcion) {
        this.prvDescripcion = prvDescripcion;
    }
}
