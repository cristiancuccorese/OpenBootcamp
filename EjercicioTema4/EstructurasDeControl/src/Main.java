public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;
        int numeroWhile=0;
        int numeroDoWhile=2;


        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIf < 0){
            System.out.println("El numero es negativo");
        }else
            System.out.println("El numero es 0");

        while (numeroWhile < 3){
            System.out.println("numeroWhile es " + numeroWhile);
            numeroWhile = numeroWhile +1;}

        do {
            System.out.println("numeroDoWhile es " + numeroDoWhile);
            numeroDoWhile = numeroDoWhile +1;

        }while (numeroDoWhile < 3);

        int numeroFor= 0;

        for (numeroFor=0; numeroFor <= 3; numeroFor = numeroFor+1 ){
            System.out.println("numeroFor es " + numeroFor);

        }
        String estacion= "VERANO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No Es una Estacion!!!");


        }
    }
}