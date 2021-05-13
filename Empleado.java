package dominio;

public  abstract class Empleado {
    private String nombre;
    private Nomina nomina;

    public Empleado(String nombre){
        this.nombre = nombre;
    }


    protected abstract long calcularSalario();


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public Nomina getNomina(){
        return nomina;
    }
    public void setNomina(Nomina nomina){
        this.nomina = nomina;
    }

}
