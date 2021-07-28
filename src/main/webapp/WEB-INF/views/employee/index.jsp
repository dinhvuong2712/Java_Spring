<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<p>
    <a class="btn btn-sm btn-success" href="/employee/add">Them nhan vien</a>
</p>

<div class="dataTable-wrapper shadow-sm p-3 mb-5 bg-white rounded">
    <div class="dataTable-container">
        <table id="employee-all" class="table table-sm table-hover table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Address</th>
                <th>PhoneNumber</th>
                <th>Birth</th>
                <th>Email</th>
                <th colspan="3" class="text-center">Control</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>

<script src="<c:url value="/resources/js/employee/index.js"/>"></script>
