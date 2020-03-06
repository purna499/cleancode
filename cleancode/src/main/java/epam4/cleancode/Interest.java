package epam4.cleancode;
class Interest{
    double prcp;
    double rate;
    double time;
    Interest(double p,double r,double t){
        this.prcp=p;
        this.rate=r;
        this.time=t;
        }
    String getSimpleinterest(){
        return "Rupees"+String.format("%.2f", (prcp*time*rate)/100);
    }
    String getCompoundInterest(){
        return "Rupees"+String.format("%.2f",prcp * Math.pow(1.0+rate/100.0,time) - prcp);
    }
}