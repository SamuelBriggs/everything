package Chapter8.TimeClassExercise.DiaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
    private LocalDateTime time = LocalDateTime.now();
    private int Id;

    public Entry(){
    }
@Override
    public String toString(){
        return String.format("""
                Title = %s
                Body = %s
                TimeOfEntry = %s
                ID = %s
                """, this.title, this.body, getTime(), this.Id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time.format(formatter);
    }

    public void setTime() {
    }

    public void setId(int id){
        Id = id;
    }

    public int getId() {
        return Id;
    }
}

