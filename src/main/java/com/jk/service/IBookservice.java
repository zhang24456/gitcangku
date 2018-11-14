/** 
 * <pre>��Ŀ����:spring-boot2 
 * �ļ�����:IBookservice.java 
 * ����:com.jk.service 
 * ��������:2018��11��12������3:45:20 
 * Copyright (c) 2018, yangzhichao150@126.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;

import com.jk.model.Book;

/** 
 * <pre>��Ŀ���ƣ�spring-boot2    
 * �����ƣ�IBookservice    
 * ��������    
 * �����ˣ��Ž�  2445635335@qq.com    
 * ����ʱ�䣺2018��11��12�� ����3:45:20    
 * �޸��ˣ��Ž�  2445635335@qq.com     
 * �޸�ʱ�䣺2018��11��12�� ����3:45:20    
 * �޸ı�ע��       
 * @version </pre>    
 */
public interface IBookservice {

	/** <pre>querybook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����4:48:49    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����4:48:49    
	 * �޸ı�ע�� 
	 * @return</pre>    
	 */
	List<Book> querybook();

	/** <pre>addbook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����4:54:14    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����4:54:14    
	 * �޸ı�ע�� 
	 * @param book</pre>    
	 */
	void addbook(Book book);

	/** <pre>deletebook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����5:10:21    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����5:10:21    
	 * �޸ı�ע�� 
	 * @param id</pre>    
	 */
	void deletebook(String id);

	/** <pre>querybook2(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����5:18:56    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����5:18:56    
	 * �޸ı�ע�� 
	 * @param id2</pre>    
	 * @return 
	 */
	Book querybook2(String id2);

	/** <pre>updatebook(������һ�仰�����������������)   
	 * �����ˣ��Ž�  2445635335@qq.com        
	 * ����ʱ�䣺2018��11��12�� ����6:35:03    
	 * �޸��ˣ��Ž�  2445635335@qq.com     
	 * �޸�ʱ�䣺2018��11��12�� ����6:35:03    
	 * �޸ı�ע�� </pre>    
	 * @param book 
	 */
	void updatebook(Book book);

	/** <pre>addredis(这里用一句话描述这个方法的作用)   
	 * 创建人：张杰  2445635335@qq.com        
	 * 创建时间：2018年11月13日 下午10:07:01    
	 * 修改人：张杰  2445635335@qq.com     
	 * 修改时间：2018年11月13日 下午10:07:01    
	 * 修改备注： 
	 * @param redMap</pre>    
	 */
	void addredis(HashMap<String, String> redMap);

}
