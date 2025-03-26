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
        CrearNotas();
        ProcesarNotasFunc();
        SalidaFunc();
    }
    public static void CrearNotas(){
        IntStream.range(0,rd.nextInt(5,10)).forEach(i->notas.add(rd.nextFloat(1.0f,7.0f)));
    }
    public static void ProcesarNotasFunc(){
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
    public static void SalidaFunc(){
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