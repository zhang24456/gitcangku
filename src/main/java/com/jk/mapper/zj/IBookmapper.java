/** 
 * <pre>��Ŀ����:spring-boot2 
 * �ļ�����:IBookmapper.java 
 * ����:com.jk.mapper.zj 
 * ��������:2018��11��12������3:50:52 
 * Copyright (c) 2018, yangzhichao150@126.com All Rights Reserved.</pre> 
 */  
package com.jk.mapper.zj;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jk.model.Book;

/** 
 * <pre>��Ŀ���ƣ�spring-boot2    
 * �����ƣ�IBookmapper    
 * ��������    
 * �����ˣ��Ž�  2445635335@qq.com    
 * ����ʱ�䣺2018��11��12�� ����3:50:52    
 * �޸��ˣ��Ž�  2445635335@qq.com     
 * �޸�ʱ�䣺2018��11��12�� ����3:50:52    
 * �޸ı�ע��       
 * @version </pre>    
 */
public interface IBookmapper {

	/** <pre>querybook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����4:49:21    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����4:49:21    
	 * �޸ı�ע�� 
	 * @return</pre>    
	 */
	@Select(" select   *   from    b_book ")
	List<Book> querybook();

	/** <pre>addbook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����4:54:51    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����4:54:51    
	 * �޸ı�ע�� 
	 * @param book</pre>    
	 */
   @Insert("insert  into  b_book  values (UUID(),#{bookname},#{price},#{author})       ")	
	void addbook(Book book);

	/** <pre>deletebook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����5:11:26    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����5:11:26    
	 * �޸ı�ע�� 
	 * @param id</pre>    
	 */
   
   @Delete("delete from  b_book  where   bookid=#{id} ")
	void deletebook(@Param("id")String id);

	/** <pre>querybook2(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����5:20:50    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����5:20:50    
	 * �޸ı�ע�� 
	 * @param id2
	 * @return</pre>    
	 */
   @Select("select   *   from    b_book   where    bookid=#{id2}")    
	Book querybook2(@Param("id2")String id2);

	/** <pre>updatebook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����6:37:17    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����6:37:17    
	 * �޸ı�ע�� </pre>    
	 * @param book 
	 */
   @Update(" update   b_book    set "
   		+ "bookname=#{book.bookname}"
   		+ "price=#{book.price}"
   		+"author=#{book.author}"
		+"where bookid=#{book.bookid}"   )
	void updatebook(@Param("book")Book book);

   	
	
}
