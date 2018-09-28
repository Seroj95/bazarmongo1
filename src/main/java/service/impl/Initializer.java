package service.impl;

import confing.WebAppConfig;
import org.apache.catalina.security.SecurityConfig;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class Initializer {
    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        // регистрация конфигураций в Spring контексте
//        ctx.register(WebAppConfig.class);
//        ctx.register(SecurityConfig.class);
//        servletContext.addListener(new ContextLoaderListener(ctx));
//
//        ctx.setServletContext(servletContext);
//
//        Registration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
////        servlet. addMapping("/");
//        servlet.setLoadOnStartup(1);
    }
//}

