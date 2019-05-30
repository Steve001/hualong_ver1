<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<script type="text/javascript">
			document.write('<script src="../../js/fix.js?rd=?rd=' + Math.random() + '"><\/script>');
		</script>
		<script type="text/javascript">
			link(['../../css/index/tuijie.css']);
		</script>
	</head>

	<body>
		<header class="mui-bar mui-bar-nav">
			<a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
			<h1 class="mui-title">我要推介</h1>
			<!--
			<a class="mui-icon iconfont icon-searchIcon1 mui-pull-right" id="search"></a>
			-->
		</header>
		
		<div class="mui-content">
			<form class="mui-input-group">
				<div class="mui-input-row" action="TjTest">
					<label>客户姓名</label>
					<input type="text" class="mui-input-clear" placeholder="被推介人姓名">
				</div>
				<div class="mui-input-row">
					<label>联系人电话</label>
					<input type="number" class="mui-input-clear" placeholder="被推介人手机号码">
				</div>
				<div class="mui-input-row">
					<label>客户地址</label>
					<input type="text" class="mui-input-clear" placeholder="输入客户地址">
				</div>
				<div class="mui-input-row">
					<label>意向面积</label>
					<select name="">
						<option value="1">面积1</option>
						<option value="2">面积2</option>
						<option value="3">面积3</option>
					</select>
				</div>
				<!--
				<div class="mui-input-row">
					<label>跟办顾问</label>
					<select name="">
						<option value="1">顾问1</option>
						<option value="2">顾问2</option>
						<option value="3">顾问3</option>
					</select>
				</div>
				-->
				<div class="mui-input-row">
					<label>备注</label>
					<textarea name=""  placeholder="请输入备注信息"></textarea>
				</div>
				
				<div class="mui-button-row">
					<button type="submit" id="verify" class="mui-btn mui-btn-primary">确定</button>
					<!--id本来没有 -->
				</div>
				
			</form>
		</div>
		
		<!--
		<script type="text/javascript">
			mui.init();
			mui.plusReady(function(){
			document.getElementById('verify').addEventListener('tap',function(){
			mui.ajax({
				url      : 'http://localhost:8080/DormManage/login',
				type     : 'POST',
				success  : function(data){
					mui.toast('提交成功');
				},
				error    : function(xhr,type,errorThrown){
					mui.toast('提交失败');
				}
				});
				});
			});
		</script>
		-->
		
		<!--问题1，当前页面点击返回没有反应；2，如何点击确定然后弹出提示框后自动返回首页 -->
		
		
	</body>
	
	

</html>