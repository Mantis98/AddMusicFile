import file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        MP3MusicFile musicFile = new MP3MusicFile("file.mp3", 2000, "The beatles",
                "Yellow submarine", 10);

        String file =musicFile.toString();
        System.out.println(file);

    }
}
