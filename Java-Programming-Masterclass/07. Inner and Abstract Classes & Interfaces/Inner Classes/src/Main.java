import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Album album = new Album("Random", "Shepherd");
    private static LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        album.addToPlayList("You can't do it right", playlist);
        album.addToPlayList("Holy man", playlist);
        album.addToPlayList("Speed king", playlist);  // Does not exist
        album.addToPlayList(9, playlist);

        System.out.println("Available actions:");
        printActionsMain();
        boolean flag = false;
        while (!flag) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    addSong();
                    break;
                case 2:
                    addToPlaylist();
                    break;
                case 3:
                    listSongsInPlaylist();
                    break;
                case 4:
                    printActionsMain();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }

        ListIterator<Song> listIterator = playlist.listIterator();
        listIterator.next();

        System.out.println("Playlist Opened. Available actions:\n");
        printActionsSecondary();
         flag = false;
        while (!flag) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    skipForward(listIterator);
                    break;
                case 2:
                    skipBackward(listIterator);
                    break;
                case 3:
                    replayCurrentSong(listIterator);
                    break;
                case 4:
                    listSongsInPlaylist();
                    break;
                case 5:
                    printActionsSecondary();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    private static void printActionsMain() {
        System.out.print("0 -> Close application.\n" +
                "1 -> Add a new song.\n" +
                "2 -> Add existing song to playlist.\n" +
                "3 -> List songs in playlist.\n" +
                "4 -> Print available actions.\n");
    }

    private static void printActionsSecondary() {
        System.out.print("0 -> Quit.\n" +
                "1 -> Skip to next song.\n" +
                "2 -> Skip to previous song.\n" +
                "3 -> Replay current song.\n" +
                "4 -> List songs in playlist.\n" +
                "5 -> Print available actions.\n");
    }

    private static void addSong() {
        System.out.println("Enter song title:");
        String songTitle  = scanner.nextLine();
        System.out.println("Enter song duration:");
        double songDuration = scanner.nextDouble();
        scanner.nextLine();

        if (album.addSong(songTitle, songDuration)) {
            System.out.println("Song added successfully.");
        } else {
            System.out.println("Error adding song.");
        }
    }

    private static void addToPlaylist() {
        System.out.print("Press '1' to add song by track number.\n" +
                "Press '2' to add song by title.\n");
        int action = scanner.nextInt();
        scanner.nextLine();

        if (action == 1) {
            System.out.println("Enter song track number:");
            int trackNumber = scanner.nextInt();
            scanner.nextLine();
            if (album.addToPlayList(trackNumber, playlist)) {
                System.out.println("Song added successfully to playlist.");
            } else {
                System.out.println("Error adding song to playlist.");
            }
        } else if (action == 2) {
            System.out.println("Enter song title:");
            String songTitle = scanner.nextLine();
            if (album.addToPlayList(songTitle, playlist)) {
                System.out.println("Song added successfully to playlist.");
            } else {
                System.out.println("Error adding song to playlist.");
            }
        }
    }

    private static void listSongsInPlaylist() {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("Playlist:");

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    private static void skipForward(ListIterator<Song> listIterator) {
        if (listIterator.hasNext()) {
            System.out.println("Now playing: " + listIterator.next());
        } else {
            System.out.println("We are at the end of the playlist.");
        }
    }

    private static void skipBackward(ListIterator<Song> listIterator) {
        listIterator.previous();
        if (listIterator.hasPrevious()) {
            System.out.println("Now playing: " + listIterator.previous());
        } else {
            System.out.println("We are at the beginning of the playlist.");
        }
        listIterator.next();
    }

    private static void replayCurrentSong(ListIterator<Song> listIterator) {
        System.out.println("Replaying: " + listIterator.previous());
        listIterator.next();
    }
}


    /*private static void playSongInPlaylist(ListIterator<Song> listIterator) {
        System.out.print("Press '1' for next song.\n" +
                "Press '2' for previous song.\n");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
            case 1:
                if (listIterator.hasNext()) {
                    System.out.println("Now playing: " + listIterator.next());
                } else {
                    System.out.println("We are at the end of the playlist.");
                }
                break;
            case 2:
                listIterator.previous();
                if (listIterator.hasPrevious()) {
                    System.out.println("Now playing: " + listIterator.previous());
                } else {
                    System.out.println("We are at the beginning of the playlist.");
                }

                listIterator.next();
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }*/