package api.entidades;

import java.util.Date;

public class Asegurado {

    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefonos;
    private String email;
    private Date fec_ingreso;
    private Integer sucursal_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFec_ingreso() {
        return fec_ingreso;
    }

    public void setFec_ingreso(Date fec_ingreso) {
        this.fec_ingreso = fec_ingreso;
    }

    public Integer getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(Integer sucursal_id) {
        this.sucursal_id = sucursal_id;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefonos='" + telefonos + '\'' +
                ", email='" + email + '\'' +
                ", fec_ingreso=" + fec_ingreso +
                ", sucursal_id=" + sucursal_id +
                '}';
    }
}
