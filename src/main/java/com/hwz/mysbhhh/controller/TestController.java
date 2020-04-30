package com.hwz.mysbhhh.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.hwz.mysbhhh.enums.TestEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hwz
 * @date 2019/9/16
 */
@Controller
@Slf4j
public class TestController {
    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "success";
    }

    @ResponseBody
    @RequestMapping("/excel")
    public void testExcel() {
        // 文件输出位置
        String outPath = "D:\\java\\test.xlsx";
        try {
            // 所有行的集合
            List<List<Object>> list = new ArrayList<List<Object>>();

            for (int i = 1; i <= 10; i++) {
                // 第 n 行的数据
                List<Object> row = new ArrayList<Object>();
                row.add("第" + i + "单元格");
                row.add("第" + i + "单元格");
                list.add(row);
            }
            ExcelWriter excelWriter = EasyExcelFactory.getWriter(new FileOutputStream(outPath));
            // 表单
            Sheet sheet = new Sheet(1, 0);
            sheet.setSheetName("第一个Sheet");
            // 创建一个表格
            Table table = new Table(1);
            // 动态添加 表头 headList --> 所有表头行集合
            List<List<String>> headList = new ArrayList<>();
            // 第 n 行 的表头
            headList.add(Collections.singletonList("标题1"));
            headList.add(Collections.singletonList("标题4"));
            headList.add(Collections.singletonList("标题2"));
            headList.add(Collections.singletonList("标题3"));
            table.setHead(headList);

            excelWriter.write1(list, sheet, table);
            // 记得 释放资源
            excelWriter.finish();
//            System.out.println("ok");
            log.info("ok");
        } catch (FileNotFoundException e) {
            log.error("excel文件导出失败, 失败原因：{}", e);
        }
    }

}
