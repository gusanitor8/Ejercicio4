public abstract class Item {
    protected boolean used = false;

    public void isUsed(){
        used = true;
    }

    public abstract void skill(Enemigo enemigo);
}
