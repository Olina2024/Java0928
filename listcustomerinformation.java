import java.util.ArrayList;
//import java.util.TimerTask;


public class listcustomerInformation  {
    
    // Hederlige Harrys Bilar:
    // En bra bilaffär
    // (för Harry)
    // 5000
    // Farmor Ankas Pajer AB
    // Skynda innan
    // Mårten äter allt!
    // 2000
    // Svarte Petters Svartbyggen
    // Bygga svart? 
    // Ring Petter
    // 1500
    // Långbens detektivbyrå
    // Mysterier? Ring Långben
    // 4000
    
    
    public static void main(String[] args) {
      
        ArrayList<Message> listcustomers = new ArrayList<>();
        Message hederlige= new Message();
        hederlige.setCustomer(" Hederlige Harrys Bilar");
        hederlige.setMessages("En bra bilaffär(för Harry)");
        hederlige.setPayment(5000);
        listcustomers.add(hederlige);
    

        Message Farmor= new Message();
        Farmor.setCustomer("Farmor Ankas Pajer AB");
        Farmor.setMessages("Skynda innan Mårten äter allt!");
        Farmor.setPayment(2000);
        listcustomers.add(Farmor);
  

        Message Svarte= new Message();
        Svarte.setCustomer("Svarte Petters Svartbyggen");
        Svarte.setMessages("Bygga svart? Ring Petter");
        Svarte.setPayment(1500);
        listcustomers.add(Svarte);

        Message Långbens= new Message();
        Långbens.setCustomer("Långbens detektivbyrå");
        Långbens.setMessages("Mysterier? Ring Långben");
        Långbens.setPayment(4000);
        listcustomers.add(Långbens);

        ArrayList <String> display= new ArrayList<>();
        Message action=new Message();
      
        Show  f = new Show();
        f.setFrame();      
      
        while(true){    

            for (Message information : listcustomers ){
                System.out.println("**********************************************");
                System.out.println("Customer: "+information.getCustomer() +"\r\n" + "Message: "+  information.getMessages()  + "\r\nPayment: "+ information.getPayment());
                display.add(information.getCustomer());
                display.add(information.getMessages());
                information.setCustomerlist(display);                                                                                                                                                                            
            }    
            action.setActions(display); 
            String label1text= action.getCustomernamn(); 
            String label2text=  action.getMessageDisplay();
            f.setLabel1text(label1text);
            f.setLabel2text(label2text);
            f.Reklam(f.getLabel1text(), f.getLabel2text());
           
   }
   

 }

  
 


}
