import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        int opcion;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Registrar empleado administrativo");
            System.out.println("2. Registrar empleado ventas");
            System.out.println("3. Registrar empleado por horas");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Buscar empleado");
            System.out.println("6. Calcular salario final");
            System.out.println("7. Aumentar salario base");
            System.out.println("8. Mostrar empleados mayores de edad");
            System.out.println("9. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("ID:");
                    String id = sc.nextLine();
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Edad:");
                    int edad = sc.nextInt();
                    System.out.println("Salario base:");
                    double salario = sc.nextDouble();
                    System.out.println("Bonificación:");
                    double bono = sc.nextDouble();

                    empleados.add(new EmpleadoAdministrativo(id, nombre, edad, salario, bono));
                    break;

                case 2:
                    System.out.println("ID:");
                    id = sc.nextLine();
                    System.out.println("Nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Edad:");
                    edad = sc.nextInt();
                    System.out.println("Salario base:");
                    salario = sc.nextDouble();
                    System.out.println("Total ventas:");
                    double ventas = sc.nextDouble();
                    System.out.println("Porcentaje comisión:");
                    double comision = sc.nextDouble();

                    empleados.add(new EmpleadoVentas(id, nombre, edad, salario, ventas, comision));
                    break;

                case 3:
                    System.out.println("ID:");
                    id = sc.nextLine();
                    System.out.println("Nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Edad:");
                    edad = sc.nextInt();
                    System.out.println("Salario base:");
                    salario = sc.nextDouble();
                    System.out.println("Horas trabajadas:");
                    int horas = sc.nextInt();
                    System.out.println("Valor hora:");
                    double valorHora = sc.nextDouble();

                    empleados.add(new EmpleadoHoras(id, nombre, edad, salario, horas, valorHora));
                    break;

                case 4:
                    for (Empleado e : empleados) {
                        e.mostrarInfo();
                        System.out.println("----------------");
                    }
                    break;

                case 5:

                    System.out.println("1. Administrativo");
                    System.out.println("2. Ventas");
                    System.out.println("3. Por horas");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del trabajador");
                    String nombreBuscar = sc.nextLine();

                    if (empleados.isEmpty()) {
                        System.out.println("LA LISTA NO TIENE ELEMENTOS");
                    } else {

                        boolean encontrado = false;

                        for (Empleado e : empleados) {


                            if (tipo == 1 && e instanceof EmpleadoAdministrativo) {

                                if (e.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                    e.mostrarInfo();
                                    encontrado = true;
                                }
                            }


                            else if (tipo == 2 && e instanceof EmpleadoVentas) {

                                if (e.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                    e.mostrarInfo();
                                    encontrado = true;
                                }
                            }


                            else if (tipo == 3 && e instanceof EmpleadoHoras) {

                                if (e.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                    e.mostrarInfo();
                                    encontrado = true;
                                }
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Empleado no encontrado en esa categoría");
                        }
                    }

                    break;

                case 6:
                    for (Empleado e : empleados) {
                        System.out.println("Salario final de " + e.nombre + ": " + e.calcularSalario());
                    }
                    break;

                case 7:
                    System.out.println("ID empleado:");
                    String buscar = sc.nextLine();
                    System.out.println("Porcentaje aumento:");
                    double p = sc.nextDouble();

                    for (Empleado e : empleados) {
                        if (e.getIdentificacion().equals(buscar)) {
                            e.aumentarSalario(p);
                        }
                    }
                    break;

                case 8:
                    for (Empleado e : empleados) {
                        if (e.esMayorEdad()) {
                            e.mostrarInfo();
                        }
                    }
                    break;
            }

        } while (opcion != 9);

    }
}