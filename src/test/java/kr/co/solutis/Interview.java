package kr.co.solutis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class Interview {

    @Test
    public void test(){
        assertThat(getReverseValue(true), is(false));
    }

    /**
     * 파라미터 p1의 반대값을 리턴하도록 null을 변경하여 주세요.
     * @param p1
     * @return p1의 반대값
     */
    public boolean getReverseValue(boolean p1){
        return false;
    }
}
