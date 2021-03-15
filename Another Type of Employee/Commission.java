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
}
