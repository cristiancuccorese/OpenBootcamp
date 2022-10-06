public class Main {
    //Primera Parte
    //Crear una función con tres parámetros que sean números que se suman entre sí.
    //Llamar a la función en el main y darle valores.


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(suma(a, b, c));
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.getPuertas());
    }



    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        return resultado;
    }
}

