package shinee.search;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")

public class SearchServlet extends HttpServlet {
	
	//��𼭵��� DB�� ������ �� �ְ� �޼��� �� static�� �÷�������
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String jbdcUsername = "shinee";
	private static final String jdbcPassword = "shinee";
	
	public List<MusicSearch_info> getSearchMusics(String searchText){
		
		//2. �迭 ���鷯�ӽ��ϴ� ����
		ArrayList<MusicSearch_info> musicList = new ArrayList<>();
		
		Connection connection = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection(jdbcURL, jbdcUsername, jdbcPassword);
			
			String searchSQL = "SELECT music.song_name, music.artist_name, album.album_name, music.genre"
					+ "FROM music_info music"
					+ "JOIN album_info album ON music.album_id = album.album_id"
					+ "WHERE song_name LIKE '%?%'";
			
			if(searchText != null && !searchText.equals("")) {
				searchSQL = "SELECT music.song_name, music.artist_name, album.album_name, music.genre"
						+ "FROM music_info music";
			}
			
			PreparedStatement searchState = connection.prepareStatement(searchSQL);
			
			//searchState.setString(1, searchText);
			
			ResultSet resultSet = searchState.executeQuery();
	
			while(resultSet.next()) {
				String song_name = resultSet.getString("song_name");
				String artist_name = resultSet.getString("artist_name");
				//String album_name = resultSet.getString("album.album_name");
				//String genre = resultSet.getString("music.genre");
				
				//MusicSearch_infoŬ���� ��ü ����
				MusicSearch_info musicSearch_info = new MusicSearch_info(song_name, artist_name);

				//1. �迭�� ��ü �������� �ϴ� �迭 �����ðԿ�
				//3. �����ӽ��ϴ� ����ٰԿ�
				musicList.add(musicSearch_info);
			}
			
			//���Ǹ���� �����սô�
			//request.setAttribute("musicList", musicList);
			//request.getRequestDispatcher("/search.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return musicList;
		
	} 

	//doGet() : ���� ��������� �޼���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//searchKeyword : �˻� Ű����
		String searchKeyword = request.getParameter("searchText");
		
		//DB����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection(jdbcURL, jbdcUsername, jdbcPassword);
			
			String searchSQL = "SELECT music.song_name, music.artist_name, album.album_name, music.genre"
					+ "FROM music_info music"
					+ "JOIN album_info album ON music.album_id = album.album_id"
					+ "WHERE song_name LIKE '%?%'";
			
			PreparedStatement searchState = connection.prepareStatement(searchSQL);
			
			searchState.setString(1, searchKeyword);
			
			ResultSet resultSet = searchState.executeQuery();
			
			//2. �迭 ���鷯�ӽ��ϴ� ����
			ArrayList<MusicSearch_info> musicList = new ArrayList<>();
			
			while(resultSet.next()) {
				String song_name = resultSet.getString("song_name");
				String artist_name = resultSet.getString("artist_name");
				String album_name = resultSet.getString("album_name");
				String genre = resultSet.getString("genre");
				
				//MusicSearch_infoŬ���� ��ü ����
				MusicSearch_info musicSearch_info = new MusicSearch_info(song_name, album_name, artist_name, genre);

				//1. �迭�� ��ü �������� �ϴ� �迭 �����ðԿ�
				//3. �����ӽ��ϴ� ����ٰԿ�
				musicList.add(musicSearch_info);
			}
			
			//���Ǹ���� �����սô�
			request.setAttribute("musicList", musicList);
			request.getRequestDispatcher("/search.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

} //class
