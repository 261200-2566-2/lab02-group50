public class AirPurifier {
    String model ;//instance variables
    String serialNo;//instance variables
    boolean power;//instance variables
    static int modelCount; //class variables
    static int PromodelCount; //class variables
    static int BasicmodelCount; //class variables
    AirPurifier(String model , String serialNo){
        this.model = model;
        this.serialNo = serialNo;
        power = false;
        modelCount++;

        if("Pro".equals(model)){
            PromodelCount++;
        }else{
            BasicmodelCount++;
        }
    }

    AirPurifier(String serialNo){
        this("Pro" , serialNo);
    }

    void turnOn() { power = true; } //instance methods
    void turnOff() { power = false; } //instance methods

    static String mostPopularModel() {//class methods
        if(PromodelCount > BasicmodelCount){
            return "Pro";
        }else{
            return "Basic";
        }
    }



}

