public class Ejercicio4 {
    public static void main(String[] args){
       init();
    }

    public static void init(){
        int x = Vista.askNumPlayers();
        for (int i = 0; i < x; i++){
            if (Vista.askIsGuerrero()){
                Vista.askPlayerName(i);
            }


        }

    }
}
