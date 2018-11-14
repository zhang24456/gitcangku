<html>
<head>
    <title>书籍列表</title>
</head>
<body>
  [<a href="${request.contextPath}/con/add2">添加</a>]	
<table border="1px" align="center">
    	<tr>
	    	<td>书籍id</td>
	    	<td>书籍名称</td>
	    	<td>价格</td>
	    	<td>作者</td>
	    	<td>操作</td>
    	</tr>
    	<#if data ??>
	    <#list data as shu>
	    	<tr>
		    	<td>${shu.bookid}</td>
		    	<td>${shu.bookname}</td>
		    	<td>${shu.price}</td>
		    	<td>${shu.author}</td>
		    	<td>
		    [<a href="${request.contextPath}/con/querybook2/${shu.bookid}">修改</a>] -
            [<a href="${request.contextPath}/con/deletebook/${shu.bookid}">删除</a>]		
		    	</td>
	    	</tr>
	    </#list>
	 </#if>     
    </table>
</body>

 






</html>
