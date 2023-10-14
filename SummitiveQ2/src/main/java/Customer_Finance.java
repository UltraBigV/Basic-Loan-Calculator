import javax.swing.*;
public class Customer_Finance {

    public static void main(String[] args) {
        boolean check = true;
        while(check){
            
            try{
           
            String name = JOptionPane.showInputDialog(null, "Please enter your name");       
            Finance_Period newCustomer = new Finance_Period();
            newCustomer.setName(name);
            newCustomer.calculate_repayment();
            JOptionPane.showMessageDialog(null,
                    "\nCustomer Name: "+newCustomer.getName()+
                    "\nnCustomer Contact: "+newCustomer.getContactNum()+
                    "\nProduct Amount: "+newCustomer.getProductPrice()+
                    "\nRepayment Months: "+newCustomer.getNumOfMonths()+
                    "\nMonthly Repayment: "+newCustomer.monthlyRepayAmount+
                    "\nTotal Due: "+newCustomer.total);
            check=false;
            }    
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Please enter a valid data type and try again");
            }
               
       }
        
       
    }
    
}
