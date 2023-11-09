<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.List" %>
<%@ page import = "shinee.search.SearchServlet" %>
<%@ page import = "shinee.search.MusicSearch_info" %>
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
                        <input type="text"
                            placeholder="검색어 입력" name="searchText" maxlength="100">
                        <button type="submit" value="검색" id="searchButton">검색</button>
                        <div class="division-line"></div>
                        
                        <!--검색결과 올라가는 곳-->
                        <p>올라가라</p>
                        <%
	                		String searchText_value = (String)request.getParameter("searchText");
	                			
	                        SearchServlet searchServlet = new SearchServlet();
	                        List<MusicSearch_info> musicList = searchServlet.getSearchMusics(searchText_value);
	                            
	                        for(MusicSearch_info m : musicList) {
                        %>
                            
							<p><%=m.getSong_name()%></p>
			
							<p><%=m.getArtist_name()%></p>
								
						<%
							}
						%>
                    </div>
                </article>
            </section>
        </div><!--container-->
    </body>
</html>