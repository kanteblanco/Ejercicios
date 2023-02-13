public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10, 30, 40);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();

        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 5;

    public void AgregarPuerta() {
        this.puertas++;
    }
}