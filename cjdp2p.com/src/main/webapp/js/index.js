$(function(){
	//加载未交
	$('#table').bootstrapTable({
		url : "user",
		method : "GET",
		striped : true, // 是否显示行间隔色
		height : "",// 行高
		showToggle : true,// 是否可以切换视图
		smartDisplay : true,// 设置为 true 是程序自动判断显示分页信息和 card 视图。
		cache : false, // 是否使用缓存，
		pagination : true, // 显示分页按钮图标
		paginationLoop : false,// 是否无限循环
		pageNumber : 1,// 设置首页
		pageSize : 5, // 每页的记录行数
		pageList : [5,10,15], // 可供选择的每页的行数
		showPaginationSwitch : true,// 隐藏或者显示分页
		paginationPreText : "上一页",
		paginationNextText : "下一页",
		buttonsAlign : "right", // 按钮对齐方式
		smartDisplay : true,// 设置为 true 是程序自动判断显示分页信息和 card 视图。
		searchOnEnterKey : false, // 设置自动加载
		search : true,// 设置搜索框
		strictSearch : false,// 设置模糊查询
		trimOnSearch : true,// 识别空格
		showRefresh : true,// 是否显示刷新按钮
		showColumns : false,// 是否显示字段下拉框
		minimumCountColumns : 3,// 隐藏最少数量
		sortable : true, // 是否启用排序
		sortOrder : "asc", // 排序方式
		columns : [ { // 渲染列
			field : 'id',
			title : '编号',
			align : 'center',
			valign : 'middle'
		}, {
			field : 'name',
			title : '姓名',
			align : 'center',
			valign : 'middle'
		},{
			field : 'id',
			title : '操作',
			align : 'center',
			valign : 'middle',
			formatter:function(value,row,index){
	            var e = '<button href="#" class="btn btn-warning" data-toggle="modal" data-target="#myModal2" id="edit" name='+value+'>编辑</button>';
	            var e2 = '&nbsp;&nbsp;<button class="btn btn-error" onclick="del('+value+')">删除</button>';
	            return e + e2;
	        }
		}]
	})
})

//删除用户
function del(obj){
	$.ajax({
		url:"user?id="+obj,
		type:"DELETE",
		success:function(result){
			if(result == "success"){
				alert("删除成功");
				//删除完成刷新表格
				$("#table").bootstrapTable('refresh');
			}
		}
	})
}

//增加用户
function add(){
	$.ajax({
		url:"user?name="+$("#name").val(),
		type:"POST",
		success:function(result){
			if(result == "success"){
				alert("增加成功");
				//关闭增加窗口
				var off = $("#off");
				off.click();
				//增加完成刷新表格
				$("#table").bootstrapTable('refresh');
				//增加成功消掉原输入信息
				$("#name").val("");
			}
		}
	})
}
//编辑用户
function save(){
	if($("#newName").val() == "" || $.trim($("#newName").val()) == ""){
		alert("姓名不能为空");
		return;
	}
	$.ajax({
		url:"user?id="+$("#edit").attr("name")+"&name="+$("#newName").val(),
		type:"PUT",
		success:function(result){
			if(result == "success"){
				alert("编辑成功");
				//关闭编辑窗口
				var off = $("#off2");
				off.click();
				//编辑完成刷新表格
				$("#table").bootstrapTable('refresh');
				//编辑成功消掉原输入信息
				$("#newName").val("");
			}
		}
	})
}