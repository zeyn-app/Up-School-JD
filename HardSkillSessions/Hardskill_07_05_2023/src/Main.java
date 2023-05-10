import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        User user;
        String name, surname, tckn, birthYear, email;

        try{
            System.out.print("Ad: ");
            name = scanner.nextLine();
            if(!userManager.isValidName(name))
                throw new NameOrSurnameInvalidException("Name must not contain numbers", name);

            System.out.print("Soyad: ");
            surname = scanner.nextLine();
            if(!userManager.isValidName(surname))
                throw new NameOrSurnameInvalidException("Surname must not contain numbers.", surname);

            System.out.print("TCKN: ");
            tckn = scanner.nextLine();
            if(!userManager.isValidTckn(tckn))
                throw new TcknInvalidException("Tckn must be 11 digits and must contain only numbers.");

            System.out.print("Doğum yılı: ");
            birthYear = scanner.nextLine();
            if(!userManager.isValidBirthYear(birthYear))
                throw new BirthInvalidException("Birth year must be 4 digits and contain only numbers. Also be sure that you are grater then 18.");

            System.out.print("Email: ");
            email = scanner.nextLine();
            if(!userManager.isValidEmail(email))
                throw new EmailInvalidException("Email must contain @ and ends with \".com\"");

           user = new User(name, surname, tckn, birthYear, email);
            if(userManager.add(user)){
               System.out.println(user.toString() + " added succesfully");
           }
        }
        catch (NameOrSurnameInvalidException message){
            System.out.println("Hata sebebi: " + message.getMessage() + " --> " + message.getName());
        }
        catch (TcknInvalidException message){
            System.out.println("Hata sebebi: " + message.getMessage());
        }
        catch (BirthInvalidException message){
            System.out.println("Hata sebebi: " + message.getMessage());
        }
        catch (EmailInvalidException message){
            System.out.println("Hata sebebi: " + message.getMessage());
        }
        catch (Exception message){
            System.out.println("Beklenmeyen hata oluştu.");
        }
    }

}