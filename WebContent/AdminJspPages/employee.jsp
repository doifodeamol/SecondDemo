<%@page import="com.app.extremity.model.Address"%>
<%@page import="com.app.extremity.model.Employee"%>
<%@page import="com.app.extremity.model.Vehicle"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>CJC Packers & Movers</title>
<meta name="description" content="PACKERSANDMOVERS">
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
					<li class="active"><a href="index.html"> <i
							class="menu-icon fa fa-dashboard"></i>Dashboard
					</a></li>

					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>Services
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
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>Assets
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
		<div class="Table col-md-12">
			<div class="Title">
				<b style="background-color: :#9933ff">Employee List</b> <input
					style="margin-right: 25px; float: right;" type="button"
					value="Add Emloyee">
			</div>
			<div class="Heading">
				<div class="Cell">
					<p class="p">Id</p>
				</div>
				<div class="Cell">
					<p class="p">Name</p>
				</div>
				<div class="Cell">
					<p class="p">AadharNo</p>
				</div>
				<div class="Cell">
					<p class="p">PanCardNo</p>
				</div>
				<div class="Cell">
					<p class="p">DateOfJoining</p>
				</div>
				<div class="Cell">
					<p class="p">Role</p>
				</div>
				<div class="Cell">
					<p class="p">MobileNo</p>
				</div>
				<div class="Cell">
					<p class="p">Address</p>
				</div>
				<div class="Cell">
					<p class="p">Email</p>
				</div>
				<div class="Cell">
					<p class="p">State</p>
				</div>
			</div>
			<%
				List<Employee> employeeList = (List<Employee>) request.getAttribute("data");
			%>
			<%
				for (Employee employee : employeeList) {
			%>
			<div class="Row" style="background-color: white;">
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeId()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeName()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeAdharNo()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeePanCard()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeDateOfJoining()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeRole().getRoleName()%></b>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeMobileNo()%></b>
				</div>
				<div class="Cell customeWidth" >
					<%
					Address addr = employee.getEmployeeAddrss();	
					%>
					 <b style="color: #1E90FF"><%=addr.getFlatNo()%></b>
					 <b style="color: #1E90FF"><%=addr.getArea()%></b>
					 <b style="color: #1E90FF"><%=addr.getLandMark()%></b>
					 <b style="color: #1E90FF"><%=addr.getCity()%></b>
					 <b style="color: #1E90FF"><%=addr.getPinCode()%></b>
					<br><br>
				</div>
				<div class="Cell">
					<b style="color: #a27311"><%=employee.getEmployeeEmail()%></b>
				</div>
				<div class="Cell">
					<input type="button" value="Edit"> <br> <input
						type="button" value="Delete">
				</div>
			</div>
			<%}%>
		</div>
	</div>
	<!-- /#right-panel -->

	<!-- Right Panel -->

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
		src="${pageContext.request.contextPath}/Resources/DashbordResources/js/lib/vector-map/country/jquery.vmap.world.js">
	</script>
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
				scaleColors : [ '#1de9b6', '#03a9f5'],
				normalizeFunction : 'polynomial'
			});
		})(jQuery);
	</script>

</body>
</html>
