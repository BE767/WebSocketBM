<%-- 
    Document   : newjsp
    Created on : Nov 29, 2023, 10:53:38 PM
    Author     : Jorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESP Page</title>
    </head>
    <body>
        <h1>Another page whit Chat</h1>
        <input id="username_input" placeholder="Your username">
        <div id="output"></div>
        <input id="message_input" type="text">
        <script src="js/websocket.js"></script>
        <button onclick="send()">Send message</button> 
         <button  type="submit"  name="accion" id="accion" value="save" style="margin-top: 20%;";>Save</button>

    </body>
</html>
