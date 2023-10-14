import javax.swing.*;

public class Customer {
    String customerName = "";
    String contactNum = "";
    double productPrice = 0;
    int numOfMonths = 0;
    double monthlyRepayAmount = 0;
    double total = 0;
    
    public String getName(){
        return customerName;
    }    
    public void setName(String name){
        this.customerName = name;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your contact number"));
        String formattedNum = String.format("%010d", num);
        setContactNum(formattedNum);
    }
    
    
    public String getContactNum(){
        return contactNum;
    }   
    public void setContactNum(String num){       
        this.contactNum = num;
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of your product"));
        setProductPrice(price);
    }
    
    
    public double getProductPrice(){
        return productPrice;
    }   
    public void setProductPrice(double price){
        this.productPrice = price;
        int months = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of months over which you want to pay it back"));
        setNumOfMonths(months);
    }
    
    
    public int getNumOfMonths(){
        return numOfMonths;
    }   
    public void setNumOfMonths(int months){
        this.numOfMonths = months;
    }
    
    
    public void calculate_repayment(){
        double price = productPrice;
        int months = numOfMonths;
        this.monthlyRepayAmount = price/months;
        this.total = productPrice;
    }
}
