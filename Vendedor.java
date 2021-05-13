package dominio;

public class Vendedor extends Directo {
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, (int) salario);
        this.ventasDelMes = ventasDelMes;

    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        long Comision = 0;
        if (ventasDelMes<=999999){
            Comision += ventasDelMes * 0.05;
        }
        else
        {
            Comision+=ventasDelMes * 0.045;
        }
        return Comision;
    }
    @Override
    protected long calcularSalario() {
        long salar=getSalario();
        salar+=this.calcularComision();
        salar-=(calcularSalud()+calcularPension());
        return salar;
    }
}

