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

    public static String askEnemyName(int enemyNum){
        String nombre = null;

        System.out.println("Ingrese el nombre del enemigo " + (enemyNum + 1) +": ");
        try{
            input.nextLine();
            nombre = input.nextLine();
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        return nombre;
    }

    public static String enemyToAttack(){
        String name = null;
        System.out.println("Ingrese el nombre del enemigo que quiere atacar: ");
        try {
            input.nextLine();
            name = input.nextLine();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
        return name;
    }

    public static String playerToAttack(){
        String name = null;
        System.out.println("Ingrese el nombre del jugador que quiere atacar: ");
        try {
            input.nextLine();
            name = input.nextLine();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
        return name;
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

    public static int menuPlayer(){
        int opcion = 0;
        System.out.println("Ingrese una opcion \n" +
                            "1. Atacar \n" +
                            "2. Usar Item \n" +
                            "3. Pass \n" +
                            "4. Abandonar Partida \n");

        try{
            opcion = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Favor ingresar una opcion valida");
            input.next();
            opcion = menuPlayer();
        }
        return opcion;
    }

    public static int menuEnemy(){
        int opcion = 0;
        System.out.println("Ingrese una opcion \n" +
                            "1. Atacar \n" +
                            "2. Usar Special \n" +
                            "3. Pass \n" +
                            "4. Abandonar Partida \n");
        try{
            opcion = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Favor ingresar una opcion valida");
            input.next();
            opcion = menuPlayer();
        }
        return opcion;
    }

    public static void displayMessage(String message){
        System.out.println(message);
    }

    public static void passed(){
        System.out.println("Usted se ha saltado su turno \n");
    }

    public static void fighterNotFound(){
        System.out.println("El combatiente que ingreso no existe");
    }

    public static void attackMade(){
        System.out.println("Se ha hecho un ataque");
    }
}
