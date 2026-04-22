public class Aritmitica {
    //Atributos
    int a;
    int b;
    //Constructores
    //Por defecto siempre crea un contructor vacio sin necesidad de crearlo
     public Aritmitica(){
         a = 20;
         b = 30;
     }
    //Constrctor con Parametros


    public int sumar (){
        int resultado = a + b; //si quitamos los paramtros, se empiezan a usar los atributos de la clase
        return resultado;
    }
}


