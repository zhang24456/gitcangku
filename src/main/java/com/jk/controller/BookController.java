/** 
 * <pre>��Ŀ����:spring-boot2 
 * �ļ�����:BookController.java 
 * ����:com.jk.controller 
 * ��������:2018��11��12������3:42:26 
 * Copyright (c) 2018, yangzhichao150@126.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jk.model.Book;
import com.jk.service.IBookservice;

/** 
 * <pre>��Ŀ���ƣ�spring-boot2           
 * @version </pre>    
 */
@Controller
@RequestMapping("/con")
public class BookController {

    @Autowired
	    private MongoTemplate mongoTemplate;
  		
	@Autowired
	    private    IBookservice     bookservice;
		
	
@RequestMapping("querybook")	
@ResponseBody	
	public   ModelAndView  querybook(){	
	List<Book>   list=bookservice.querybook();
	ModelAndView  mav=new  ModelAndView();
	//mongodb插入集合
	mongoTemplate.insert(list,Book.class);  
	
	mav.addObject("data", list);
	mav.setViewName("view");	
	return    mav;
   }  
//添加	
@RequestMapping(value="/addbook")
@ResponseBody
    public  ModelAndView   addbook(Book    book){			
	   bookservice.addbook(book);	   
/*	 //将查询的数据添加到mongodb中
		 mongoTemplate.save(book);*/		 
   ModelAndView   mod=new   ModelAndView("redirect:/con/querybook");   
	   return   mod; 
    } 

//添加跳转到添加页面
@RequestMapping(value="/add2")
@ResponseBody
  public   ModelAndView   add2(){	
	ModelAndView  mod=new  ModelAndView();
	  mod.setViewName("tianjia");
	    return mod;	  
   }
//删除
@RequestMapping(value="/deletebook/{id}")
@ResponseBody
   public   ModelAndView     deletebook(@PathVariable String  id){
	bookservice.deletebook(id);
	
   //根据id将先查询mongodb中的数据删除
	Query query = Query.query(Criteria.where("bookid").is(id));
	  mongoTemplate.remove(query,"book");
	  
	ModelAndView   mod =  new  ModelAndView("redirect:/con/querybook");
	    return mod;	
     }

//修改用id查询
 @RequestMapping(value="/querybook2/{id2}")
 @ResponseBody
   public   ModelAndView   querybook2(@PathVariable String   id2){
	 Book   boo=  bookservice.querybook2(id2);
	 ModelAndView   mav  = new   ModelAndView(); 
	    mav.addObject("b", boo);
	    mav.setViewName("xiugai");
	   return mav;	       
     }
 
//*********************************************
 //redis添加跳页面   addredis  
@RequestMapping(value="/addto")
@ResponseBody
 public   ModelAndView   addto(){	
	ModelAndView  mod=new  ModelAndView();
	  mod.setViewName("redistianjia2");
	    return mod;	  
    }
 
 //redis添加数据库
@RequestMapping("addredis")
@ResponseBody
public   void    addredis(Book    book){
	 book.setBookid(UUID.randomUUID().toString());     
	 bookservice.addredis(book.getRedMap());			
}
 




 
	
}
