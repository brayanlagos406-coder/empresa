public class EmpleadoAdministrativo extends Empleado {

    private double bonificacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public EmpleadoAdministrativo(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
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
        return super.toString()+ "EmpleadoAdministrativo{" +
                "bonificacion=" + bonificacion +
                '}';
    }


    public void mostrarInfo(){

        System.out.println("nombre" + nombre);
        System.out.println("edad" + edad);
        System.out.println("salarioBase" + salarioBase);
        System.out.println("bonificacion" + bonificacion);


    }

}
