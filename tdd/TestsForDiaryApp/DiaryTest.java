package TestsForDiaryApp;

import Chapter8.TimeClassExercise.DiaryApp.Diary;
import Chapter8.TimeClassExercise.DiaryApp.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    private Diary newDiary;
    private Diary myDiary;

    private Entry entry;

    @BeforeEach
    public void setUp() {
        newDiary = new Diary("name", "name");
        myDiary = new Diary("na", "n");
        entry = new Entry();

    }
    @Test

    public void testCreationOfDiary(){

        String expected =String.format("""
                Title  = Samuel
                Body = This is my life Story
                TimeOfEntry = %s
                ID = 1
                """,entry.getTime());
        assertEquals(expected, newDiary.viewEntry(1).toString());
    }

    @Test

    public void testForEntriesEdit(){

        System.out.println(newDiary.viewEntry(6));
        System.out.println(newDiary.getDiary());
    }

    @Test

    public void testDeleteEntry(){
        newDiary.deleteEntry(2);
        System.out.println(newDiary.viewEntry(4));
      // System.out.println(newDiary.getDiary());


    }


}
