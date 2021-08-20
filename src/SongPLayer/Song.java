package SongPLayer;

public class Song {
    private String title;
    private double duration;

    // constructor
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // getter
    public String getTitle() {
        return title;
    }

    // overridding of the toString()
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
