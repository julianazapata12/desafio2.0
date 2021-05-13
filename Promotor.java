package dominio;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolantes;
    private int comprasVolante;
    private String nombre;

    public Promotor(String nombre, int volantesRepartidos, long valorVolantes, int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolantes = valorVolantes;
        this.comprasVolante = comprasVolante;
    }

    public String nombre(){
        return nombre;
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolantes() {
        return valorVolantes;
    }

    public void setValorVolantes(long valorVolantes) {
        this.valorVolantes = valorVolantes;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

    @Override
    protected long calcularSalario() {

        return (volantesRepartidos*valorVolantes)+(17000 *comprasVolante);
    }
}
