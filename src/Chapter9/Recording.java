package Chapter9;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Recording implements Comparable<Recording>{

    private String songTitle;
    private String songArtist;
    private double songLength;

    public Recording(String song, String artist, double length){
        songTitle = song;
        songArtist = artist;
        songLength = length;
    }

    public void setTitle(String title){
        songTitle = title;
    }

    public void setArtist(String artist){
        songArtist = artist;
    }

    public void songLength(String length){
        songTitle = length;
    }

    public String getTitle(){
        return songTitle;
    }

    public String getArtist(){
        return songArtist;
    }

    public double getLength(){
        return songLength;
    }

    public void display(){
        System.out.println(songTitle + songArtist + songLength);
    }

    public static void print(Recording[] recs) {
        for(int i = 0; i < recs.length; i++){
            System.out.println("Title: " + recs[i].songTitle + " Artist: " + recs[i].songArtist +
            " Length: " + recs[i].songLength);
        }
        System.out.println();
    }


//    trying comparable compareTo for one of the sorts
    public int compareTo(Recording o) {
        return new Double(this.songLength).compareTo(new Double(o.songLength));
    }

//    public int compareTo(Recording rec) {
//        if(this.songLength == rec.songLength)
//        return 0;
//        else
//        return this.songLength > rec.songLength ? 1 : -1;
//    }








}
