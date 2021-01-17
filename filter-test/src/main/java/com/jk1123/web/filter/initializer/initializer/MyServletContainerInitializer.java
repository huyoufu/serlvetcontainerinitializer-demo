package com.jk1123.web.filter.initializer.initializer;

import com.jk1123.web.filter.initializer.ServletContainerInitializerFilter;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * <p>
 *     演示创建{@link javax.servlet.ServletContainerInitializer}
 * </p>
 *
 */

//HandlesTypes 关心的类
//注意这里不能直接填写 某个类
//比如:希望处理com.jk1123.web.filter.initializer.ServletContainerInitializerFilter  不能填写这个类 要填写它父类或者父接口
@HandlesTypes(Filter.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println(1);
        //获取关心类的集合
        if (!set.isEmpty()){
            for (Class<?> clazz : set) {

                try {
                    if (!clazz.equals(ServletContainerInitializerFilter.class)){
                        continue;
                    }
                    Filter filter = (Filter) clazz.newInstance();


                    FilterRegistration.Dynamic filterRegistration = servletContext.addFilter(clazz.getSimpleName(), filter);
                    //设置拦截路径
                    filterRegistration.addMappingForUrlPatterns(null,true,"/*");


                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }

    }
}
