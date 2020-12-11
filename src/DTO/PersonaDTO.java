package DTO;

public class PersonaDTO{
    
    private String idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    private String usuario;
    private String password;
    private String codigoSeguridad;
    private String rol;
    
    public PersonaDTO(){}

    public PersonaDTO(String idPersona, String nombre, String apellido, String cedula, String telefono, String email, String usuario, String password, String codigoSeguridad, String rol) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.codigoSeguridad = codigoSeguridad;
        this.rol = rol;
    }

    public PersonaDTO(String idPersona, String nombre, String apellido, String cedula, String telefono, String email, String usuario, String password, String codigoSeguridad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.codigoSeguridad = codigoSeguridad;
    }
    
    

    public PersonaDTO(String usu, String pass, String rol) {
        this.usuario = usu;
        this.password = pass;
        this.rol = rol;
    }

    public PersonaDTO(String id) {
        this.idPersona = id;
    }

    public PersonaDTO(String codigo, String email) {
        this.codigoSeguridad = codigo;
        this.email = email;
    }
    
    public PersonaDTO(String nombre, String apellido, String cedula, String telefono, String correo, String usuario, String password, String codigoSeguridad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = correo;
        this.usuario = usuario;
        this.password = password;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    

}