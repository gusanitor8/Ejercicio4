public class Veneno extends Item {
    public Veneno(){
        super();
    }

    public void skill(Enemigo enemigo) {
        enemigo.poisoned = true;
    }

}
