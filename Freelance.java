package dominio;

public class Freelance extends Empleado {
    private long valorHora;
    private  int horasTrabajadas;
    private String nombre;

    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }



    @Override
    protected long calcularSalario() {
        return horasTrabajadas*valorHora;
    }

    public String Nombre(){
        return nombre;
    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
