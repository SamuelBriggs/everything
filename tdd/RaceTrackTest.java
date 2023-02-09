import Chapter7Exercises.TortoiseAndHare.MoveDefinitions;
import Chapter7Exercises.TortoiseAndHare.RaceTrack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RaceTrackTest {

    private RaceTrack raceTrack;

        @BeforeEach
        public void setUp(){
            raceTrack=new RaceTrack();
        }



        @Test
        public void testThatRaceTrackExists(){
            assertNotNull(raceTrack);
        }


        @Test
        public void testThatAllSquaresInLanesAreFilledWithBlankSpaces(){
            int hareLaneIndex = raceTrack.getHARE_LANE();
            String[] hareLane = raceTrack.getLanes()[hareLaneIndex];

            assertEquals(raceTrack.getBlankspace(), hareLane[8]);
        }
        @Test

        public void testThatTortoiseLaneAtDefaultHasTortoiseSymbol(){
            String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTORTOISE_LANE()];
            assertEquals(raceTrack.getTORTOISE(), tortoiseLane[0]);
        }


@Test public void testFastPlod() {
    int currentPosition = raceTrack.getCurrentTortoisePosition();
    System.out.println(currentPosition);
    raceTrack.moves();
    raceTrack.moves();
   // System.out.println(MoveDefinitions.number);
    raceTrack.moves();

  //  System.out.println(MoveDefinitions.number);

    System.out.println(raceTrack.getCurrentTortoisePosition());

}
@Test

    public void testHareBigMove(){
    int currentPosition = raceTrack.getCurrentHarePosition();
    System.out.println(currentPosition);

    for (int i = 0; i < 2; i++) {
        raceTrack.moves();

    }
   System.out.println(MoveDefinitions.possibleHareMoves());


    }

    @Test

    public void testTortoiseMove(){
        int currentPosition = raceTrack.getCurrentHarePosition();
        System.out.println(currentPosition);
        System.out.println(MoveDefinitions.possibleTortoiseMoves());
        System.out.println(raceTrack.getCurrentHarePosition());

    }

    @Test

    public void testBothAnimalMoves(){

            int tortoisePosition = raceTrack.getCurrentTortoisePosition();
            int hareposition = raceTrack.getCurrentHarePosition();
        System.out.println(tortoisePosition);
        System.out.println(hareposition);
        System.out.println();
        raceTrack.moves();
        raceTrack.moves();
        raceTrack.moves();

        System.out.println(raceTrack.getCurrentTortoisePosition());
        System.out.println(raceTrack.getCurrentHarePosition());
        String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTORTOISE_LANE()];
        String[] hareLane = raceTrack.getLanes()[raceTrack.getHARE_LANE()];
        String tor = tortoiseLane[raceTrack.getCurrentTortoisePosition()];
        String hare = hareLane[raceTrack.getCurrentHarePosition()];
        System.out.println(tor);
        System.out.println(hare);
        System.out.println(hareLane[0]);

            }

    @Test

    public void testHareBigSlipMove(){
            int currentPosition = raceTrack.getCurrentHarePosition();
        System.out.println(currentPosition);
    //   int newPosition=  MoveDefinitions.possibleHareMoves(3, raceTrack.getCurrentHarePosition());
      //  System.out.println(newPosition);
      // int pos = MoveDefinitions.possibleHareMoves( newPosition);
       //int posi = MoveDefinitions.possibleHareMoves, pos);
        //System.out.println(posi);

    }

    @Test

    public void playGame(){

        String [] tortoiseLane = raceTrack.getLanes()[raceTrack.getTORTOISE_LANE()];
        String [] hareLane = raceTrack.getLanes()[raceTrack.getHARE_LANE()];
        while ((!tortoiseLane[69].equalsIgnoreCase("T") && (!(hareLane[69].equalsIgnoreCase("H"))))){
        //    MoveDefinitions.getNumber = 1 + MoveDefinitions.random.nextInt(10);
         //   System.out.println("Random Number is " + MoveDefinitions.number);
            raceTrack.moves();
        }



    }
}










