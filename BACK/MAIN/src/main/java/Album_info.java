import java.sql.Date;

public class Album_info {

	//�������
	private String album_id;
	private String album_name;
	private String album_type;
	private String artist_name;
	private Date release_date;
	
	//����Ʈ ������
	public Album_info() {};
		
	//��� ��������� �ش��ϴ� ���� �޴� ������
	public Album_info(String album_id, String album_name, String album_type, String artist_name, Date release_date) {
		this.album_id = album_id;
		this.album_name = album_name;
		this.album_type = album_type;
		this.artist_name = artist_name;
		this.release_date = release_date;
	}
		
	//���� �˻� ���� (1������) ������
	public Album_info(String album_name) {
		this.album_name = album_name;
	}
	
	//Getter------------------------------------

	public String getAlbum_id() {
		return album_id;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public String getAlbum_type() {
		return album_type;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public Date getRelease_date() {
		return release_date;
	}

	//Setter------------------------------------
	
	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}	
}