import com.atguigu.spring.Calculator;
import com.atguigu.spring.CalculatorImpl;
import com.atguigu.spring.ProxyFactory;
import com.atguigu.spring.pojo;
import org.junit.Test;

public class TestProxy {

    /**
     * 动态代理有2中：
     * 1，JDK动态代理。要求必须有接口。最终生成的代理类和目标类实现相同的接口，
     * 是在com.sun.proxy包下，类名:com.sun.proxy.$Proxy4
     * 2.cglib动态代理。最终生成的代理类会继承目标类，并且和目标类在相同的包下。
     *
     * AOP底层是动态代理。
     */

    @Test
    public void testAdd(){
        ProxyFactory proxyFactory =new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();

        proxy.sub(1,2);
    }
}
