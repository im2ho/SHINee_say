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
            //Log-in ��ư Ŭ�� �� �α��� �� �� �ִ� �˾�â ����
            document.getElementById("popupButton").addEventListener("click",()=>{
                const popupWindow = window.open('','','width=400, height=400');
                const popupDocument = popupWindow.document;

                //�α��� �˾� â ����
                popupDocument.write('<h2>Log in</h2>');
                popupDocument.write('<input type="text" placeholder="ID�� �Է��ϼ���" id="input-id"><br>');
                popupDocument.write('<input type="text" placeholder="��й�ȣ�� �Է��ϼ���" id="input-password"><br>');
                popupDocument.write('<button id="loginButton">�α���</button>');
            })

            //�α��� ��ư Ŭ���ϸ� ���� ���� ��ȸ
            popupDocument.getElementById("loginButton").addEventListener("click",()=>{
                
            })
        -->
    </body>
</html>