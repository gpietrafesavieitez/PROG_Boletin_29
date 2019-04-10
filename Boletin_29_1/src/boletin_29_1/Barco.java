package boletin_29_1;

public abstract class Barco {
    protected String matricula;
    protected int eslora;

    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }
    
    public int calcularAlquiler(int dias){
        return dias * this.eslora * 10;
    }

    @Override
    public String toString() {
        return "\n\t- Matricula: '" + matricula + "'\n\t- Eslora: " + eslora;
    }
}