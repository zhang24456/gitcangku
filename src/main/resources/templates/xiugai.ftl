<html>
<head>
    <title>添加书籍</title>
</head>
<body>
    <form    action="${request.contextPath}/con/addbook"   method='post'>
  <center>	
   书籍名称:<input  type="text" name="bookname"  value="${b.bookname}"   ><br><br>
   书籍价格:<input  type="text"  name="price"    value="${b.price}" > <br><br>
          作者:<input  type="text"  name="author"   value="${b.author}" ><br><br>
    	
       <input type='submit' value='保存'/>
  </center>    	 
   	</form> 
    	     
    </table>
</body>

 






</html>
