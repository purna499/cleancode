package epam4.cleancode;
class Building{
    double Area;
    int Type;
    Building(double a,int t){
        this.Area=a;
        this.Type=t;
    }
    String getCostOfBuilding(){
        if(Type==1){
            return "Rupees"+String.format("%.2f", Area*1200);
        }
        else if(Type==2){
            return "Rupees"+String.format("%.2f", Area*1500);
        }
        else if(Type==3){
            return "Rupees"+String.format("%.2f",Area*1800);
        }
        else{
            return "Rupees"+String.format("%.2f",Area*2500);
        }
    }
} 