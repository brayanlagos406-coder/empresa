public class Empleado {

    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String identificacion, String nombre, int edad, double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public void mostrarInfo() {
        System.out.println("ID: " + identificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public void aumentarSalario(double porcentaje) {
        salarioBase += salarioBase * porcentaje / 100;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}