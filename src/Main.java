public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad("35");
        String edad = persona.getEdad();
        System.out.println(edad);
        persona.setNombre("Laureano");
        String nombre = persona.getNombre();
        System.out.println(nombre);
        persona.setTelefono("1544940453");
        String telefono = persona.getTelefono();
        System.out.println(telefono);


    }
}

class Persona {
    private String edad;
    private String nombre;
    private String telefono;


    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }


}



