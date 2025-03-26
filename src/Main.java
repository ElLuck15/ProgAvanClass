import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    static Random rd = new Random();
    static List<Float> notas = new ArrayList<Float>();
    static List<Float> notasmenortres = new ArrayList<Float>();
    static List<Float> notasmay = new ArrayList<Float>();
    static List<Float> notasbetw = new ArrayList<Float>();
    public static void main(String[] args) {
        CrearNotasImp();
        ProcesarNotasImp();
        SalidaImp();
    }
    //Creación de notas
    public static void CrearNotasImp(){
        int limite = rd.nextInt(5,10);
        for (int i = 0; i < limite; i++) {
            notas.add(rd.nextFloat(1.0f,7.0f));
        }
    }
    //Procesamiento de notas para agregar a sus respectivas listas dependiendo del filtro
    public static void ProcesarNotasImp(){
        for(int i = 0; i<notas.size();i++){
            float nota = notas.get(i);
            if(i<3.6f){
                notasmenortres.add(nota);
            }
        }
        for(int i = 0; i<notas.size();i++){
            float nota = notas.get(i);
            if(i>4f){
                notasmay.add(nota);
            }
        }for(int i = 0; i<notas.size();i++){
            float nota = notas.get(i);
            if(nota<=4f&&i>=3.6){
                notasbetw.add(nota);
            }
        }

    }
    //Impresión en pantalla de notas
    public static void SalidaImp(){
        System.out.println("Todas las notas");
        for( var i : notas ){
            System.out.println(i);
        }
        System.out.println("Notas menores a 3.6");
        for( var i : notasmenortres ){
            System.out.println(i);
        }
        System.out.println("Notas mayores a 4");
        for( var i : notasmay ){
            System.out.println(i);
        }
        System.out.println("Notas entre 3.6 y 4");
        for( var i : notasbetw ){
            System.out.println(i);
        }
    }
}