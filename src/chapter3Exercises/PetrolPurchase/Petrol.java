package chapter3Exercises.PetrolPurchase;

public class Petrol {

    public static void main(String[] args) {
        PetrolPurchase firstPurchase = new PetrolPurchase("Lagos,", "lead", 50, 20.00, 10);

        System.out.println(firstPurchase.getQuantity());
        System.out.println(firstPurchase.getPurchaseAmount());

        firstPurchase.setPricePerLitre(40);
        firstPurchase.getPricePerLitre();
        System.out.println(firstPurchase.getPercentDiscount());
        System.out.println(firstPurchase.getPurchaseAmount());
    }
}
