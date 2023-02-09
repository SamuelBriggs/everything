package Chapter8.TimeClassExercise.DiaryApp;

import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entries = new ArrayList<>();
    private int diaryID = 1;

    private String userName;

    private String password;

    private boolean isLocked;

    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public void createEntry(String title, String body, String userName, String password) {
       Entry entry = new Entry();
        entry.setTitle(title);
        entry.setBody(body);
        entry.setId(diaryID);
        diaryID++;
        entries.add(entry);
        this.userName = userName;
        this.password = password;
        animatedDisplay("Saving");

    }


    public String viewEntry(int id) {
        Entry entry = returnValidEntryForAction(id);
        if (entry==null) throw new NullPointerException("Error: Entry of this ID does not exist");
        else return entry.toString();
    }

    public void deleteEntry(int id) {
        Entry entry = returnValidEntryForAction(id);
        if (entry==null) throw new NullPointerException("Error: Entry at this ID does not exist");
        else entries.remove(entry.getId()-1);
    }
    public int countOfItemsInDiary() {
        return entries.size();
    }

    public void editAction(int id, String title, String body) {
        Entry entry = returnValidEntryForAction(id);
        if(entry==null) throw new NullPointerException("Error: Entry at this ID does not exist");
        entry.setTitle(title);
        entry.setBody(body);
    }
    public ArrayList<Entry> getDiary() {
        return entries;
    }
    public void validateID(int id) {
        boolean check = false;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            boolean correctID = entry.getId() == id;
            if (correctID) check = true;
        }
        if (!check) throw new NullPointerException("Error: Entry at this ID does not exist");
    }

    public Entry returnValidEntryForAction(int id) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            boolean rightID = entry.getId() == id;
            if (rightID) return entry;
        }
        return null;
    }

    public void animatedDisplay(String action){
        System.out.print(action);
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }


}


