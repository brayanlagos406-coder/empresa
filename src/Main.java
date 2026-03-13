import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Empleado> lstEmpleados = new ArrayList<>();

        int op;

        do{

            System.out.println("1. Crear Empleado administrativo");
            System.out.println("2. Crear Empleado de ventas");
            System.out.println("3. Crear Empleado por horas");
            System.out.println("4. Mostrar informacion");
            System.out.println("5. Buscar Empleado");

            op = sc.nextInt();
            switch (op){

                case 1:
                    System.out.println("1.Crear Empleado administrativo");

                    System.out.println("Ingrese el Nombre");
                    String nombre1 = sc.next();


                    System.out.println("Ingrese la edad");
                    int edad1 = sc.nextInt();

                    System.out.println("Ingrese el salario base");
                    double salarioBase1 = sc.nextDouble();

                    System.out.println("Ingrese la Bonificasion");
                    double bonificacion = sc.nextDouble();

                    EmpleadoAdministrativo  ed1 = new EmpleadoAdministrativo(nombre1,  edad1, salarioBase1, bonificacion);

                    lstEmpleados.add(ed1);
                    break;


                case 2:
                    System.out.println("1.Crear Empleado de Ventas");

                    System.out.println("Ingrese el Nombre");
                    String nombre2 = sc.next();


                    System.out.println("Ingrese la edad");
                    int edad2 = sc.nextInt();

                    System.out.println("Ingrese el salario base");
                    double salarioBase2 = sc.nextDouble();

                    System.out.println("Ingrese el total de ventas");
                    double totalVentas = sc.nextDouble();

                    System.out.println("Ingrese la comision");
                    double comision = sc.nextDouble();

                    EmpleadoVentas  ev1 = new EmpleadoVentas(nombre2,  edad2, salarioBase2, totalVentas, comision);

                    lstEmpleados.add(ev1);
                    break;


                case 3:
                    System.out.println("1.Crear Empleado por horas");

                    System.out.println("Ingrese el Nombre");
                    String nombre3 = sc.next();


                    System.out.println("Ingrese la edad");
                    int edad3 = sc.nextInt();

                    System.out.println("Ingrese el salario base");
                    double salarioBase3 = sc.nextDouble();

                    System.out.println("Ingrese el valor de la hora");
                    double valorHora = sc.nextDouble();

                    System.out.println("Ingrese las horas trabajadas");
                    int horasTrabajadas = sc.nextInt();

                    EmpleadoHoras  eh1 = new EmpleadoHoras(nombre3,  edad3, salarioBase3, valorHora, horasTrabajadas);

                    lstEmpleados.add(eh1);
                    break;

                case 4:

                    for (Empleado mostarInfo : lstEmpleados) {
                        System.out.println(mostarInfo);
                    }
                    break;


                case 5:

                    System.out.println("Ingrese el nombre del trabajador");
                    String nombreBuscar = sc.next();

                    if (lstEmpleados.isEmpty()) {
                        System.out.println("LA LISTA NO TIENE ELEMENTOS");
                    } else {

                        Empleado emp = null;

                        for (Empleado mostrarInfo: lstEmpleados) {

                            if (mostrarInfo.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                emp = mostrarInfo;
                                System.out.println(emp.toString());
                            }

                        }

                        if (emp == null) {
                            System.out.println("Empleado no encontrado");
                        }
                    }

                    break;

















            }









        } while (op!=7);


        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}