package six;

public class teamLeader extends volunteer{
    private Utils utils= new Utils();

    //Constructor for the teamLeader class
    public teamLeader(String name, int boxes) {
        //To call the constructor of the parent class (volunteer)
        super(name, boxes);
    }

    //To calculate the price with a 20% increase
    @Override
    public double getPrice(){
        return super.getPrice() * 1.20;
    }

    //To show the teamLeader object as a string table
    @Override
    public String toString(){
        return String.format("%1$-20s | %2$-6s | %3$-3d",super.getName()+ " (TL)", utils.formatMoney(getPrice()),super.getBoxes());
    }
}
