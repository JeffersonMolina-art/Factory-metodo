package Factory;

public abstract class lavadora {
    protected boolean tieneTambor;
    protected boolean tieneMandos;
    protected String  tipoCarga;

    public void ponerTambor() {
        tieneTambor = true;
    }

    public void ponerMandos() {
        tieneMandos = true;
    }
}
