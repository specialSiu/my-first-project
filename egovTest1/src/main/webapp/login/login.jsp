<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="/egovTest1/css/egovframework/login.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap"
    />
 <title>로그인</title>
</head>
 <body>
    <div class="container">
      <h2>Login</h2>
      <form method="post" action="/egovTest1/login/login_proc.jsp" id="login-form">
        <div class="login_input">
          <input type="text" name="id" placeholder="ID" />
          <input type="password" name="pwd" placeholder="PASSWORD" />
        </div>
        <div class="submit_button">
          <input type="submit" value="Login" />
        </div>
      </form>
    </div>
  </body>
</html>