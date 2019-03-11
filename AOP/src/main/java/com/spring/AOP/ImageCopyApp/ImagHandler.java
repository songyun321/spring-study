package com.spring.AOP.ImageCopyApp;

import java.util.logging.Logger;

public class ImagHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);
//    切点函数，必须为空
    @Pointcut("execution(* com.spring.image Copy.copyTmage())")
    public  void handleImage(){

    }
    @Before(value = "handleImage()")
    public void  pressTextOnImage(){
        logger.info
    }
}
