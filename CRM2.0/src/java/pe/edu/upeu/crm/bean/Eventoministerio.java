package pe.edu.upeu.crm.bean;
// Generated 11/11/2017 08:16:09 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eventoministerio generated by hbm2java
 */
@Entity
@Table(name="eventoministerio"
    ,catalog="dbcrm"
)
public class Eventoministerio  implements java.io.Serializable {


     private EventoministerioId id;
     private Integer evmPresentes;
     private Integer evmFaltas;
     private Integer evmVisitas;
     private String evmDescripcion;
     private String evmLugar;
     private Date evmFechaRegistro;
     private String evmEstado;

    public Eventoministerio() {
    }

	
    public Eventoministerio(EventoministerioId id) {
        this.id = id;
    }
    public Eventoministerio(EventoministerioId id, Integer evmPresentes, Integer evmFaltas, Integer evmVisitas, String evmDescripcion, String evmLugar, Date evmFechaRegistro, String evmEstado) {
       this.id = id;
       this.evmPresentes = evmPresentes;
       this.evmFaltas = evmFaltas;
       this.evmVisitas = evmVisitas;
       this.evmDescripcion = evmDescripcion;
       this.evmLugar = evmLugar;
       this.evmFechaRegistro = evmFechaRegistro;
       this.evmEstado = evmEstado;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idMinisterio", column=@Column(name="idMINISTERIO", nullable=false) ), 
        @AttributeOverride(name="idEvento", column=@Column(name="idEVENTO", nullable=false) ) } )
    public EventoministerioId getId() {
        return this.id;
    }
    
    public void setId(EventoministerioId id) {
        this.id = id;
    }

    
    @Column(name="EVM_PRESENTES")
    public Integer getEvmPresentes() {
        return this.evmPresentes;
    }
    
    public void setEvmPresentes(Integer evmPresentes) {
        this.evmPresentes = evmPresentes;
    }

    
    @Column(name="EVM_FALTAS")
    public Integer getEvmFaltas() {
        return this.evmFaltas;
    }
    
    public void setEvmFaltas(Integer evmFaltas) {
        this.evmFaltas = evmFaltas;
    }

    
    @Column(name="EVM_VISITAS")
    public Integer getEvmVisitas() {
        return this.evmVisitas;
    }
    
    public void setEvmVisitas(Integer evmVisitas) {
        this.evmVisitas = evmVisitas;
    }

    
    @Column(name="EVM_DESCRIPCION")
    public String getEvmDescripcion() {
        return this.evmDescripcion;
    }
    
    public void setEvmDescripcion(String evmDescripcion) {
        this.evmDescripcion = evmDescripcion;
    }

    
    @Column(name="EVM_LUGAR")
    public String getEvmLugar() {
        return this.evmLugar;
    }
    
    public void setEvmLugar(String evmLugar) {
        this.evmLugar = evmLugar;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EVM_FECHA_REGISTRO", length=19)
    public Date getEvmFechaRegistro() {
        return this.evmFechaRegistro;
    }
    
    public void setEvmFechaRegistro(Date evmFechaRegistro) {
        this.evmFechaRegistro = evmFechaRegistro;
    }

    
    @Column(name="EVM_ESTADO", length=1)
    public String getEvmEstado() {
        return this.evmEstado;
    }
    
    public void setEvmEstado(String evmEstado) {
        this.evmEstado = evmEstado;
    }




}


