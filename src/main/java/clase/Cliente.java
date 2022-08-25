package clase;

public class Cliente {

    public String nombre;
    public String cedula;
    public int edad;
    public boolean aplicaDescuento;


    public Cliente() {
    }

    public Cliente(String nombre, String cedula, int edad, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.aplicaDescuento = aplicaDescuento;
    }

    public String saludar (){
        return "";
    }
}
