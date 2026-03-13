public class EmpleadoHoras extends Empleado{

    private double valorHora ;
    private int horasTrabajadas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(double valorHora, int horasTrabajadas) {
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoHoras(String nombre, int edad, double salarioBase, double valorHora, int horasTrabajadas) {
        super(nombre, edad, salarioBase);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString()+ "EmpleadoHoras{" +
                "valorHora=" + valorHora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }
    public void mostrarInfo(){

        System.out.println("nombre" + nombre);
        System.out.println("edad" + edad);
        System.out.println("salarioBase" + salarioBase);
        System.out.println("horasTrabajadas" + horasTrabajadas);
        System.out.println("valorHora" + valorHora);




    }
}

