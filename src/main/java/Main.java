public class Main {

    public static void main (String[] args){
        Aritmitica suma =  new Aritmitica( 2, 3);
        int resultado = suma.sumar();
        System.out.println("Resultado: " + resultado);

        Aritmitica suma2 = new Aritmitica(10,21);
        System.out.println("Resultado 2: " + suma2.sumar());

    }
}
