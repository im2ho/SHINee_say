<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
    
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "shinee.search.SearchDAO" %>
<%@ page import = "shinee.insert.InsertDAO" %>
<%@ page import = "shinee.search.Music_info" %>
<%@ page import = "shinee.search.Playlist_info" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>insert Music</title>
		<link rel="stylesheet" type="text/css" href="css/search.css">
        <link rel="stylesheet" type="text/css" href="css/all.css">
	</head>
	<body>
	
		<!-- 내 플레이리스트가 뜰 곳 -->
		<div>
			<%
				InsertDAO insertDAO = new InsertDAO();
			    String session_user_id = (String)session.getAttribute("user_id");
				ArrayList<Playlist_info> myplaylists = insertDAO.getAllPlaylist(session_user_id);
					                        
				//로그인 정보가 없을시
				if(session_user_id == null){
			%>
				<p>로그인 후 이용해주세요</p>
			<%
				} else {	
			%>
				<p>나의 플레이리스트</p>
				<select name="playlistFiled">	
			<%
					for(Playlist_info p : myplaylists) {
				%>
						<option value=<%=p.getPlaylist_name()%>><%=p.getPlaylist_name()%></option>
				<%
					}; //for
				%>
				</select>
				<button>저장</button>
			<%
				} //else
			%>
		</div>

	</body>
</html>