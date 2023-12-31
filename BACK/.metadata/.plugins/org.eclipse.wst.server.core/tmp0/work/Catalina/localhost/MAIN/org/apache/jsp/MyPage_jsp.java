/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-11-19 17:32:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shinee.vo.User_info_VO;
import shinee.dao.MyPage_DAO;
import shinee.vo.Follow_list_VO;
import shinee.dao.FollowBlob_DAO;
import shinee.dao.MyPlayList_DAO;
import shinee.vo.Playlist_info_VO;
import java.util.List;

public final class MyPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("shinee.vo.Follow_list_VO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("shinee.vo.User_info_VO");
    _jspx_imports_classes.add("shinee.dao.MyPage_DAO");
    _jspx_imports_classes.add("shinee.dao.FollowBlob_DAO");
    _jspx_imports_classes.add("shinee.dao.MyPlayList_DAO");
    _jspx_imports_classes.add("shinee.vo.Playlist_info_VO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>SHINee Music</title>\r\n");
      out.write("        <style>\r\n");
      out.write("		    .col-md-3, .col-md-6 {\r\n");
      out.write("			background: transparent;\r\n");
      out.write("			border-style: solid;\r\n");
      out.write("		    border-color: #DAF8FF;\r\n");
      out.write("			padding: 40px;\r\n");
      out.write("			border-radius: 5px;\r\n");
      out.write("			box-shadow: 0.5px 0.5px 2px 1px #eee;\r\n");
      out.write("			text-align: left;\r\n");
      out.write("			margin-left: 20px;\r\n");
      out.write("			margin-right: 20px;\r\n");
      out.write("			margin-bottom: 40px;\r\n");
      out.write("		    }\r\n");
      out.write("		    .white-box {\r\n");
      out.write("		    display:inline;\r\n");
      out.write("		    }\r\n");
      out.write("		    .playlists {\r\n");
      out.write("		    }\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/myPage.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("		");

			//user_id 값이 존재하지 않을 경우 로그인 페이지로 돌아갑니다.
			if(session.getAttribute("user_id") == null){
				
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("						alert(\"로그인이 필요한 서비스입니다.\");\r\n");
      out.write("						location.href=\"login.jsp\";\r\n");
      out.write("					</script>\r\n");
      out.write("				");

			} else {
				//user_id값이 존재한다면
		
      out.write("    \r\n");
      out.write("	    <div class=\"container\" style=\"margin-top:30px;\">\r\n");
      out.write("	    	<aside>\r\n");
      out.write("	            <button id=\"gotoMyPageButton\" style=\"margin-top: 250px;\">\r\n");
      out.write("		        	<img src=\"img/mypage.png\" style=\"width:85px; padding:0;\" alt=\"myPage Icon\">\r\n");
      out.write("		            <p><strong>mypage</strong></p>\r\n");
      out.write("		        </button>\r\n");
      out.write("		        <button id=\"gotoMyPlaylistButton\" style=\"margin-top: 50px;\">\r\n");
      out.write("		            <img src=\"img/lookaround.png\" style=\"width:85px; padding:0;\" alt=\"lookaround Icon\">\r\n");
      out.write("		            <p><strong>my<br>Playlist</strong></p>\r\n");
      out.write("		        </button>\r\n");
      out.write("		        <button id=\"gotoSearchButton\" style=\"margin-top: 50px;\">\r\n");
      out.write("		            <img src=\"img/pixel_search.png\" style=\"width:85px; padding:0;\" alt=\"Search Icon\">\r\n");
      out.write("		            <p><strong>search</strong></p>\r\n");
      out.write("		        </button>\r\n");
      out.write("	        </aside>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<div style=\"margin: 0 auto; text-align: left;\">\r\n");
      out.write("	        <section>\r\n");
      out.write("	        \r\n");
      out.write("	            <div class=\"bluetop\" style=\"margin-top:20px; width:1200px;  margin: 0 auto;\">\r\n");
      out.write("	                <p style=\"margin-top:5px;\" ><img src=\"img/smile.png\" style=\"height: 50px; float: left; margin-top: -17px; \"><strong>My Page</strong></p>\r\n");
      out.write("	            </div>\r\n");
      out.write("	            <div style=\"width:1200px; height:30px; background-color: gray;\">\r\n");
      out.write("	                \r\n");
      out.write("	                <article>\r\n");
      out.write("	                    <div class=\"d-flex\">\r\n");
      out.write("	                        <div class=\"flex-shrink-0\">\r\n");
      out.write("	                        ");
                  
			                	// 회원 정보 가져오기!!!!! 
			                    String id = (String) session.getAttribute("user_id");
			                  
			                    MyPage_DAO mypageDAO = new MyPage_DAO();
			                    User_info_VO userinfo = mypageDAO.getMember(id);
			                
      out.write("\r\n");
      out.write("	                            \r\n");
      out.write("	                            <br>\r\n");
      out.write("	                            <br>\r\n");
      out.write("	                            <br>\r\n");
      out.write("	                            ");

	                            	if(userinfo.getProfile_img()==null){
	                            
      out.write(" 		\r\n");
      out.write("	                            		<img class=\"profile\" src=\"img/알계.jpg\" style=\"width: 200px; height: 200px;\">\r\n");
      out.write("	                            ");

	                            	} else {
	                            
      out.write("\r\n");
      out.write("	                            		<img class=\"profile\" src=\"");
      out.print(userinfo.getProfile_img());
      out.write("\" style=\"width: 200px; height: 200px;\">\r\n");
      out.write("	                            ");

	                            	}
	                            
      out.write("\r\n");
      out.write("	                             \r\n");
      out.write("	                          \r\n");
      out.write("	                        </div>\r\n");
      out.write("	  \r\n");
      out.write("	                        <div class=\"flex-grow-1 ms-3\">\r\n");
      out.write("								<h4>");
      out.print( userinfo.getUser_nickname() );
      out.write("</h4>\r\n");
      out.write("								<h4>");
      out.print( userinfo.getUser_id() );
      out.write("</h4>\r\n");
      out.write("								<h4>");
      out.print( userinfo.getEmail() );
      out.write("</h4>\r\n");
      out.write("	                      \r\n");
      out.write("								<button style=\"margin-top: 10px; background-color: transparent\"  class=\"btn btn-primary\" onclick=\"location.href='Modify_user_info.jsp'\">\r\n");
      out.write("				                	<img src=\"img/pencil.png\" style=\"width:40px; padding:0;\" alt=\"Modify Icon\">\r\n");
      out.write("				             	</button>\r\n");
      out.write("								<br>\r\n");
      out.write("								");

						 			//만약 mno값이 존재할 경우 빈(null)값이 아닐경우
						 			if(session.getAttribute("user_id") != null){
						 		
      out.write("\r\n");
      out.write("						 				<button id=\"logoutButton\" style=\"margin-top: 10px; background-color: transparent\" onclick=\"location.href='logout.jsp'\">\r\n");
      out.write("					         				<img src=\"img/로그아웃.png\" style=\"width:85px; padding:0;\" alt=\"Logout Icon\" >\r\n");
      out.write("					     				</button>\r\n");
      out.write("						 		");

						 			}//if(session.getAttribute("user_id") != null)
								
      out.write("\r\n");
      out.write("					        <br>\r\n");
      out.write("				            <br>\r\n");
      out.write("				            <br>\r\n");
      out.write("				            <form action=\"DeleteUserInfoServlet\" method=\"post\" id=\"deleteForm\">\r\n");
      out.write("						    <input type=\"hidden\" name=\"user_id\" value=\"");
      out.print( userinfo.getUser_id() );
      out.write("\">\r\n");
      out.write("						    <button type=\"button\" class=\"btn btn-default pull right\" onclick=\"confirmAndSubmit()\">SHINee Music 탈퇴하기</button>\r\n");
      out.write("							</form>\r\n");
      out.write("							\r\n");
      out.write("							<script>\r\n");
      out.write("								function confirmAndSubmit() {\r\n");
      out.write("								    if (confirm('정말 Shinee Nusic을 탈퇴하시겠습니까?!!')) {\r\n");
      out.write("								        // 사용자가 확인을 누르면 폼을 제출한다.\r\n");
      out.write("								        document.getElementById('deleteForm').submit();\r\n");
      out.write("								    } else {\r\n");
      out.write("								        // 사용자가 취소를 누른 경우 아무것도 하지 않는다.\r\n");
      out.write("								    }\r\n");
      out.write("								}\r\n");
      out.write("							</script>\r\n");
      out.write("	                        </div>\r\n");
      out.write("	                        \r\n");
      out.write("	                    </div> \r\n");
      out.write("	                    <br><br><br><br>\r\n");
      out.write("	             <div class=\"col-md-6\">\r\n");
      out.write("	            <div class=\"white-box\">\r\n");
      out.write("	              <div class=\"mb-5\">\r\n");
      out.write("	             <span style=\"display: flex; align-items: center;\">\r\n");
      out.write("				    <img class=\"profile\" src=\"img/headset.gif\" style=\"width: 60px; height: 60px;\">\r\n");
      out.write("				    <h3 style=\"margin-left: 10px; margin-top: 0; margin-bottom: 0;\">My playlist</h3>\r\n");
      out.write("				</span>\r\n");
      out.write("				<br>\r\n");
      out.write("	                ");

		                String id_2 = (String) session.getAttribute("user_id");
		 				   //회원의 플레이 리스트 가져오기!!!!
		                MyPlayList_DAO playlistDAO = new MyPlayList_DAO();
						List<Playlist_info_VO> playlists = playlistDAO.getAllPlaylists(id_2);
				
						for(Playlist_info_VO p : playlists){
	                	
      out.write("\r\n");
      out.write("			                <div style=\"display: inline-block; margin: 10px;\">\r\n");
      out.write("			                    <a href=\"playListDetail.jsp?playlistId=");
      out.print(p.getPlaylist_id());
      out.write("\"><img class=\"profile\" src=\"");
      out.print( p.getImage() );
      out.write("\" style=\"width: 180px; height: 180px;\"></a>\r\n");
      out.write("			                    <div><p><strong>");
      out.print(p.getPlaylist_name());
      out.write("</strong></p></div>\r\n");
      out.write("			                    \r\n");
      out.write("			                </div>\r\n");
      out.write("	                \r\n");
      out.write("	                	");

	                	}//for(Playlist_info_VO p : playlists)
	                
      out.write("\r\n");
      out.write("	              </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("	          </div>\r\n");
      out.write("\r\n");
      out.write("	          <br>\r\n");
      out.write("	                            \r\n");
      out.write("	          <div class=\"col-md-6\">\r\n");
      out.write("	            <div class=\"white-box\">\r\n");
      out.write("	              <div class=\"mb-5\">\r\n");
      out.write("	              <span style=\"display: flex; align-items: center;\">\r\n");
      out.write("	              <img class=\"profile\" src=\"img/blueheart.gif\" style=\"width: 60px; height: 60px;\">   \r\n");
      out.write("	                <h3 style=\"margin-left: 10px; margin-top: 0; margin-bottom: 0\">Followings</h3>\r\n");
      out.write("	                </span>\r\n");
      out.write("	                <br>\r\n");
      out.write("	                ");

		             	//Blob 땜에 만든 followBlobDAO도 가져오기
		                FollowBlob_DAO fbDAO = new FollowBlob_DAO();
		                List<Follow_list_VO> followlists = fbDAO.getAllFollowings(id);
	               
	                	for(Follow_list_VO f : followlists) {
	            		
      out.write("\r\n");
      out.write("			                <div style=\"display: inline-block; margin: 10px;\">\r\n");
      out.write("			                	");

			                		if(f.getProfile_img()==null){
			                	
      out.write("\r\n");
      out.write("			                			<img class=\"profile\" src=\"img/알계.jpg\" style=\"width: 200px; height: 200px;\">\r\n");
      out.write("			                	");

			                		} else {
			                	
      out.write("\r\n");
      out.write("					                    <img class=\"profile\" src=\"");
      out.print( f.getProfile_img() );
      out.write("\" style=\"width: 200px; height: 200px;\">\r\n");
      out.write("					            ");

			                		}
					            
      out.write("\r\n");
      out.write("					            <div><p><strong>");
      out.print( f.getUser_nickname() );
      out.write("</strong></p></div>\r\n");
      out.write("					            <div><p><strong>");
      out.print( f.getFollowing_id() );
      out.write("</strong></p></div>\r\n");
      out.write("			                </div>\r\n");
      out.write("	            		");

	                	}//for(Follow_list_VO f : followlists)
	            	
      out.write("\r\n");
      out.write("	              						</div>\r\n");
      out.write("	            					</div>\r\n");
      out.write("	          					</div>\r\n");
      out.write("	\r\n");
      out.write("	                		</article>\r\n");
      out.write("	           			</div>\r\n");
      out.write("	            \r\n");
      out.write("	        		</section>\r\n");
      out.write("	  \r\n");
      out.write("	        	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	          </div><!-- div:container -->\r\n");
      out.write("	          ");

					}//else
	          
      out.write("\r\n");
      out.write("	          \r\n");
      out.write("          <script>\r\n");
      out.write("          	//검색버튼 누르면 검색 창으로 이동 (기본 음악검색)\r\n");
      out.write("			document.getElementById(\"gotoSearchButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"music_search.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//마이페이지 버튼 누르면 이동\r\n");
      out.write("			document.getElementById(\"gotoMyPageButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"MyPage.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//마이플레이리스트 버튼\r\n");
      out.write("			document.getElementById(\"gotoMyPlaylistButton\").addEventListener(\"click\",()=>{\r\n");
      out.write("				window.location.href = \"MyPlaylist.jsp\";\r\n");
      out.write("			});\r\n");
      out.write("          </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
