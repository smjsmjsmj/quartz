<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
	
		<span class="layui-breadcrumb">
		  <a href="">首页</a>
		  <a><cite>Job列表</cite></a>
		</span>
		
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
	         	<button onclick="window.location.href='<%=bath%>/add'" class="layui-btn layui-btn-normal" style="float:right;margin-bottom: 10px;">新增</button>
				<table class="layui-table">
					<colgroup>
						<col width="150">
						<col width="200">
						<col>
					</colgroup>
					<thead>
						<tr>
							<th>Job组</th>
							<th>Job名称</th>
							<th>Job描述</th>
							<th>Job Class</th>
							<th>Trigger组</th>
							<th>Trigger名称</th>
							<th>Trigger表达式</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>贤心</td>
							<td>2016-11-29</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
							<td>人生就像是一场修行</td>
						</tr>
					</tbody>
				</table>

			</div>
		</div>


	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
	<script>
		$(function() {

		});
	</script>
	
	
	<%@ include file="footer.jsp" %>
