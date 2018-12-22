<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
<form class="layui-form" style="margin-top: 30px;width:50%;" action="">

 <div class="layui-form-item">
    <label class="layui-form-label">Job组</label>
    <div class="layui-input-block">
      <input type="text" name="JobGroup" required  lay-verify="required" placeholder="请输入Job组名称" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">Job名称</label>
    <div class="layui-input-block">
      <input type="text" name="JobName" required  lay-verify="required" placeholder="请输入Job名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">间隔时间</label>
    <div class="layui-input-block">
      <input type="text" name="RepeatInterval" required  lay-verify="required" placeholder="请输入间隔时间" autocomplete="off" class="layui-input">
    </div>
  </div>
  
 
  
  <div class="layui-form-item">
    <label class="layui-form-label">执行次数</label>
    <div class="layui-input-block">
      <input type="text" name="RepeatInterval" required  lay-verify="required" placeholder="请输入执行时间" autocomplete="off" class="layui-input">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">Job入口文件</label>
    <div class="layui-input-block">
      <input type="text" name="ClassPath" required  lay-verify="required" placeholder="请输入Job入口文件" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">Job入口函数</label>
    <div class="layui-input-block">
      <input type="text" name="MethodName" required  lay-verify="required" placeholder="请输入Job入口函数" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">启用</label>
    <div class="layui-input-block">
      <input type="checkbox" name="switch" lay-skin="switch">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
 
<script>

</script>


<%@ include file="footer.jsp" %>