public class Aritmitica {
    //Atributos
    int a;
    int b;
    //Constructores
    //Por defecto siempre crea un contructor vacio sin necesidad de crearlo
     public Aritmitica(){
         System.out.println("Constructor Vacio");
     }
    //Constrctor con Parametros
    public  Aritmitica(int arg1, int arg2){
         a=arg1;
         b=arg2;
        System.out.println("Se ejecuta el constructor con 2 argumentos");
    }

    public int sumar (){
        return a + b;
    }

    public int restar(){
         return a - b;
    }

    public int multiplicar(){
         return a * b;
    }

    public int dividir(){
         return a / b;
    }
}


