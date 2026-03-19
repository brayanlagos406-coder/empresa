public class EmpleadoAdministrativo extends Empleado {

    private double bonificacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String id, String nombre, int edad, double salarioBase, double bonificacion) {
        super(id, nombre, edad, salarioBase);
        this.bonificacion = bonificacion;

    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "EmpleadoAdministrativo{" +
                "bonificacion=" + bonificacion +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }


    public double calcularSalario() {
        return salarioBase + bonificacion;
    }


    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("Salario Final: " + calcularSalario());
    }
}