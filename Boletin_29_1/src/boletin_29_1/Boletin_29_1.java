package boletin_29_1;

import java.util.ArrayList;

public class Boletin_29_1 {
    
    public static void imprimirFactura(ArrayList<Barco> lista, int dias){
        for(Barco b : lista){
            System.out.println("FACTURA #" + lista.indexOf(b) + b.toString() + "\n\t- Precio: " + b.calcularAlquiler(dias) + "\n");
        } 
    }

    public static void main(String[] args) {
        ArrayList<Barco> listaBarcos = new ArrayList<>();
        listaBarcos.add(new Velero("123ABC", 6, 3));
        listaBarcos.add(new Deportivo("456DEF", 3, 51));
        listaBarcos.add(new Yate("789GHI", 4, 41, 101));
        imprimirFactura(listaBarcos, 3);
    }
}