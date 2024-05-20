import com.hostelapp.Guest;

public class GuestTest {
    public static void main(String[] args) {

        Guest pedro = new Guest();
        boolean answer = pedro.setFirstName("Pedro");
        pedro.setLastName("Medina");

        if(answer) {
            System.out.println("Name: " + pedro.getFirstName());
            System.out.println("Surname: " + pedro.getLastName());
        }
    }
}
