import java.util.ArrayList;
import java.util.List;

public class calculadora {

    public int NumInt(String p){//crear metodo para devolver entero, con parametro de tipo string
        int digito=1;//crear digito, inicializar desde zero
        String palabra = p.trim().toLowerCase();//crear string llamado palabra, utilizar trim para quitar espacios alrededor y poner todas las letras en minuscula
        palabra = palabra.replaceAll("(.)\1", "$1");//reemplazar las palabras

        if(palabra=="uno"){//si la palabra es uno, devolver su valor en entero
            digito=1;
        }
        if(palabra=="dos"){
            digito=2;
        }
        if(palabra=="tres"){
            digito=3;
        }
        if(palabra=="cuatro"){
            digito=4;
        }
        if(palabra=="cinco"){
            digito=5;
        }
        if(palabra=="seis"){
            digito=6;
        }
        if(palabra=="siete"){
            digito=7;
        }
        if(palabra=="ocho"){
            digito=8;
        }
        if(palabra=="nueve"){
            digito=9;
        }
        return digito;
    }
    
    public List<Integer> valorDeNumero(String str ) {//crear lista de enteros llamada valor de numero, con un parametro de tipo string
        List<Integer> valor = new ArrayList<Integer>();//crear al array list de tipo entero
        String[] palabras = str.trim().split("\s+");//crear el string, que por cada palabra se le llamara

        for(int i=0;i<palabras.length;i++){//hacer recorrido de la palabra hasta su tamaño maximo
            valor.add(NumInt(palabras[i]));//añadir el valor a la palabra
        }

    return valor;//devolver valor
    }

    public  List<Double>  proporcional (int[]s , double valor) {
        ArrayList<Double>proporcion = new ArrayList<Double>();
        double suma = 0 ;
        for(int i = 0 ; i < s . longitud; i++){
            
        }
    }

}
