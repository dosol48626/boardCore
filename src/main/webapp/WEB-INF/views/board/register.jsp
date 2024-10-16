<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 24. 10. 11.
  Time: 오후 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp"%>
<div class="row-content">
    <div class="card">
        <div class="card-header">
            Board Register Page
        </div>
        <div class="card-body">
            <h5 class="card-title">Board Register</h5>
            <form action="/board/register" method="post">
                <div class="input-group mb-3">
                    <label class="input-group-text">Title</label>
                    <input class="form-control" type="text" name="title" placeholder="Title">
                </div>
                <div class="input-group mb-3">
                    <label class="input-group-text">Content</label>
                    <textarea class="form-control" name="content" placeholder="Content" rows="5"></textarea>
                </div>
                <div class="input-group mb-3">
                    <label class="input-group-text">Writer</label>
                    <input class="form-control" type="text" name="Writer" placeholder="Writer">
                </div>
                <div class="my-4">
                    <div class="float-end">
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-secondary">Reset</button>
                    </div>
                </div>
            </form>