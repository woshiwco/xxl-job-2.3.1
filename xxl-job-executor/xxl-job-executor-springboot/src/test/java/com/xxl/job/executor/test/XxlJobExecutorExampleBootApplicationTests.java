package com.xxl.job.executor.test;

import com.xxl.job.executor.dao.TUserMapper;
import com.xxl.job.executor.entity.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class XxlJobExecutorExampleBootApplicationTests {
	@Autowired
	private TUserMapper tUserMapper;
	@Test
	public void test() {
		TUser tUser = tUserMapper.selectByPrimaryKey(1L);
		System.out.println("tUser = " + tUser);
		System.out.println(11);
	}

}