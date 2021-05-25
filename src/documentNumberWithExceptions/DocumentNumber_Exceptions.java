package documentNumberWithExceptions;

public class DocumentNumber_Exceptions extends Exception{
    private String sequence;

    public DocumentNumber_Exceptions(String sequence, String message){
        super(message);
        this.sequence = sequence;
    }

    @Override
    public String toString(){
        return "Exception: " + "подстрока  = " + sequence + ", message = " + getMessage();
    }

}
