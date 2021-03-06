<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>CJC Packers & Movers</title>
<meta name="description" content="ROYALENFIELD SERVICES">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="apple-touch-icon" href="apple-icon.png">
<link rel="shortcut icon" href="favicon.ico">
<script src="/Resources/js/jquery.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/normalize.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/components-md.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/datatables.bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/flag-icon.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/cs-skin-elastic.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/Resources/DashbordResources/scss/style.css">
<link
	href="${pageContext.request.contextPath}/Resources/DashbordResources/css/lib/vector-map/jqvmap.min.css"
	rel="stylesheet">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href="${pageContext.request.contextPath}/Resources/css/customDemo.css"
	rel='stylesheet' type='text/css'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="Resources/js/login.js"></script>
</head>
<body>
	<aside id="left-panel" class="left-panel" style="background: #34588a;">
		<nav class=" customewidth navbar navbar-expand-sm navbar-default"
			style="background: #34588a;">
			<div class="navbar-header">
				<a class="navbar-brand" href="./">ADMIN</a> <a
					class="navbar-brand hidden" href="./"><img
					src="${pageContext.request.contextPath}/Resources/DashbordResources/images/logo2.png"
					alt="Logo"></a>
			</div>
			<div id="main-menu" class="main-menu collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="home.jsp"> <i
							class="menu-icon fa fa-dashboard"></i>Dashboard
					</a></li>

					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false" onclick="addService()">
							<i class="menu-icon fa fa-th"></i>Services
					</a></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>Employees
					</a></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>Vehicles
					</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</aside>
	<!-- /#left-panel -->

	<!-- Left Panel -->

	<!-- Right Panel -->

	<div id="right-panel" class="right-panel">
		<%@ include file="adminHeader.jsp"%>
		<form action="addService">
			<div class="container">
				<h1>Add Service</h1>
				<p>Please fill in this form to create an Service.</p>
				<hr>
				<label for="email"><b>Title</b></label> <input type="text"
					placeholder="Enter Title" name="email" required> <label
					for="psw"><b>Description</b></label> <input type="password"
					placeholder="Enter Description" name="psw" required>
				<hr>
				<button type="submit" class="registerbtn">Save Service</button>
			</div>
		</form>
		<!-- /#right-panel -->

		<!-- Right Panel -->
	</div>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/vendor/jquery-2.1.4.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/plugins.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/main.js"></script>


	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/chart-js/Chart.bundle.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/dashboard.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/widgets.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/vector-map/jquery.vmap.js"></script>
	<!-- END EXAMPLE TABLE PORTLET-->
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/vector-map/jquery.vmap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/vector-map/jquery.vmap.sampledata.js"></script>
	<script
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/vector-map/country/jquery.vmap.world.js"></script>
	<script>
		(function($) {
			"use strict";

			jQuery('#vmap').vectorMap({
				map : 'world_en',
				backgroundColor : null,
				color : '#ffffff',
				hoverOpacity : 0.7,
				selectedColor : '#1de9b6',
				enableZoom : true,
				showTooltip : true,
				values : sample_data,
				scaleColors : [ '#1de9b6', '#03a9f5' ],
				normalizeFunction : 'polynomial'
			});
		})(jQuery);
	</script>
</body>
</html>