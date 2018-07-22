package io.github.wukn.demo.dubbo.filter;

import com.alibaba.dubbo.rpc.*;

public class TraceFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        // 前置拦截
        System.out.println("before invoke");
        RpcContext context = RpcContext.getContext();
        if (null != context) {
            boolean isConsumerSide = context.isConsumerSide(); // 是否是服务调用方
            System.out.println("is consumer side ? " + isConsumerSide);

            boolean isProviderSide = context.isProviderSide(); // 是否是服务提供方
            System.out.println("is provider side? " + isProviderSide);

            String host = context.getLocalHost(); // 获取Host地址
            System.out.println("local host: " + host);

            int port = context.getLocalPort(); // 获取Port
            System.out.println("local port: " + port);

            String serviceName = context.getUrl().getServiceInterface(); // 获取被调用的服务接口名称
            System.out.println("service name: " + serviceName);

            String methodName = context.getMethodName(); // 获取被调用的服务方法名称
            System.out.println("method name: " + methodName);
        }


        // 执行目标服务调用
        Result result = invoker.invoke(invocation);

        // 后置拦截
        System.out.println("after invoke");

        return result;
    }
}
