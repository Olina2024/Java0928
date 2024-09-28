import javax.swing.*;
import java.awt.*;
public class Show extends listcustomerInformation{
    private String label1text;
    private String label2text;
   // private String button;
     private JFrame frame;
  

    public String getLabel1text() {
    return label1text;
}

    public void setLabel1text(String label1text) {
       this.label1text = label1text;
    }
    public String getLabel2text() {
     return label2text;
    }

    public void setLabel2text(String label2text) {
     this.label2text = label2text;
    }
   
    
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame() {

        JFrame frame = new JFrame();
        frame.setVisible(true); 
        frame.setLayout(null);   
        frame.setSize(500, 300);
        frame.setTitle("Vår finna reklamtavla");
        Container c=frame.getContentPane();
		c.setBackground(Color.BLACK);
        this.frame = frame;
    }
     
  

    public  void Reklam(String label1text, String label2text){
          
        // JButton button= new JButton(str1);
        // JButton Namnbutton= new JButton(str2);
         JLabel lable1= new JLabel(label1text);
         JLabel lable2= new JLabel(label2text);
         lable1.setFont(new Font(label1text, Font.BOLD, 26));
         lable2.setFont(new Font(label2text, Font.BOLD, 26));
         lable1.setForeground(Color.green);
         lable2.setForeground(Color.green);        
        
         frame.add(lable1); 
         frame.add(lable2);
         lable1.setBounds(20, 50, 300, 50);
         lable2.setBounds(20, 100, 400, 50);
         
        try {
            Thread.sleep(10000);;
            frame.remove(lable1);
            frame.remove(lable2);


        } catch (Exception e) {
            
        }
        
  

       
   }
}
