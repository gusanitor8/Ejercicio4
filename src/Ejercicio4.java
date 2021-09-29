import java.util.Random;

public class Ejercicio4 {
    static Random rand = new Random();
    static boolean running;

    public static void main(String[] args){
       init();
    }

    public static void init(){
        int x = Vista.askNumPlayers();
        for (int i = 0; i < x; i++){
            if (Vista.askIsGuerrero()){
                Guerrero guerrero = new Guerrero(Vista.askPlayerName(i), Combatiente.playersInCombat);
            }else{
                Explorador explorador = new Explorador(Vista.askPlayerName(i), Combatiente.playersInCombat);
            }
        }

        for(int i = 0; i < x; i++){
            int n = (int)(rand.nextFloat() * 10);
            if(x%2 == 0){
                Alien alien = new Alien(Combatiente.enemiesInCombat);
            }else{
                Monstruo monstruo = new Monstruo(Combatiente.enemiesInCombat);
            }
        }

        x = (int)(rand.nextFloat() *10);
        if(x%2==0){
            Combatiente.enemyBoss = new AlienBoss();
        }else{
            Combatiente.enemyBoss = new MonsterBoss();
        }

    }

    public static void turn(){

    }

    public static void isRunning(){
        if(isEmpty(Combatiente.playersInCombat)){
            running =false;
        }else if(Combatiente.enemyBoss == null){
            running = false;
        }

    }

    public static boolean isEmpty(Combatiente[] array){
        boolean vacio = true;
        for (int i =0; i < array.length && vacio; i++){
            vacio = false;
        }
        return vacio;
    }
}
