public class NameOrSurnameInvalidException extends Exception{
    private String name;
    public NameOrSurnameInvalidException(String message, String name){
        super(message);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
