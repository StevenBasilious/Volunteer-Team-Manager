package six;
import java.text.NumberFormat;
import java.util.Locale;
public class volunteer implements Comparable<volunteer> {
    private String name;
    private int boxes;
    private Utils utils= new Utils();
    //Constructor for the Volunteer class
    public volunteer(String name, int boxes){
        this.name= name;
        this.boxes= boxes;
    }
    //Getter method for the name
    public String getName(){
        return name;
    }
    //Getter method for the numberofboxes
    public int getBoxes(){
        return boxes;
    }
    // To calculate the price of the first 50 kit and the rest
    public double getPrice() {
        if (boxes > 50) {
            return ((this.boxes - 50) * 0.20) + (50 * 0.15);
        } else {
            return this.boxes * 0.15;
        }
    }
    //To add more boxes
    public void correctBoxes(int boxes){
        if (boxes > 0){
            this.boxes += boxes;
        }
        else{
            System.out.println("must give positive number of boxes");
        }
    }
    //To remove boxes
    public void incorrectboxes(int boxes){
        if(boxes >= 0){
            this.boxes -= boxes ;
        }
        else {
            System.out.println("must give more than one");
        }
    }
    public String formatMoney(){
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.UK);
        return format.format(getPrice());
    }
    @Override
    public String toString() {
        return String.format("%1$-20s | %2$-6s | %3$-3d", name, utils.formatMoney(getPrice()), boxes);
    }
    // to compares two volunteer objects based on the number of correct boxes.
    @Override
    public int compareTo(volunteer volunteer){
        if(volunteer.boxes == this.boxes){
            return this.name.compareTo(volunteer.name);
        }
        else{
            return volunteer.boxes - this.boxes;
        }
    }

}
