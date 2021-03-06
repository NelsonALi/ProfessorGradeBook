
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor Strongheim's Gradebook Actions</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
	integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
	crossorigin="anonymous"></script>
</head>
<body>
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="img/Chrysan.jpg" alt="Chrysanthemum"
					style="width: 140px; height: 140px;">
				<div class="carousel-caption">
					<caption>Lovely Chrysanthemum</caption>
				</div>
			</div>
			<div class="item">
				<img src="img/Desert.jpg" alt="Desert"
					style="width: 140px; height: 140px;">
				<div class="carousel-caption">
					<caption>Hot Desert</caption>
				</div>
			</div>
			<div class="item">
				<img src="img/Hydrangeas.jpg" alt="Hydrangeas"
					style="width: 140px; height: 140px;">
				<div class="carousel-caption">
					<caption>Beautiful Hydrangeas</caption>
				</div>
			</div>
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Professor Strongheim's Gradebook</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Actions <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li class="active"><a href="AddAssignment.jsp">add assignment(s)</a></li>
							<li><a href="AssignmentsByStudent.jsp">All assignments by a student</a></li>
							<li><a href="AssignmentsByType.jsp">All assignments of a particular type by anyone</a></li>
							<li><a href="AssignmentsByTypeByStudent.jsp">All assignments of a particular type by a particular student</a></li>
							<li><a href="AverageByStudent.html">The average for a student</a></li>
							<li><a href="AverageByStudentByType.jsp">The average for a student by assignment type</a></li>
							<li><a href="MaxMinOfType.jsp">The highest and lowest grade for a particular assignment type (highest quiz grade, lowest project grade, etc)</a></li>						</ul></li>
				</ul>
			</div>
			<br> <br> <br>
		</div>
	</nav>
	<div class="container">
		<form class="form-inline">
		<p>	  From the Actions drop down menu you can choose one of the actions: 
		<br>		*	add assignment(s)
		<br>	    *	All assignments by a student
		<br>	    *	All assignments of a particular type by anyone
		<br>	    *	All assignments of a particular type by a particular student
		<br>	    *	The average for a student
		<br>	    *	The average for a student by assignment type
		<br>	    *	The highest and lowest grade for a particular assignment type (highest quiz grade, lowest project grade, etc)
		</p>
		</form>
	</div>
</body>
</html>