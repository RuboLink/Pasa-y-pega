public interface Enemigo {
    public static int vida = 100;
    public static int defensa = 100;
    public static String nombre = "Pepito";
    public static int ataque = 100;

    void setVida();

    int getVida();

    void setDefensa();

    int getDefensa();

    void setNombre();

    String getNombre();

}