import java.util.Random;

public class Ejercicio4 {
    static Random rand = new Random();
    static boolean running = true;

    public static void main(String[] args){
      init();
      while(running) {
          turn();
      }
    }

    public static void init(){
        int x = Vista.askNumPlayers();
        for (int i = 0; i < x; i++){
            if (Vista.askIsGuerrero()){
                Guerrero guerrero = new Guerrero(Vista.askPlayerName(i), Combatiente.playersInCombat);
                Vista.displayMessage(guerrero.spawnMessage);
            }else{
                Explorador explorador = new Explorador(Vista.askPlayerName(i), Combatiente.playersInCombat);
                Vista.displayMessage(explorador.spawnMessage);
            }
        }

        for(int i = 0; i < x; i++){
            int n = (int)(rand.nextFloat() * 10);
            if(x%2 == 0){
                Alien alien = new Alien(Combatiente.enemiesInCombat, Vista.askEnemyName(i));
            }else{
                Monstruo monstruo = new Monstruo(Combatiente.enemiesInCombat, Vista.askEnemyName(i));
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
        for (Jugador jugador: Combatiente.playersInCombat){
            while(running) {
                if (jugador != null) {
                    switch (Vista.menuPlayer()) {
                        case 1:
                            Combatiente combatiente = Combatiente.findEnemy(Vista.enemyToAttack());
                            jugador.attackCombatiente(combatiente);
                            Vista.attackMade();
                            jugador.isPoisoned();
                            jugador.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 2:
                            Enemigo enemigo = Combatiente.findEnemy(Vista.enemyToAttack());
                            jugador.useItem(enemigo);
                            jugador.isPoisoned();
                            jugador.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 3:
                            Vista.passed();
                            jugador.isPoisoned();
                            jugador.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 4:
                            running = false;
                            break;
                        default:
                            //
                    }
                }
            }
        }

        for (Enemigo enemigo : Combatiente.enemiesInCombat) {
            while (running){
                if(enemigo != null){
                    switch (Vista.menuEnemy()){
                        case 1:
                            Combatiente combatiente = Combatiente.findEnemy(Vista.playerToAttack());
                            enemigo.attackCombatiente(combatiente);
                            Vista.attackMade();
                            enemigo.isPoisoned();
                            enemigo.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 2:
                            Jugador jugador = Combatiente.findPlayer(Vista.playerToAttack());
                            enemigo.attackCombatiente(jugador);
                            jugador.isPoisoned();
                            enemigo.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 3:
                            Vista.passed();
                            enemigo.isPoisoned();
                            enemigo.isDead();
                            Combatiente.checkForDeadEnemies();
                            break;
                        case 4:
                            running = false;
                            break;
                    }
                }
            }

        }
    }




    public static void isRunning(){
        if(isEmpty(Combatiente.playersInCombat)){
            running =false;
        }else if(Combatiente.enemyBoss == null){
            running = false;
        }else if(running = false){
            running = false;
        }
    }

    private static boolean isEmpty(Combatiente[] array){
        boolean vacio = true;
        for (int i =0; i < array.length && vacio; i++){
            vacio = false;
        }
        return vacio;
    }
}
