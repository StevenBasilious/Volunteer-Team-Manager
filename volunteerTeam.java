package six;
import java.util.ArrayList;
import java.util.Collections;
public class volunteerTeam {
    private ArrayList<volunteer> team;

    //Constructor for volunteerTeam class
    public volunteerTeam (){
        this.team= new ArrayList <volunteer>();
    }
    //To sort the volunteerTeam based on the number of boxes
    public void sortVolunteerTeam(){
        Collections.sort(this.team);
    }
    //To add more member to the team
    public void addVolunteer(volunteer emp){
        this.team.add(emp);
    }
    //To display the volunteer team
    public String displayVolunteerTeam(){
        StringBuilder sb= new StringBuilder();
        for (volunteer emp: team){
            sb.append(emp);
            sb.append("\n");
        }
        return sb.toString();
    }
    //To get the total price of the kits
    public double getTotalPrice(){
        double total= 0;
        for (volunteer emp: team){
            total += emp.getPrice();
        }
        return total;
    }
    //To get the total number of the kits
    public int getTotalBoxes(){
        int total= 0;
        for (volunteer emp: team){
            total += emp.getBoxes();
        }
        return total;
    }
}
