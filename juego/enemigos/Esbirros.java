package enemigos;
import Juego.IEnemigo;

public abstract class Esbirros implements IEnemigo{

    private String nombre;
    
    @Override
    void setNombre(nombre){
        this.nombre = nombre;
    }

    @Override
    String getNombre(){
        return this.nombre;
    }

}