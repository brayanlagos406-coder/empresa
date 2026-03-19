public class EmpleadoVentas extends Empleado {

    private double totalVentas;
    private double porcentajeComision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String id, String nombre, int edad, double salarioBase, double totalVentas, double porcentajeComision) {
        super(id, nombre, edad, salarioBase);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;

    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return "EmpleadoVentas{" +
                "totalVentas=" + totalVentas +
                ", porcentajeComision=" + porcentajeComision +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }


    public double calcularSalario() {
        double comision = totalVentas * porcentajeComision;
        return salarioBase + comision;
    }


    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Total ventas: " + totalVentas);
        System.out.println("Porcentaje comisión: " + porcentajeComision);
        System.out.println("Salario Final: " + calcularSalario());
    }
}