package exercise1;

public class Song {

    //Declare Vars
    private String titel;
    private int duration;
    private String artist;

    //Create Constructor
    public Song(String titel, int duration, String artist) {
        this.titel = titel;
        this.duration = duration;
        this.artist = artist;
    }

    public String songTime() {
      //Change seconds into X Minuten x Sekunden
      return duration / 60 + " Minuten " + duration % 60 + " Sekunden";
    }

    @Override
    public String toString() {
        //Change toString Method output
        return "The song " + titel + " from " + artist + " is " + duration + " seconds long";
    }
}
