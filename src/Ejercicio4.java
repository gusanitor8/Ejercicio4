import java.util.Random;

public class Ejercicio4 {
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
    }
}
