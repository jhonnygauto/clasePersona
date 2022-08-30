public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Juan Pérez");
        persona1.setEdad(30);
        persona1.setTelefono("(0973)166410");

        String nombre = persona1.getNombre();
        int edad = persona1.getEdad();
        String telefono = persona1.getTelefono();
        System.out.println(nombre + " " + edad + " " + telefono);
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}