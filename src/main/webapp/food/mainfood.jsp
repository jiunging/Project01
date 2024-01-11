<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인메뉴</title>
<link rel="stylesheet" href="../css_food/food.css?after">
</head>
<body>
	<div class="wrapper">
		<div class="wrapper__body">
        	<form action="../order/order1.food" method="post" name="먹태구이" class="food_list">
   				<button style="border:none;">
        		<img src="../image/food1.png" class="food__img">
       			<div class="food__name">먹태구이</div>
        		<div class="food__cost">24,000원</div>
        		</button>
        	</form>
        	<form action="../order/order1.food" method="post" name="매운닭" class="food_list">
        		<button style="border:none;">
        		<img src="../image/food2.png" class="food__img">
        		<div class="food__name">매운닭</div>
        		<div class="food__cost">25,000원</div>
        		</button>
        	</form>
        	<form action="../order/order1.food" method="post" name="골뱅이무침" class="food_list">
        		<button style="border:none;">
        		<img src="../image/food3.png" class="food__img">
        		<div class="food__name">골뱅이무침</div>
        		<div class="food__cost">30,000원</div>
        		</button>
        	</form>
		</div>
		<div class="wrapper__body">
        	<form action="../order/order1.food" method="post" name="문어숙회" class="food_list">
        		<button style="border:none;">
        		<img src="../image/food4.png" class="food__img">
        		<div class="food__name">문어숙회</div>
        		<div class="food__cost">33,000원</div>
        		</button>
        	</form>
        	<form action="../order/order1.food" method="post" name="어묵탕" class="food_list">
        		<button style="border:none;">
        		<img src="../image/food5.png" class="food__img">
        		<div class="food__name">어묵탕</div>
        		<div class="food__cost">39,000원</div>
        		</button>
        	</form>
        	<form action="../order/order1.food" method="post" name="전복구이" class="food_list">
        		<button style="border:none;">
        		<img src="../image/food6.png" class="food__img">
        		<div class="food__name">전복구이</div>
        		<div class="food__cost">38,000원</div>
        		</button>
        	</form>
		</div>
	</div>
</body>
</html>