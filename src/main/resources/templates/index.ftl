<html>
<head>
    <title>AAAA</title>
    <script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .pageDetail {
            display: none;
        }

        .show {
            display: table-row;
        }
    </style>
</head>
<script>
	$(function (){
		alert(1);
	})

</script>
<body>
		H  I    ${name}  OK ?
		<table>
		  <#list list as emp>
                <tr>
                    <td>${emp.bookid}</td>
                    <td>${emp.bookname}</td>
                    <td>${emp.price}</td>
                    <td>${emp.author}</td>                    
                    <td style="text-align:center;">[<a
                            href="javascript:updateHrm(${emp.bookid})">修改</a>] -
                        [<a href="${request.contextPath}/countries/delete/${emp.hrm_employee_id}">删除</a>]
                    </td>
                </tr>
                </#list>
		</table>
</body>
<script >
function updateHrm(ss){
alert(ss);
}
</script>
</html>