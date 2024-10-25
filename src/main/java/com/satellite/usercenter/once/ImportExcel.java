package com.satellite.usercenter.once;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.util.List;

/**
 * 导入 Excel
 *
 * @author satellite
 */
public class ImportExcel {
    /**
     * 读取数据
     */
    public static void main(String[] args) {



        // 写法1：JDK8+ ,不用额外写一个DemoDataListener
        // since: 3.0.0-beta1
        String fileName = "D:\\documents\\JavaProjects\\biwujiaoyu\\user-center\\src\\main\\resources\\testExcel.xlsx";

//        readByListener(fileName);
        synchronousRead(fileName);
    }

    /**
     * 监听器
     * @param fileName
     */
    public static void readByListener(String fileName){
        EasyExcel.read(fileName, XingQiuTableUserInfo.class, new TableListener()).sheet().doRead();
    }

    /**
     * 同步读
     * @param fileName
     */
    public static void synchronousRead(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<XingQiuTableUserInfo> totalDataList =
                EasyExcel.read(fileName).head(XingQiuTableUserInfo.class).sheet().doReadSync();
        for (XingQiuTableUserInfo xingQiuTableUserInfo : totalDataList){
            System.out.println(xingQiuTableUserInfo);
        }
    }


}
