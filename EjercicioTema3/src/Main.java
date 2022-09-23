public class Main {
    public static void main(String[] args) {

        //Parte # 2 del ejercicio
        Coche nuevoCoche = new Coche();
        nuevoCoche.incrementaPuertas();
        nuevoCoche.incrementaPuertas();
        nuevoCoche.incrementaPuertas();
        System.out.println(nuevoCoche.puertas);

        //Parte #3 del ejercicio
        int resultado=primeraParte(10, 5, 20);
        System.out.println(resultado);
    }

    public static int primeraParte(int num1, int num2, int num3){
        return (num1+num2+num3);
    }

    static class Coche{
        public int puertas= 0;

        public void incrementaPuertas(){
            this.puertas++;
        }
    }
}