package enemigos;

public abstract class JefeFinalDeFase implements IEnemigo {
    private String nombre;

@Override 
void setNombre(nombre){
    this.nombre=nombre;
}

    @Override
    String getNombre() {
        return this.nombre;
    }

}
