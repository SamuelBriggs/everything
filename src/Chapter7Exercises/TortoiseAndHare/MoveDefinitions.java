package Chapter7Exercises.TortoiseAndHare;

import java.security.SecureRandom;

public class MoveDefinitions {

    private static SecureRandom random = new SecureRandom();

    private static int number;

    private static int hareCurrentPosition ;
    private static int tortoiseCurrentPosition;

    public static int getHareCurrentPosition() {
        return hareCurrentPosition;
    }

   public static int possibleTortoiseMoves (){

        if (number >= 1 && number <= 5) tortoiseCurrentPosition =  makeFastPlodMove(tortoiseCurrentPosition);
        else if (number >= 6 && number <= 7) tortoiseCurrentPosition = makeSlipMove(tortoiseCurrentPosition);
        else if (number >= 8 && number <= 10) tortoiseCurrentPosition = makeSlopPodMove(tortoiseCurrentPosition);
      return tortoiseCurrentPosition;
    }
    public static int possibleHareMoves(){
        if (number >= 1 && number <= 2) hareCurrentPosition = hareSleep(hareCurrentPosition);
        else if (number >= 3 && number <= 4) hareCurrentPosition = hareBigHop(hareCurrentPosition);
        else if (number == 5) hareCurrentPosition = hareBigSlip(hareCurrentPosition);
        else if (number >= 6 && number <= 8) hareCurrentPosition = hareSmallHop(hareCurrentPosition);
        else if (number >= 9 && number <= 10)hareCurrentPosition = hareSmallSlip(hareCurrentPosition);
        return hareCurrentPosition;
    }

    private static int hareSmallSlip(int currentPosition) {
        if (currentPosition < Math.abs(RaceMove.SMALL_SLIP)) currentPosition = 0;
        else currentPosition+=RaceMove.SMALL_SLIP;
        return currentPosition;
    }

    private static int hareSmallHop(int currentPosition) {
        if (currentPosition+RaceMove.SMALL_HOP >= 70) currentPosition = 69;
        else currentPosition+=RaceMove.SMALL_HOP;

        return currentPosition;
    }

    private static int hareBigSlip(int currentPosition) {
        if (currentPosition < Math.abs(RaceMove.BIG_SLIP)) currentPosition = 0;
        else currentPosition+= RaceMove.BIG_SLIP;
        return currentPosition;
    }

    private static int hareBigHop(int currentPosition) {
        if((currentPosition+RaceMove.BIG_HOP) >= 70) currentPosition = 69;
        else currentPosition+= RaceMove.BIG_HOP;
        return currentPosition;
    }

    private static int hareSleep(int currentPosition) {
        return currentPosition+= RaceMove.SLEEP;
    }
    private static int makeSlopPodMove(int currentPosition) {
        if(currentPosition+RaceMove.SLOW_PLOD >= 70) currentPosition = 69;
        else currentPosition += RaceMove.SLOW_PLOD;

        return currentPosition;
    }
    private static int makeFastPlodMove(int currentPosition) {
        if((currentPosition+RaceMove.FAST_PLOD) >= 70) currentPosition = 69;
        else currentPosition += RaceMove.FAST_PLOD;
        return currentPosition;
    }
    private static int makeSlipMove(int currentPosition) {
        if(currentPosition < Math.abs(RaceMove.SLIP)) currentPosition = 0;
        else currentPosition = currentPosition + RaceMove.SLIP;
        return currentPosition;
    }

    public static int getNumber(){
        return number;
    }

    public static void setNumber(){
       number = 1 + MoveDefinitions.getRandom().nextInt(10);
    }

    public static SecureRandom getRandom(){
        return random;
    }


}






