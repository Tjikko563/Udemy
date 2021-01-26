import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber > 0 && trackNumber <= songs.songs.size()) {
            Song song = songs.songs.get(trackNumber - 1);
            playlist.add(song);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String trackTitle, LinkedList<Song> playlist) {
        Song song = songs.findSong(trackTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }

        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }

            return false;
        }

        private Song findSong(String title) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getTitle().equals(title)) {
                    return songs.get(i);
                }
            }

            return null;
        }

        private Song findSong(int trackNumber) {
            for (int i = 0; i < songs.size(); i++) {
                if (trackNumber > 0 && trackNumber <= songs.size()) {
                    return songs.get(trackNumber - 1);
                }
            }

            return null;
        }

    }
}
