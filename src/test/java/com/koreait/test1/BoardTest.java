package com.koreait.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.koreait.test1.config.BeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {BeanConfig.class})
public class BoardTest {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Test
	public void insertTest() {
		// 테스트 코드 작성
	}
	@Test
	public void selectTest() {
		// 테스트 코드 작성
	}

}
