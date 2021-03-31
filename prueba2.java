
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Analisis: Entradas: - objetos
                    - estado
                    - Precio cada objeto
          Proceso: - asignar los 5 tipos de objetos
                   - asignarles valor
                   - asignar el estado del objeto
                   - vender objeto
                   - calcular el valor del objeto dependiendo de su estado
          Salidas: - Precio final del objeto
                   - cantidad de objetos vendidos
 */
/**
 *
 * @author hp
 */
public class prueba2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NClientes = -1;
        int respuesta = 0;
        int estado = 0;
        double estadoO = 0;
        int valorO = 0;
        int comprar = 0;
        int precio = 0;
        int cantjuegos = 0;
        int cantropa = 0;
        int cantpelicula = 0;
        int cantlibro = 0; 
        do {
            System.out.println("¿Cuántos clientes son?");
            NClientes = teclado.nextInt();

        } while (NClientes < 0);

        for (int i = 0; i < NClientes; i++) {
            System.out.println("cliente " + i);
            int juego = 5000;
            int ropa = 5000;
            int pelicula = 3000;
            int libro = 10000;
            double bueno = 1.5;
            int masmenos = 1;
            double malo = 0.5;
            System.out.println("indique lo que desee comprar");
            System.out.println("[1] juguete");
            System.out.println("[2] ropa");
            System.out.println("[3] pelicula");
            System.out.println("[4] libro");
             do {
           try{ 
            respuesta = teclado.nextInt();
            if (respuesta == 1) {
                System.out.println("usted comprara un juego");
                valorO = juego;
                cantjuegos++;
            } else if (respuesta == 2) {
                System.out.println("usted comprara ropa");
                valorO = ropa;
                cantropa++;
            } else if (respuesta == 3) {
                System.out.println("usted comprara una pelicula");
                valorO = pelicula;
                cantpelicula++;
            } else if (respuesta == 4) {
                System.out.println("usted comprara un libro");
                valorO = libro;
                cantlibro++;
            } else {
                System.out.println("su respuesta no es valida");
            }
            System.out.println("el estado de su objeto es");
           }catch (InputMismatchException e){
               System.out.println("Caracter no Válido");
           }
            try{
             estado = teclado.nextInt();
            if (estado == 1){
                System.out.println("su objeto está bueno");
                estadoO = bueno;
            }else if (estado == 2){
                System.out.println("su objeto está mas o menos");
                estadoO =masmenos; 
            }else if (estado == 3){
                 System.out.println("su objeto está malo");
                 estadoO = malo;
            } else {
                System.out.println("el estado del objeto es inválido");
            }
            double ValorFinalObj = valorO * estadoO;
            System.out.println("el valor total a pagar es de " +ValorFinalObj+ " pesos");
           precio = precio += ValorFinalObj;
           System.out.println("el valor total de la compra es de " +precio+ " pesos");
            }catch (InputMismatchException e){
                System.out.println("Caracter no válido");
            }              
                System.out.println("Desea comprar otra ves ([1] si)");
                comprar = teclado.nextInt();
            } while (comprar != 1 );
            
        }
        System.out.println("se han vendido " +cantjuegos+ " juegos");
        System.out.println("se han vendido " +cantropa+ " ropa");
        System.out.println("se han vendido " +cantpelicula+ " peliculas");
        System.out.println("se han vendido " +cantlibro+ " libros");

    }
}
