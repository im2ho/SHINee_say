package shinee.search;
import java.sql.Date;

public class MusicSearch_info {

	//music_info와 album_info JOIN한 멤버변수
	private String song_id;
	private String album_id;
	private String song_name;
	private String artist_name; //music_info 컬럼
	private String genre;
	private String album_name;
	private String album_type;
	private Date release_date;
	
	//생성자
	public MusicSearch_info(String song_name, String album_name, String artist_name, String genre) {
		this.song_name = song_name;
		this.album_name = album_name;
		this.artist_name = artist_name;
		this.genre = genre;
	}

	
	public MusicSearch_info(String song_name, String artist_name) {
		this.song_name = song_name;
		this.artist_name = artist_name;
	}


	//Getter & Setter-------------------------
	public String getSong_id() {
		return song_id;
	}

	public void setSong_id(String song_id) {
		this.song_id = song_id;
	}

	public String getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	public String getSong_name() {
		return song_name;
	}

	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getAlbum_type() {
		return album_type;
	}

	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
		
}
