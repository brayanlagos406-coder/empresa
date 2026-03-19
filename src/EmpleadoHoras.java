public class EmpleadoHoras extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String id, String nombre, int edad, double salarioBase, int horasTrabajadas, double valorHora) {
        super(id, nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                ", identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }


    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }


    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor hora: " + valorHora);
        System.out.println("Salario Final: " + calcularSalario());
    }
}