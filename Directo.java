package dominio;

public class Directo extends Empleado {
    private long salario;
    private long calcularSalud;
    private long calcularPension;

    public Directo(String nombre, long salario, long calcularSalud) {
        super(nombre);
        this.salario= salario;
        this.calcularSalud= calcularSalud;
        this.calcularPension= calcularPension();


    }

    public Directo(String nombre, int salario) {
        super(nombre);
        this.salario= salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public long calcularSalud(){
        return (long) (salario*0.07);
    }

    public long getCalcularSalud() {

        return calcularSalud;
    }

    public void setCalcularSalud(long calcularSalud) {

        this.calcularSalud = calcularSalud;
    }
    public long calcularPension(){
        return (long) (salario*0.065);

    }

    public long getCalcularPension() {
        return calcularPension;
    }

    public void setCalcularPension(long calcularPension) {
        this.calcularPension = calcularPension;
    }

    @Override
    protected long calcularSalario() {
        long Salario=salario;
        Salario-=(calcularPension()+calcularSalud());
        return Salario;
    }
}