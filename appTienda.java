package app;

import dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appTienda {
    public static void main(String[] args) {

        Empleado Juan= new Directo("Juan", 5360000, 55510000);
        Empleado Julian= new Vendedor("Julian", 2450000, 55510000);
        Empleado Carolina= new Vendedor("Carolina", 990000, 62487000);
        Empleado Johanna = new Freelance("Johanna", 76000, 85);
        Empleado David = new Directo("David", 2895000);
        Empleado Pedro= new Promotor("Pedro", 250, 1500, 48);
        Empleado Gustavo= new Freelance("Gustavo", 52500, 60);

        List<Empleado>empleados1=Arrays.asList (Juan,Julian,Carolina,Johanna,David,Pedro,Gustavo);

        Nomina nomina = new Nomina(empleados1);

        nomina.setEmpleados(empleados1);
        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarPromotores();
        nomina.listarFreelancers();
    }
}
