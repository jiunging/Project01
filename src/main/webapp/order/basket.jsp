<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/basket.css?after">
</head>
<body>
	<div class="background">
		<div class="outerbox">
			<div class="wrapper">
				<div class="wrapper__header">
					<div class="header__title">장바구니</div>
				</div>
				<div class="wrapper__body">
					<div class="wrapper__table">
						<table class="table-bordered">
							<thead>
							    <tr>
							        <th>상품 명</th>
							        <th>가격</th>
							        <th>소계</th>
							    </tr>
						    </thead>
						    <tbody>
							    <tr>
							        <td>James</td>
							        <td>Matman</td>
							        <td>(713) 123-8965</td>
							    </tr>
							    <tr>
							        <td>Johnny</td>
							        <td>Smith</td>
							        <td>(713) 584-9614</td>
							    </tr>
							    <tr>
							        <td>Susan</td>
							        <td>Johnson</td>
							        <td>(713) 847-1124</td>
							    </tr>
							    <tr>
							        <td>Tracy</td>
							        <td>Richardson</td>
							        <td>(713) 245-4821</td>
							    </tr>
						    </tbody>
						</table>
					</div>
					<div class="footer__right__button">
						<input type="submit" value="결제하기" class="right__button">
						<input type="button" value="취소하기" class="right__button">
					</div>
				</div>
				<div class="wrapper__footer"></div>
			</div>
		</div>
	</div>
</body>
</body>
</html>