package TestsForDiaryApp;

import Chapter8.TimeClassExercise.DiaryApp.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {
    private Entry entry;

    @Test
    public void testToString() {
        entry = new Entry();
        System.out.println(entry.toString());
        System.out.println(entry.getTime());
        //assertEquals()
    }
}
