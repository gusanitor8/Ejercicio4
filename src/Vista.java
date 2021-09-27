import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Vista {
    static Scanner input = new Scanner(System.in);

    /**
     * Le pregunta al usuario el numero de jugadores
     * @return dato entero de la cantidad de jugadores
     */
    public static int askNumPlayers(){
        System.out.println("Por favor ingrese el numero de jugadores: ");

        int option = 0;
        try{
            option = input.nextInt();

            if(option>5){
                throw new ToManyPlayersException("No puede tener mas de 5 jugadores");
            }
        }catch(InputMismatchException e){
            input.next();
            System.out.println("La opcion que usted ha ingresado no es correcta");
            option = askNumPlayers();
        }catch(ToManyPlayersException e){
           System.out.println(e.getMessage());
           option = askNumPlayers();
        }
    return option;
    }

    public static String askPlayerName(int playerNum){
        String nombre = null;

        System.out.println("Ingrese el nombre del jugador " + (playerNum + 1) +": ");
        try{
            nombre = input.nextLine();
            input.next();
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        return nombre;
    }

    public static boolean askIsGuerrero(){
        int opcion = 0;
        boolean isGuerrero = false;

        System.out.println("Ingrese 1 para elejir Guerrero o 2 para Explorador: ");
        try{
            opcion = input.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Esa opcion no es valida");
            input.next();
            isGuerrero = askIsGuerrero();
        }
        switch(opcion){
            case 1:
                isGuerrero = true;
                break;
            case 2:
                isGuerrero = false;
                break;
            default:
                System.out.println("Esa no es una opcion valida");
                isGuerrero = askIsGuerrero();
                break;
        }
        return isGuerrero;
    }
}
