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
    public  Aritmitica(int a, int b){
         this.a=a; //Se una this para indicar que el valor de los parametros pasen a los variables de la clase
         this.b=b;// Si no se hace es un ambiguedad
        System.out.println("Se ejecuta el constructor con 2 argumentos");
    }

    public int sumar (){
        return a + b;
    }

    public int restar(){
         return this.a - this.b;
    }

    public int multiplicar(){
         return this.a * this.b;
    }

    public int dividir(){
         return this.a / this.b;
    }
}


