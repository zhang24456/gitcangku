/** 
 * <pre>��Ŀ����:spring-boot2 
 * �ļ�����:BookserviceImpl.java 
 * ����:com.jk.service 
 * ��������:2018��11��12������3:49:45 
 * Copyright (c) 2018, yangzhichao150@126.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jk.mapper.zj.IBookmapper;
import com.jk.model.Book;

import redis.clients.jedis.Jedis;



/** 
 * <pre>��Ŀ���ƣ�spring-boot2    
 * �����ƣ�BookserviceImpl    
 * ��������    
 * �����ˣ��Ž�  2445635335@qq.com    
 * ����ʱ�䣺2018��11��12�� ����3:49:45    
 * �޸��ˣ��Ž�  2445635335@qq.com     
 * �޸�ʱ�䣺2018��11��12�� ����3:49:45    
 * �޸ı�ע��       
 * @version </pre>    
 */
@Service
public class BookserviceImpl implements IBookservice {

	@Autowired
	private    IBookmapper      bookmapper;

/*	@Autowired
	private	ShardedJedisPool shardedJedisPool;
	*/
//查询
	@Override
	public List<Book> querybook() {	 		     	
    List<Book> list = bookmapper.querybook();			  		
		return list;				
	  }

//添加
	@Override
	public void addbook(Book book) {
		bookmapper.addbook(book);		
	}

//删除
	@Override
	public void deletebook(String id) {
		bookmapper.deletebook(id);
		
	}
//查询回显
	@Override
	public Book querybook2(String id2) {		
		return bookmapper.querybook2(id2);
	}

//修改
@Override
public void updatebook(Book book) {
	bookmapper.updatebook(book);	
  }

//redis的查询
public void addredis(HashMap<String, String> redMap) {
	//从集群中湖区一个对象
	 Jedis jedis = new Jedis("localhost");
	//ShardedJedis jedis= shardedJedisPool.getResource();
	jedis.auth("123456");
	//创建id序列  自增1
	//对存储在指定key的数值执行原子的加1操作。
    // 如果指定的key不存在，那么在执行incr操作之前，会先将它的值设定为0
	Long id = jedis.incr("newsSquce");
	 // System.out.println(id+"123213");
	//将自创id序列放到newsid中
	//由于redis并没有一个明确的类型来表示整型数据，所以这个操作是一个字符串操作
	redMap.put("bookid",id+" ");
	//将map赋值给news
	//hmset设置 key指定的哈希集中指定字段的值。该命令将重写所有在哈希集中存在的字段。
	jedis.hmset("book_"+id, redMap);
	//设置链表中的键值对
	 Long lpush = jedis.lpush("bookid_list",id.toString());	
   }

}	

