package org.jeevan.usermgmt.global;

import  org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserMgmtInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { UserMgmtConfig.class };
    }
   
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
   
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
