package Factory;

public abstract class Constructor {
    public lavadora creaLavadora() {
        lavadora lavadorad = creaLavadoraTipo();
        lavadorad.ponerMandos();
        lavadorad.ponerTambor();
        return lavadorad;
    }

    protected abstract lavadora creaLavadoraTipo();
}
