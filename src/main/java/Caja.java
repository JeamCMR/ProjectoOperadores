public class Caja {
    //Atributos
    int ancho;
    int alto;
    int profundo;

    //contructures
    //Vacio
    public Caja(){
    }
    //Con 3 parametros
    public Caja(int ancho,int alto,int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }

    //Metodo Calcular Volumen

    public int calcularVolumen(int a, int b,int c){
        int volumen = a * b * c;
        return volumen;
    }
}
