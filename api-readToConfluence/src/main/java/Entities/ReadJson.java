package Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ReadJson implements Serializable {

    private String session_id;
    private String trigger;
    private String title;
    private String start_time;
    private String end_time;

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String toString()
    {
        return "session_id" + session_id + "trigger" + trigger + "title" + title + "start_time" + start_time +
                "end_time" + end_time;
    }
}