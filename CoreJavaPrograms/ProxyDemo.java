import java.lang.reflect.*;

interface Hello { void say(); }
class HelloImpl implements Hello { public void say(){ System.out.println("HelloImpl"); } }

public class ProxyDemo {
    public static void main(String[] args) {
        Hello h = (Hello) Proxy.newProxyInstance(
            Hello.class.getClassLoader(),
            new Class[]{Hello.class},
            new InvocationHandler() {
                private final Hello impl = new HelloImpl();
                public Object invoke(Object proxy, Method method, Object[] margs) throws Throwable {
                    System.out.println("Before"); 
                    Object r = method.invoke(impl, margs); 
                    System.out.println("After"); 
                    return r; 
                }
            }
        );
        h.say();
    }
}
