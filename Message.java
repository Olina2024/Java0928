import java.util.Random;
import java.util.ArrayList;
public class Message {
    private String customer;
    private String messages;
    private int payment;
    private   String customernamn; 
    private String messageDisplay;
    private  ArrayList<String> Customerlist = new ArrayList<>();
 
   
 
    public String getMessageDisplay() {
        return messageDisplay;
    }

    // public void setMessageDisplay(String messageDisplay) {
    //     this.messageDisplay = messageDisplay;
    // }
    public String getCustomernamn() {
        return customernamn;
    }

    public void setNamn(String customernamn) {
        this.customernamn = customernamn;
       
    }


    public ArrayList<String> getCustomerlist() {
        return Customerlist;
        
    }

    public void setCustomerlist(ArrayList<String> customerlist) {
        this.Customerlist=customerlist;
        
      
    }
  
    
    public void setAdactions(ArrayList<String> customerlist){
       
        int rnd = new Random().nextInt(customerlist.size());
        if (rnd%2==0){   
          customernamn= customerlist.get(rnd) ;
          this.messageDisplay=customerlist.get(rnd+1);
          
        }
        else if (rnd%2!=0){
           customernamn= customerlist.get(rnd-1);
          this.messageDisplay=customerlist.get(rnd);
          
        }   
       

    }  

    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public String getMessages() {
        return messages;
    }
    public void setMessages(String messages) {
        this.messages = messages;
    }
   
    public int getPayment() {
        return payment;

    }
    public void setPayment(int payment) {
        this.payment = payment;
    }

}
