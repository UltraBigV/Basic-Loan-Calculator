public class Finance_Period extends Customer{
    
    
    @Override
    public void calculate_repayment(){
        int months = getNumOfMonths();
        double price = getProductPrice();
        if(months>3){
            price = price+(price*0.25);
            monthlyRepayAmount = price/months;  
            total = price;
        }
        else{
            super.calculate_repayment();
        }
        
    }
}
