public class Main {
    public static void main(String[] args) {

        int numeroIf=15;
        System.out.println("Resultado del if");
        if (numeroIf <0){
            System.out.println("la variable es negativa");
        }else if(numeroIf >0){
            System.out.println("la variable es positiva");
        }else if(numeroIf ==0){
            System.out.println("la variable es cero");
        }
        int numeroWhile = 0;
        System.out.println("Resultado del while");
        while (numeroWhile <3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        System.out.println("Resultado del do while");
        do {
            System.out.println(numeroWhile);
            numeroWhile ++;
        }while (numeroWhile <3);


        System.out.println("Resultado del for");
        for (int numeroFor =0; numeroFor<=3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
        String estacion = "verano";
        System.out.println("Resultado del switch");

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otonio":
                System.out.println("Es otonio");
                break;
            case "primavera":
                System.out.println("Es primavera");
            break;
            default:
                System.out.println("No es pertence a las 4 estaciones "+estacion);

        }
        }
    }
