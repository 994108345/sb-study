package cn.wzl.sbstudy;

import cn.wzl.sbstudy.dao.UserMapper;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbStudyApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
		System.out.println(JSONObject.toJSONString(null));
	}

}
