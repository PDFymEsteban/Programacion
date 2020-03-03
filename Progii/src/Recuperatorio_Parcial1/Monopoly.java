package Recuperatorio_Parcial1;

public interface Monopoly {
    //aquí implemento los las acciones que va a realizar cada jugador
    public void Jugar();

    //sobrecarga de metodos
    //lo hago asi xq realizan la misma accion, pero puede diferir en cuanto al elemnto
    public void Dar(String algo);
    public void Dar(int cantidad);
}
