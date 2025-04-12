package six;
public class Main {
    public static void main(String[]args){
        Utils utils= new Utils();
        volunteerTeam team= new volunteerTeam();
        try {
        volunteer Sofya = new volunteer("Sofya",127);
        team.addVolunteer(Sofya);
        Sofya.correctBoxes(13);
        Sofya.incorrectboxes(0);

        volunteer Steve = new volunteer("Steve",46);
        team.addVolunteer(Steve);
        Steve.correctBoxes(9);

        volunteer Muhammed = new volunteer("Muhammed",273);
        team.addVolunteer(Muhammed);
        Muhammed.correctBoxes(27);

        volunteer Amaara = new volunteer("Amaara",129);
        team.addVolunteer(Amaara);
        Amaara.correctBoxes(33);

        volunteer John = new volunteer("John",129);
        team.addVolunteer(John);
        John.correctBoxes(39);

        volunteer Tony = new volunteer("Tony",17);
        team.addVolunteer(Tony);
        Tony.correctBoxes(106);

        volunteer Sarah = new teamLeader("Sarah", 385);
        team.addVolunteer(Sarah);
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());;
        }

        team.sortVolunteerTeam();
        System.out.println(team.displayVolunteerTeam());
        System.out.println(team.getTotalBoxes() + " Kits Covered");
        System.out.println("The total price is "+utils.formatMoney(team.getTotalPrice()));
    }
}
