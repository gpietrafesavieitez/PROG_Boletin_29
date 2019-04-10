package boletin_29_1;

public class Yate extends Barco {
    private int potencia, camarotes;

    public Yate(String matricula, int eslora, int potencia, int camarotes) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    @Override
    public int calcularAlquiler(int dias){
        return super.calcularAlquiler(dias) + this.potencia * 2 + this.camarotes * 25;
    }

    @Override
    public String toString() {
        return ": Yate" + super.toString();
    }  
}