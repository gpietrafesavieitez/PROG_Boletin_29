package boletin_29_1;

public class Velero extends Barco {
    private int mastiles;

    public Velero(String matricula, int eslora, int mastiles) {
        super(matricula, eslora);
        this.mastiles = mastiles;
    }
    
    @Override
    public int calcularAlquiler(int dias){
        return super.calcularAlquiler(dias) + this.mastiles * 8;
    }

    @Override
    public String toString() {
        return ": Velero" + super.toString();
    }
}