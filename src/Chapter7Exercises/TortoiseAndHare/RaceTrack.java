package Chapter7Exercises.TortoiseAndHare;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class RaceTrack {
    private final String[][] lanes;

    private static final String display = "Ouch!!!!";
    private final int TORTOISE_LANE = 0;
    private final int HARE_LANE = 1;

    private int currentTortoisePosition;

    private int currentHarePosition;

    private String[] lane;

    private String blankspace = " ";

    private final String TORTOISE = "T";
    private final String HARE = "H";


    public RaceTrack() {
        this.lanes = new String[2][70];

        for (String[] lane : lanes) {
            Arrays.fill(lane, blankspace);
        }

        lanes[TORTOISE_LANE][currentTortoisePosition] = TORTOISE;
        lanes[HARE_LANE][currentHarePosition] = HARE;

    }

    public String[][] getLanes() {
        return lanes;
    }

    public int getCurrentTortoisePosition() {
        return currentTortoisePosition;
    }
    public int getCurrentHarePosition() {
        return currentHarePosition;
    }



    public String getBlankspace() {
        return blankspace;
    }


    public int getTORTOISE_LANE() {
        return TORTOISE_LANE;
    }

    public int getHARE_LANE() {
        return HARE_LANE;
    }

    public String getTORTOISE() {
        return TORTOISE;
    }


    public void play() {
        String[] tortoiseLane = getLanes()[getTORTOISE_LANE()];
        String[] hareLane = getLanes()[getHARE_LANE()];
        while ((!tortoiseLane[69].equalsIgnoreCase("T") && (!(hareLane[69].equalsIgnoreCase("H"))))) {
            MoveDefinitions.setNumber();
            System.out.println("Random Number is " + MoveDefinitions.getNumber());
            moves();
        }
    }
    public void moves() {
        tortoiseMoves();
        hareMoves();
        checkIfBothAnimalsAreOnSameLane();
        display();
        checkForWInner();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public void tortoiseMoves() {
        String[] lane = lanes[TORTOISE_LANE];
        lane[currentTortoisePosition] = blankspace;
        currentTortoisePosition = MoveDefinitions.possibleTortoiseMoves();
        lane[currentTortoisePosition] = TORTOISE;
    }

    public void hareMoves() {
        String[] lane = lanes[HARE_LANE];
        lane[currentHarePosition] = blankspace;
        currentHarePosition = MoveDefinitions.possibleHareMoves();
       // System.out.println(currentHarePosition);
        lane[currentHarePosition] = HARE;

    }

    public void checkIfBothAnimalsAreOnSameLane() {
        String[] tortoiseLane = lanes[getTORTOISE_LANE()];
        String[] hareLane = lanes[HARE_LANE];
        for (int i = 1; i <= 69; i++) {
            if (tortoiseLane[i].equalsIgnoreCase(TORTOISE) && hareLane[i].equalsIgnoreCase(HARE)){
                hareLane[i] = display;
                tortoiseLane[i] = TORTOISE + blankspace + blankspace;}
        }
    }

    public void checkForWInner() {
        String[] tortoiseLane = lanes[getTORTOISE_LANE()];
        String[] hareLane = lanes[HARE_LANE];


        if (tortoiseLane[69].equalsIgnoreCase((TORTOISE)) && hareLane[69].equalsIgnoreCase(HARE)) System.out.println("This is a tie");
        else if (tortoiseLane[69].equalsIgnoreCase(TORTOISE)) System.out.println("Tortoise is the Winner");
        else if (hareLane[69].equalsIgnoreCase(HARE)) System.out.println("Hare is the Winner");

    }

    public void display(){
        String[] tortoiseLane = lanes[getTORTOISE_LANE()];
        String[] hareLane = lanes[HARE_LANE];
        System.out.println(Arrays.toString(tortoiseLane));
        System.out.println();
        System.out.println(Arrays.toString(hareLane));
        System.out.println();

    }


}