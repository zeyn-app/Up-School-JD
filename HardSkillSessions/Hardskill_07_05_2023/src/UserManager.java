import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public boolean add(User user){
        return users.add(user);
    }

    public boolean isValidName(String name){
        return isContainDigit(name) ? false : true;
    }

    public boolean isValidTckn(String tckn) {
        return (tckn.length() == 11 && !isContainChar(tckn)) ? true : false;
    }

    public boolean isValidBirthYear(String year){
        Date date = new Date();
        int currentYear = date.getYear();
        int newYear = Integer.parseInt(year);

        //System.out.println("Age: " + (currentYear-newYear));

        return (year.length() == 4 && (newYear - currentYear) >= 18 && newYear > 1900 && !isContainChar(year)) ? true : false;
    }

    public boolean isValidEmail(String email){
        return (email.contains("@") && email.endsWith(".com")) ? true : false;
    }

    private boolean isContainDigit(String element){
        for (char c: element.toCharArray()) {
            if(Character.isDigit(c)) return true;
        }
        return false;
    }

    private boolean isContainChar(String name){
        for (char c: name.toCharArray()) {
            if(!Character.isDigit(c)) return true;
        }
        return false;
    }

}
