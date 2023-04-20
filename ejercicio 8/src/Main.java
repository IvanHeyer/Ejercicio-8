public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setNombre("Ivan");
        persona.setEdad(29);
        persona.setTelefono(47410698);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }

}
class Persona {
    private String Nombre;
    private int Edad;
    private int Telefono;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getTelefono() {
        return Telefono;
    }
}