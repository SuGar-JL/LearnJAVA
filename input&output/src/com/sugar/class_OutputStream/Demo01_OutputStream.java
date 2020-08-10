package com.sugar.class_OutputStream;

/**
 * @ClassName: Demo01_OutputStream
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 20:59
 */
public class Demo01_OutputStream {
    public static void main(String[] args) {
        /*
        * 字节输出流：OutputStream 抽象类字节输出类的顶级父类
        * 方法：
        *   public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。close方法，当完成流的操作时，必须调用此方法，释放系统资源。
            public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
            public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
            public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
            public abstract void write(int b) ：将指定的字节输出流
        * */
    }
}
