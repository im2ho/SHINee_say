package shinee.search;

import java.sql.Blob;

public class User_search_info {
	
	//멤버변수
	private String user_id;
	private String user_name;
	private String user_nickname;
	private String user_password;
	private String email;
	private String phone_number;
	private Blob profile_img;
	
	//디폴트 생성자
	public User_search_info() {};
	
	//사용자 검색 정보 (아이디 / 닉네임 / 프사) 생성자
	public User_search_info(String user_id, String user_nickname, Blob profile_img) {
		this.user_id = user_id;
		this.user_nickname = user_nickname;
		this.profile_img = profile_img;
	}

	
	//Getter-------------------------------------
	
	public String getUser_id() {
		return user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public String getUser_password() {
		return user_password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public Blob getProfile_img() {
		return profile_img;
	}


	
	//Getter-------------------------------------
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	
	public void setProfile_img(Blob profile_img) {
		this.profile_img = profile_img;
	}
	
}
