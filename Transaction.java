package bankingsystem;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class Transaction{
    protected String type;
    protected  double amount;
    protected String dateTime;
    Transaction( String type,double amount){
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now() .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
    public String toString(){
        return dateTime + "|"+type+"|"+"Amount | "+ amount;
    }
}