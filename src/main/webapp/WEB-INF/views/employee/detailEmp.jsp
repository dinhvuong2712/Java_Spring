<%--
  Created by IntelliJ IDEA.
  User: Dang Dinh Vuong
  Date: 7/21/2021
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="mt-5 mb-5">

    <div class="row">
        <div class="col-md-6 mb-4 mb-md-0">

            <div id="mdb-lightbox-ui"></div>

            <div class="mdb-lightbox">

                <div class="row product-gallery mx-1">

                    <div class="col-12 mb-0">
                        <figure class="view overlay rounded z-depth-1 main-img">
                            <a href="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15a.jpg"
                               data-size="710x823">
                                <img src="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/15a.jpg"
                                     class="img-fluid z-depth-1">
                            </a>
                        </figure>
                    </div>
                </div>

            </div>

        </div>
        <div class="col-md-6">
            <div class="table-responsive">
                <table class="table table-sm table-borderless mb-0" id="dataTable">
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value="/resources/js/employee/detail.js"/>"></script>
