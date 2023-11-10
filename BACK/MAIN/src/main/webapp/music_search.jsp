<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
    
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "shinee.search.SearchDAO" %>
<%@ page import = "shinee.search.Music_info" %>
<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>SHINee Music</title>
        <link rel="stylesheet" type="text/css" href="css/search.css">
        <link rel="stylesheet" type="text/css" href="css/all.css">
        
    </head>
    <body>
        <div class="container" style="margin-top:30px;">
            <aside>
                <button style="margin-top: 250px;">
                    <img src="img/mypage.png" style="width:85px; padding:0;" alt="myPage Icon">
                    <p><strong>mypage</strong></p>
                </button>
                <button style="margin-top: 50px;">
                    <img src="img/lookaround.png" style="width:85px; padding:0;" alt="lookaround Icon">
                    <p><strong>my<br>Playlist</strong></p>
                </button>
                <button style="margin-top: 50px;">
                    <img src="img/pixel_search.png" style="width:85px; padding:0;" alt="Search Icon">
                    <p><strong>search</strong></p>
                </button>
            </aside>
            <section>
                <div class="bluetop" style="margin-top:20px; width:1200px;">
                    <p style="margin-top:5px">Search</p>
                </div>
                <!-- 여기서부터 검색창 페이지 변경 -->
                <div style="width:1200px; height:30px; background-color: gray;">
                    <button id="categoryButton"><strong>music</strong></button>
                    <button id="categoryButton"><strong>album</strong></button>
                    <button id="categoryButton"><strong>playlist</strong></button>
                    <button id="categoryButton"><strong>user</strong></button>
                </div>
                <article>
                    <div style="margin-top: 60px; text-align: center;">
                        <img src="img/샤이니로고.png" alt="샤이니뮤직로고" style="width:150px;">
                        
                       	<form method="post" name="search" action="music_search.jsp">
                       		<!-- <select class="form-control" name="searchField">
								<option value="music_title">제목</option>
								<option value="artist_name">가수</option>
							</select>-->
			                <input type="text"
			                    placeholder="노래제목 검색" id= "searchText" name="searchText" minlength="2" maxlength="100"><!-- 최소 2글자 이상 -->
			                <button type="submit">검색</button>
	                  	</form>
	                  	
                        <div class="division-line"></div>
                       
                        <!--검색결과 올라가는 곳-->

                        <%	
 
                        	SearchDAO searchDAO = new SearchDAO();
                        	ArrayList<Music_info> musicList = searchDAO.getSearchMusics(request.getParameter("searchText"));
                        	
                        	if(musicList.size()==0){
                        		
								//검색결과 없을경우 보일 창
								
                        	}
                        	
	                        for(Music_info m : musicList) {
	                        	
                        %>           	       
							<p>제목 : <%=m.getSong_name()%> 가수 : <%=m.getArtist_name()%></p>
						<%
							}
						%>
                    </div>
                </article>
            </section>
        </div><!--container-->
    </body>
</html>