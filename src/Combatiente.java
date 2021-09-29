import java.util.Random;

public class Combatiente {
    protected int life;
    protected int attack;
    protected boolean poisoned = false;
    protected boolean isDead = false;
    protected String name;
    protected String spawnMessage;
    protected String deadMessage;
    protected String winMessage;
    public Item[] items = new Item[5];
    public static Jugador[] playersInCombat = new Jugador[5];
    public static Enemigo[] enemiesInCombat = new Enemigo[5];
    public static Enemigo enemyBoss;
    private Random rand = new Random();

    public Combatiente(){
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    public void isPoisoned(){
        int counter = 4;
        if((this.poisoned) && (counter != 0)){
            this.life--;
        }else{
            this.poisoned = false;
        }
    }

    public void createItems(int itemNum){
        for(int i =0; i < itemNum; i++){
            if(i%2 == 0){
                items[i] = new Veneno();
            }else{
                items[i] = new Attack();
            }
        }
    }

    public void attackCombatiente(Combatiente combatiente){
        if(combatiente == null){
            Vista.fighterNotFound();
        }else {
            combatiente.life = combatiente.life - this.attack;
        }
    }

    public static Enemigo findEnemy(String name){
        Enemigo someEnemy = null;
        for (Enemigo enemigo: enemiesInCombat) {
            if (enemigo != null){
                if(enemigo.name.equals(name)){
                    someEnemy = enemigo;
                }
            }
        }
        return someEnemy;
    }

    public static Jugador findPlayer(String name){
        Jugador somePlayer = null;
        for (Jugador jugador: playersInCombat) {
            if (jugador != null){
                if(jugador.name.equals(name)){
                    somePlayer = jugador;
                }
            }
        }
        return somePlayer;
    }

    public void isDead(){
        if(this.life<0){
            this.isDead = true;
        }
    }

    public static void checkForDeadPlayers(){
        for (int i = 0; i < playersInCombat.length; i++){
            if(playersInCombat[i] != null){
                if(playersInCombat[i].isDead){
                    playersInCombat[i] = null;
                }
            }
        }
    }

    public static void checkForDeadEnemies() {
        for (int i = 0; i < enemiesInCombat.length; i++) {
            if (enemiesInCombat[i] != null) {
                if (enemiesInCombat[i].isDead) {
                    enemiesInCombat[i] = null;
                }
            }
        }
    }
}
