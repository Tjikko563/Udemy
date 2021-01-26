import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }

        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber > 0 && trackNumber <= songs.size()) {
            Song song = songs.get(trackNumber - 1);
            playlist.add(song);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {
        Song song = findSong(trackTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }

        return false;
    }
}
