<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="../includes/header.jsp"%>
<div class="row-content">
    <div class="card">
        <div class="card-header">
            Board 상세보기
        </div>
        <div class="card-body">
            <h5 class="card-title">Board 상세보기 페이지</h5>
            <div class="input-group mb-3">
                <label class="input-grout-text">Bno</label>
                <input class="form-control" type="text" name="tno" value="${boardDTO.bno}" readonly>
            </div>
            <div class="input-group mb-3">
                <label class="input-grout-text">Title</label>
                <input class="form-control" type="text" name="title" value="${boardDTO.title}" readonly>
            </div>
            <div class="input-group mb-3">
                <label class="input-group-text">Content</label>
                <textarea class="form-control" name="content" rows="5" readonly>${boardDTO.content}</textarea>
            </div>
            <div class="input-group mb-3">
                <label class="input-grout-text">Writer</label>
                <input class="form-control" type="text" name="writer" value="${boardDTO.writer}" readonly>
            </div>

            <div class="my-4">
                <div class="float-end">
                    <button type="button" class="btn btn-primary">Modify</button>
                    <button type="button" class="btn btn-secondary">List</button>
                    <button type="button" class="btn btn-danger">Delete</button>
                </div>
            </div>
        </div>
        <script>
            document.querySelector(".btn-primary").addEventListener("click", function (e){
                self.location = "/board/modify?bno=${boardDTO.bno}"
            },false)

            <%--document.querySelector(".btn-secondary").addEventListener("click", function (e){--%>
            <%--    self.location = `/todo/list?${dto.tno}`--%>
            <%--},false)--%>

            <%--document.querySelector(".btn-secondary").addEventListener("click", function (e){--%>
            <%--    self.location = `/todo/list?${dto.tno}`--%>
            <%--},false)--%>
        </script>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>