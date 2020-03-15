package com.zhaoya.cms.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaoya.cms.domain.City;
import com.zhaoya.cms.domain.Ill;
import com.zhaoya.cms.service.IllService;
import com.zhaoya.common.untils.StreamUtil;
import com.zhaoya.common.untils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class IllServiceImplTest {
	
	@Resource
	IllService illService;
	
	@Test
	public void testInsert2() throws IOException  {
		//调用工具导入数据
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data3.txt"));
	   
		for (String str : list) {
	    	String[] s = str.split("\\|");
	    	System.out.println(s[0]);
		}
	}
	@Test
	public void testInsert() throws IOException {
		//调用工具导入数据
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data2.txt"));
	   
		for (String str : list) {
	    	String[] s = str.split("\\,");
	    	Ill ill = new Ill();
	        String cityname=s[0];
	           //根据城市的名称，查询城市的id
	        City city = illService.selectByCityName(cityname);
	        //城市的id
	        ill.setCityId(city.getId());//封装市
	        ill.setPid(city.getPid());//封装省
	    	  //确诊人数
	    	 if(StringUtil.isNumber(s[1])) { //判断是否是是数字,如果是则转为int
	    	   ill.setNumber1(Integer.parseInt(s[1]));
	    	 }else {
	    		  ill.setNumber1(0);
	    	 }
	    	  //死亡人数
	    	 if(StringUtil.isNumber(s[2])) { //判断是否是是数字,如果是则转为int
	    	   ill.setNumber2(Integer.parseInt(s[2]));
	    	 }else {
	    		  ill.setNumber2(0);
	    	 }
	    	  //治愈人数
	    	 if(StringUtil.isNumber(s[3])) { //判断是否是是数字,如果是则转为int
	    	   ill.setNumber3(Integer.parseInt(s[3]));
	    	 }else {
	    		 ill.setNumber3(0);
	    	 }
		//System.out.println(str);
			illService.insert(ill);
		}
		
		
		
		//
		
	}

}
