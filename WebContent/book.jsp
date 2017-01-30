<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>
</head>
<body>
<div>
<form action="BookController" method="post">

    <label for="AName">Author Name</label>
    <input type="text" id="fname" name="authorname">

    <label for="Bname">Book Name</label>
    <input type="text" id="lname" name="bookname">

    <label for="topic">Topic</label>
    <select id="tpic" name="topic">
      <option value="fiction">FICTION</option>
      <option value="Comedy">COMEDY</option>
      <option value="horror">HORROR</option>
      <option value="classic">CLASSIC</option>
      <option value="Literature">LITERATURE</option>
    </select>
  
    <input type="submit" value="Submit">
  </form>




</div>

</body>
</html>