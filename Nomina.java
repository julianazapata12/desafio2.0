package dominio;


import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados1 = new ArrayList<>();

    public Nomina(List<Empleado> empleados1) {
            this. empleados1 = empleados1;
    }

    public void calcularNomina() {
        empleados1.forEach(empleado -> {
            System.out.println("salario" + empleado.getNombre() + ":" + empleado.calcularSalario());
        });

    }

    public void listarDirectos() {
        System.out.println("empleados directos");
        empleados1.forEach(empleado -> {
            if(empleado instanceof Directo){
                System.out.println(empleado.getNombre());
            }

        });

    }

    public void listarFreelancers() {
        System.out.println("Freelancers");
        empleados1.forEach(empleado -> {
            if(empleado instanceof Directo){
                System.out.println(empleado.getNombre());
            }

        });


    }

    public void listarPromotores() {
        System.out.println("Promotores");
        empleados1.forEach(empleado -> {
            if(empleado instanceof Directo){
                System.out.println(empleado.getNombre());
            }

        });
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados1 = empleados1 ;
    }
    public  List < Empleado > getEmpleados1 () {
        return empleados1;
    }
}