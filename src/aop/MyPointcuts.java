package aop;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* abs*(..))")
    public void allAddMethods(){}

}
