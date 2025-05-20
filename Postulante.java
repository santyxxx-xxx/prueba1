public class Postulante {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String nacionalidad;
    private String condicionSocioeconomica;
    private String carrera;
    private double promedio;

    // Constructor 1: Solo nombre y apellido
    public Postulante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor 2: Nombre, apellido y carrera (con edad 18 y promedio 78.0 por defecto)
    public Postulante(String nombre, String apellido, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = 18;
        this.promedio = 78.0;
    }

    // Constructor 3: Todos los datos
    public Postulante(String nombre, String apellido, int edad, String telefono, String correo,
                      String nacionalidad, String condicionSocioeconomica, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.condicionSocioeconomica = condicionSocioeconomica;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Métodos get y set
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getCondicionSocioeconomica() { return condicionSocioeconomica; }
    public void setCondicionSocioeconomica(String condicionSocioeconomica) { this.condicionSocioeconomica = condicionSocioeconomica; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public boolean cumpleRequisitos() {
        return "baja".equalsIgnoreCase(condicionSocioeconomica) && edad > 18 && promedio >= 85;
    }

    public void mostrarDatos() {
        if (cumpleRequisitos()) {
            System.out.println("----- Postulante Apto -----");
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
            System.out.println("Promedio: " + promedio);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Condición socioeconómica: " + condicionSocioeconomica);
        } else {
            System.out.println("----- Postulante No Apto -----");
            System.out.println("El postulante no cumple los requisitos");
        }
    }
}

