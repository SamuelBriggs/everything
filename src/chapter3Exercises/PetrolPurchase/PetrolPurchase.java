package chapter3Exercises.PetrolPurchase;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;
    private int quantity;
    private  double pricePerLitre;
    private double percentDiscount;


    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLitre, double percentDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this. pricePerLitre = pricePerLitre;
        this.percentDiscount = percentDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public double getPurchaseAmount(){
        double price = pricePerLitre * quantity;
        double netPrice = price - (price * this.percentDiscount/100);
        return netPrice;
    }
}
