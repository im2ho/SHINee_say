<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SHINee Music</title>
        <link rel="stylesheet" href="./main.css">
    </head>
    <body>
        <button id="popupButton">Log-in</button>
        <!--  
            //Log-in 버튼 클릭 시 로그인 할 수 있는 팝업창 생성
            document.getElementById("popupButton").addEventListener("click",()=>{
                const popupWindow = window.open('','','width=400, height=400');
                const popupDocument = popupWindow.document;

                //로그인 팝업 창 구현
                popupDocument.write('<h2>Log in</h2>');
                popupDocument.write('<input type="text" placeholder="ID를 입력하세요" id="input-id"><br>');
                popupDocument.write('<input type="text" placeholder="비밀번호를 입력하세요" id="input-password"><br>');
                popupDocument.write('<button id="loginButton">로그인</button>');
            })

            //로그인 버튼 클릭하면 유저 정보 조회
            popupDocument.getElementById("loginButton").addEventListener("click",()=>{
                
            })
        -->
    </body>
</html>