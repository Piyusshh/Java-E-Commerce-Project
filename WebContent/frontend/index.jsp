<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Evergreen Books - Online Book Store</title>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	
	<div class="center">
		<br/><br/>
		
		<div>
			<h2>New Books:</h2>
			<c:forEach items="${listNewBooks}" var="book">
				<div class="book">
					<div>
						<a href="view_book?id=${book.bookId}">
							<img class="small_book" src="data:image/jpg;base64,${book.base64Image}" />
						</a>
					</div>
					<div>
						<a href="view_book?id=${book.bookId}">
							<b>${book.title}</b>
						</a>
					</div>
					<div>Rating *****</div>
					<div><i>by ${book.author}</i></div>
					<div><b>Rs. ${book.price}</b></div>
				</div>
			</c:forEach>
		</div>
		
		<div class="next_row">
			<h2>Best-Selling Books:</h2>
		</div>
		<div class="next_row">
		<h2>Most-favoured Books:</h2>
		</div>
		<br/><br/>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>