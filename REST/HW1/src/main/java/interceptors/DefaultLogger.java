package interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class DefaultLogger {
    @AroundInvoke
    public Object printLog(InvocationContext ctx) throws Exception{
        System.out.println("The following menthod has been invoked: " + ctx.getMethod().getName());
        return ctx.proceed();
    }
}
