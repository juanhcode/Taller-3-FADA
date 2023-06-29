package punto3;

public class Cola<T> {
    private T[] elementos;
    private int inicioCola; //posición del primer elemento en la cola
    private int finCola; //la posición del último elemento en la cola
    private int capacidad; //capacidad máxima de la cola
    private int size; //cantidad actual de elementos en la cola


    public Cola(int capacidad){
        this.capacidad = capacidad;
        this.elementos = (T[]) new Object[capacidad];
        this.inicioCola = 0;
        this.finCola = -1;
        this.size = 0;
    }

    public void agregar(T elemento){
        if(this.size == capacidad){
            throw new IllegalStateException("Está llena");
        }
        finCola++;
        if(finCola >= capacidad){
            finCola = 0;
        }
        elementos[finCola] = elemento;
        size++;
    }

    public T eliminar(){
        if(size == 0){
            throw new IllegalStateException("Está vacía");
        }
        T eliminado = elementos[inicioCola];
        inicioCola++;
        if(inicioCola >= capacidad){
            inicioCola = 0;
        }
        size--;
        return eliminado;
    }

    public T peek(){
        if(this.size == 0){
            throw new IllegalStateException("Está vacia");
        }
        System.out.println(elementos[inicioCola]);
        return this.elementos[inicioCola];
    }

    public boolean esVacia(){
        return this.size == 0;
    }

    public int getSize(){
        return this.size;
    }

    public void imprimirCola(){
        for (int i = 0; i < size ; i++) {
            int posActual = (inicioCola + i) % capacidad;
            System.out.println(elementos[posActual]);
        }
    }
}
