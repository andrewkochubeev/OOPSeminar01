public class HotDrink extends BottleOfWater{
    private double temperature;
    public HotDrink(String name, double cost, int volume, double temperature) {
        super(name, cost, volume);
        setTemperature(temperature);
    }
    public double getTemperarure() {
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + super.getName() + '\'' +
               "volume='" + super.getVolume() + '\'' +
               "temperature='" + this.temperature + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    
}
