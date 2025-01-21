package mx.jponce.school.springboot.reuniones.models;

public class Persona {
    private long id;
    private String nombre;
    private  String apellidos;

    public Persona(){}

    public Persona(long id, String nombre, String apellidos){
    super();
    this.id=id;
    this.nombre=nombre;
    this.apellidos=apellidos;
    }
    // Getters
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
