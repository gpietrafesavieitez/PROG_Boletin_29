package boletin_29_1;

public class Deportivo extends Barco {
    private int potencia;

    public Deportivo(String matricula, int eslora, int potencia) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    @Override
    public int calcularAlquiler(int dias){
        return super.calcularAlquiler(dias) + this.potencia * 2;
    }

    @Override
    public String toString() {
        return ": Deportivo" + super.toString();
    }
}