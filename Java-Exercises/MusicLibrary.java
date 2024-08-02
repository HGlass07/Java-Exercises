import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MusicLibrary {
	private String songName;
	private String artist;
	
	public static Map<String, String> songList = new HashMap<>();
	
	public MusicLibrary(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
        }
	
	public String getSong() {
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public static void addSong(String songName, String artist) {
    	if (!songList.containsKey(songName)) {
    		songList.put(songName, artist);
    		System.out.println(songName + " added");
    	}
    	else {
    		System.out.println("Song already added");
    	}
    	
    }
    
    
    public static void removeSong(String songName) {
        if (songList.containsKey(songName)) {
            songList.remove(songName);
            System.out.println(songName + " removed");
        } 
        else {
            System.out.println("Song not found");
        }
    }
	
    
    public static void playSong(String songName) {
    	if (songList.containsKey(songName)) {
    		String artist = songList.get(songName);
    		System.out.println("Now playing: " + songName + " by " + artist);
    	}
    	else {
    		System.out.println("Song not found");
    	}
    }
    
    public static void playRandom() {
    	if (songList.isEmpty()) {
    		System.out.println("Song list empty");
    		return;
    	}
    	Set<String> songNames = songList.keySet();
    	String[] songsArray = songNames.toArray(new String[0]);
    	Random random = new Random();
    	String randomSong = songsArray[random.nextInt(songsArray.length)];
    	playSong(randomSong);
    }

	public static void main(String[] args) {
		
		
		addSong("Black Dog", "Led Zepplin");
		addSong("Fire Escape in the Sea", "Sea Power");
		addSong("Glowing Bones", "Clams Casino");
		addSong("Ocean Man", "Ween");
		
		System.out.println(songList);
		
		removeSong("Glowing Bones");
		
		System.out.println(songList);
		
		playSong("Black Dog");
		
		playRandom();

	}

}
