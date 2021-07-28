<%--
  Created by IntelliJ IDEA.
  User: Dang Dinh Vuong
  Date: 6/16/2021
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Dashboard - SB Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="<c:url value="/resources/css/styles.css"/> " rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body class="sb-nav-fixed">

<%-- Menu bar --%>

<jsp:include page="/common/admin/menu_bar.jsp"/>

<%-- End Menu bar --%>

<div id="layoutSidenav">
    <div id="layoutSidenav_nav">

        <%-- Sider bar --%>

        <jsp:include page="/common/admin/side_bar.jsp"/>

        <%-- End Sider bar --%>

    </div>
    <div id="layoutSidenav_content">

        <main>
            <div class="container-fruid px-4">

                <%--  Content  --%>

                <dec:body/>

                <%--  End Content  --%>

            </div>
        </main>
        <footer class="py-4 bg-light mt-auto">

            <%--  Footer  --%>

            <jsp:include page="/common/admin/footer.jsp"/>

            <%--  End Footer  --%>

        </footer>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="<c:url value="/resources/js/scripts.js"/>"></script>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>--%>
<%--<script src="<c:url value="/resources/assets/demo/chart-area-demo.js"/>"></script>--%>
<%--<script src="<c:url value="/resources/assets/demo/chart-bar-demo.js"/>"></script>--%>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="<c:url value="/resources/js/datatables-simple-demo.js"/>"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>

