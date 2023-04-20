public class Main {
    public static void main(String[] args){

Coche micoche = new Coche();
micoche.AgregarPuerta();
        micoche.AgregarPuerta();

System.out.println(micoche.puertas);

    }
    static class Coche {
        public int puertas = 2;

        public void AgregarPuerta() {
            this.puertas++;
        }

    }

}
