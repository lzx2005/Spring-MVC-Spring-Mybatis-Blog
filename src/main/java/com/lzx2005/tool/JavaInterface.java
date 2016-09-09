package com.lzx2005.tool;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by JohnPC on 2016/9/9.
 */
public interface JavaInterface {
    /**
     * 根据文件名获取多个文件
     * @param fileNames 文件名列表
     * @return
     * @throws IOException
     * @throws ArrayIndexOutOfBoundsException
     */
    public FileOutputStream[] download(String[] fileNames) throws IOException,ArrayIndexOutOfBoundsException;

    /**
     * 返回值可以分为part1,part2,part3...
     * @param partNum 分段大小，例如：3,就是分成part1,part2,part3
     * @param fileName 文件名
     * @return 返回的Map的key为part1,part2,part3...value为文件输出流
     * @throws IOException
     * @throws OutOfMemoryError
     */
    public HashMap<String,FileOutputStream> download(int partNum, String fileName) throws IOException,OutOfMemoryError;

    /**
     * 指定字节对某文件进行读取
     * @param bytes 指定字节
     * @param fileName 文件名
     * @return 文件输出流
     * @throws IOException
     * @throws OutOfMemoryError
     */
    public FileOutputStream download(byte[] bytes,String fileName) throws IOException,OutOfMemoryError;
}
