package cn.wzl.sbstudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

/**
 * Created by 99410 on 2018/11/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NormalTest {
    @Test
    public void stringUtilsTest(){
        boolean bol = StringUtils.isEmpty(" ".trim());
        System.out.println(bol);
        boolean boll = StringUtils.isEmpty(" ");
        System.out.println(boll);
    }

}
