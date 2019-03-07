package com.spring.IoC;

public class Application {
    public static void main(String[] args){
        @SuppressWarnings("resource")
                ApplicationContext context = NewClassPathXmlApplicationContext
                ("spring.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.ptintMessage();
    }
}
