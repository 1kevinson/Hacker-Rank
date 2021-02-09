package kevin.io.formations.uml;


import java.time.LocalDate;
import java.util.List;

public class Person {

    private String name;
    private String address;
    private int age;

    public String getName() throws Exception {
        if (!isNameLengthCorrect()) throw new Exception("Name Length is not correct");

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNameLengthCorrect() {
        return this.name.trim().length() >= 5;
    }


}

class Schedule {

    private final String name;
    private List<Meeting> scheduledMeeting;

    public Schedule(String name) {
        this.name = name;
    }

    public void addMeetingInSchedule(Meeting newMeeting) {
        this.scheduledMeeting.add(newMeeting);
    }
}

class Meeting {

    private final String description;
    private final LocalDate dateStart;
    private final LocalDate dateEnd;

    Meeting(String description, LocalDate dateStart, LocalDate dateEnd) {
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
}