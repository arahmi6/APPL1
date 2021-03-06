/**
 *
 * @author AULIA RAHMI
 */
public class Commission extends Hourly {
    private double totalSales, commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double eCommissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = eCommissionRate;
    }
    
    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay(){
        return super.pay() + (totalSales * commissionRate);
   }

    @Override
    public String toString(){
        return super.toString()+ "\nTotal Sales: " + this.totalSales;
    }
}
