<%--
  Created by IntelliJ IDEA.
  User: Dang Dinh Vuong
  Date: 7/21/2021
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row justify-content-center">
    <div class="col-lg-10">
        <div class="card shadow-lg border-0 rounded-lg mt-5">
            <div class="card-header"><h3 class="text-center font-weight-light my-4">Create Account</h3></div>
            <div class="card-body">
                <form id="target">
                    <div class="form-group">
                        <label class="small mb-1" for="Name">Full Name</label>
                        <input class="form-control py-2" name="Name" value="${item.name}" id="Name" type="text"
                               aria-describedby="nameHelp" placeholder="Enter full name">
                    </div>
                    <div class="form-group row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="small mb-1" for="Birth">Birth</label>
                                <input class="form-control py-2" name="Birth" value="${item.birth}"
                                       id="Birth" type="date" aria-describedby="dateHelp" placeholder="dd/MM/yyyy">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="form-check-label">
                                    Gender
                                </label>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="Gender" data-gender="${item.gender}" value="true"
                                           id="flexRadioDefault1" checked>
                                    <label class="form-check-label" for="flexRadioDefault1">
                                        Male
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="Gender" value="false"
                                           id="flexRadioDefault2">
                                    <label class="form-check-label" for="flexRadioDefault2">
                                        Female
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="small mb-1" for="Address">Address</label>
                        <input class="form-control py-2" name="Address" value="${item.address}" id="Address" type="text"
                               aria-describedby="emailHelp" placeholder="Enter your address">
                    </div>
                    <div class="form-group">
                        <label class="small mb-1" for="PhoneNumber">Phone Number</label>
                        <input class="form-control py-2" name="PhoneNumber" value="${item.phoneNumber}" id="PhoneNumber"
                               type="text" aria-describedby="emailHelp" placeholder="Enter your phone">
                    </div>
                    <div class="form-group">
                        <label class="small mb-1" for="Email">Email</label>
                        <input class="form-control py-2" name="Email" value="${item.email}" id="Email" type="email"
                               aria-describedby="emailHelp" placeholder="Enter email address">
                    </div>
                    <div class="form-group mt-4 mb-0">
                        <button type="button" id="updateConfirm" class="btn btn-primary btn-block">Create Account</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value="/resources/js/employee/editConfirm.js"/>"></script>

