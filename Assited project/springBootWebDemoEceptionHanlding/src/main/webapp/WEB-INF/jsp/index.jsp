<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<html>
<head>
<title>File Upload</title>
</head>
<body>

	<form method="post" enctype="multipart/form-data" action="/upload">
		Upload file&nbsp; <input type="file" name="fileToUpload"
			id="fileToUpload"><br>
		<br> <input type="submit" value="Upload " name="submit">
	</form>
</body>
</html>
</body>
</html>