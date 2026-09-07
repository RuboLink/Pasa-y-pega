package enemigos;

public abstract class JefeFinalDeFase implements IEnemigo {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

}
