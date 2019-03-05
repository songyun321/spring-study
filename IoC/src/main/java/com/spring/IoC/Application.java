package com.spring.quickstart;

import com.sun.org.apache.xml.internal.serialize.Printer;
import com.sun.source.tree.NewClassTree;

public class Application {
    public static void main(String[] args){
        @SuppressWarnings("resource")
                ApplicationContext context = NewClassPathXmlApplicationContext
                ("spring.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.ptintMessage();
    }
}
