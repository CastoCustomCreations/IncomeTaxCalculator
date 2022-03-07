/* 2020 Federal Tax Calculator
 * Midterm Project
 * Written by Jennifer Casto 
 */
package federaltaxcalculator2021;

public class FederalTaxCalculator2021 {
    // Variables
    private String FName;
    private String LName;
    private double Income;
    double taxEstimate;
    double LowerTax;
    double tax;
     // Constructor
    public FederalTaxCalculator2021(String FN, String LN, double I){
        setFName(FN);
        setLName(LN);
        setIncome(I);
        SetTaxEstimate(tax);
    } 
    // Mutator Methods
    public void setFName(String FN){FName = FN;}
    public void setLName(String LN){LName = LN;}
    public void setIncome(double I){Income = I;}
    
  
    
  
    
    public void SetTaxEstimate(double tax){
               
        if(Income <= 19900){tax = .1; LowerTax =0;}
        else if(Income <= 81050){tax = .12; LowerTax = 398;}
        else if(Income <= 172750){tax = .22 ; LowerTax = 8503;}
        else if(Income <= 329850){tax = .24; LowerTax =11958;}
        else if(Income <= 418850){tax = .32; LowerTax =38346;}
        else if(Income <= 628300){tax = .35; LowerTax =50911.5;}
        else if(Income > 628300){tax = .37 ; LowerTax = 63477.5;}
        taxEstimate = ((Income * tax)-LowerTax);
    }
        
   
   // Assessor Method
    public String getFName(){return FName;}
    public String getLName(){return LName;}
   public double getIncome(){return Income;}   
    public double getTaxEstimate(){return taxEstimate;}
  
    
}
