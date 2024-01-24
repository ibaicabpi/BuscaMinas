import java.util.Random;

public class Bombero {

    private Random random;
    private Posicion[] posiciones;
    private int total;

    public Bombero(int max){
        random = new Random();
        posiciones = new Posicion[max];
        total = 0;
        // TODO: Bombero DONE
    }

    public Posicion getPosicion(int i){
        // TODO: getPosicion DONE

        return posiciones[i];
    }

    public boolean hayBombaEn(int fila, int columna) {
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i].equals(fila, columna)){

            }

        }
        // TODO: hayBombaEn DONE
        return false;
    }

    public void ponerBombas(int numFilas, int numColumnas, int numBombas) {
        if (numBombas >= numFilas*numColumnas){
            todoSonBombas(numFilas, numColumnas);
        }else if(numBombas >= numFilas * numColumnas / 2){
            todoSonBombas(numFilas, numColumnas);
            eliminarBombas(numFilas * numColumnas - numBombas);
        }else{
            ponerAlgunasBombas(numFilas, numColumnas, numBombas);
        }
    }

    private void ponerAlgunasBombas(int numFilas, int numColumnas, int numBombas) {
        Random rnd = new Random();
        int fila, columna;
        fila = numFilas;
        columna = numColumnas;
        while (numBombas > 0){
            if (posiciones[numFilas*numColumnas].equals(!hayBombaEn(numFilas, numColumnas))){
             fila = rnd.nextInt(numBombas);
             columna = rnd.nextInt(numBombas);
            }
        }
        // TODO: ponerAlgunasBombasDONE
    }

    private void todoSonBombas(int numFilas, int numColumnas) {
        for (int i = 0; i < posiciones.length; i++) {
            // TODO: todoSonBombas
        }
    }

    private void eliminarBombas(int n){

        // TODO: eliminarBombas
    }

    private void eliminarBomba(){
        // TODO: eliminarBomba
    }

    public String toString() {
        String s = "[";
        if (total > 0){
            s += posiciones[0].toString();
        }
        for (int i = 1; i < total; i++) {
            s += ", " + posiciones[i].toString();

        }
        s += "]";
        return s;
    }

}
