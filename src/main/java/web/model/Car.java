package web.model;


public class Car {
    private String countryOfProduction;
    private String model;
    private int price;

    public Car(String countryOfProduction, String model, int price) {
        this.countryOfProduction = countryOfProduction;
        this.model = model;
        this.price = price;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
