public class Main {

    public static void main (String[] args){
      /*//Varriables locales
        int operandoA = 6;
        int operadoB = 2;

        //Objeto de clase Aritmetica
        Aritmitica objeto1 = new Aritmitica(operandoA,operadoB);
        System.out.println("operandoA= " + operandoA);
        System.out.println("operadoB= " + operadoB);

        //Imprimir el resultado de la suma del metodo de la clase que tiene el objeto
        System.out.println("Resultado de la suma: " + objeto1.sumar());
        System.out.println("Resultado de la resta: " + objeto1.restar());
        System.out.println("Resultado de la multiplicacion: " + objeto1.multiplicar());
        System.out.println("Resultado de la Dividir: " + objeto1.dividir());
    */
        Caja caja1 = new Caja(3,2,6);
        System.out.println("El resultado es: " + caja1.calcularVolumen());

    }
}

//Nota Los paramentros son las variables que se definen en un metodo o funciones sumar (int a, int b)
//Los argumentos son los valores reales que van a tener los parametros ejemplo sumar(12,3)
