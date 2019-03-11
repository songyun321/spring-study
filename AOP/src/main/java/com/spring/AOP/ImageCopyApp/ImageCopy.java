package com.spring.AOP.ImageCopyApp;

import java.io.*;
import java.util.InputMismatchException;
import java.util.logging.Logger;

public class ImageCopy {
    private static final Logger = LoggerFactory.getLogger(ImageCopy.class);

    public void copyImage() throws IOException{
        logger.info("开始将图片从D盘复制到E盘...");
        File scrfile = new File (pathname:"D:/bg1.jpg");
        File destFile = new File(Pathname:"E:/bg1.jpg");
        InputStream in = new FileInputStream(scrfile);
        OutputStream out = new FileOutputStream(destfile);
        byte[] bytes = new byte[(int) scrfile.length()];
        int len;

        while (( len= in.read(bytes)) != -1){
            out.write(bytes,off: 0,len);
        }
        in.close();
        out.close();
    }
}
