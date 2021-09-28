public class Veneno extends Item{
    @Override
    public void skill(Enemigo enemigo) {
        enemigo.poisoned = true;
    }
}
