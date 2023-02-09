package tdd;

public class UnitPrice {
    public int priceOf(int copies) {
        if (copies >= 1 && copies <= 4) {
            copies= copies * 2000;}
        else if (copies >= 5 && copies <= 9) {return copies=copies * 1800;}
        else if (copies >= 10 && copies <= 29){return copies = copies * 1600;}
        else if (copies >= 30 && copies <= 49){return copies = copies * 1500;}
        else if (copies >= 50 && copies <= 99){return copies = copies * 1300;}
        else if (copies >= 100 && copies <= 199){return copies = copies * 1200;}
        else if (copies >= 200 && copies <= 499){return copies=copies * 1100;}
        else if (copies>=500) {return copies = copies * 1000;}
        return  copies;
        }

    }





