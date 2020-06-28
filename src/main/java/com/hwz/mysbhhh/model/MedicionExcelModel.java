package com.hwz.mysbhhh.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * @author hwz
 * @date 2020/6/24
 */
@ContentRowHeight(20)
@HeadRowHeight(25)
@ColumnWidth(30)
@Data
public class MedicionExcelModel {
    @ExcelProperty(value = "类型",index = 0)
    private String typeName;
    @ExcelProperty(value = "一级分类",index = 1)
    private String firstType;
    @ExcelProperty(value = "二级分类",index = 2)
    private String secondType;
    @ExcelProperty(value = "药品通用名称",index = 3)
    private String name;
    @ExcelProperty(value = "商品名",index = 4)
    private String productName;
    @ExcelProperty(value = "药品条形码",index = 5)
    private String barCode;
    @ExcelProperty(value = "生产厂家",index = 6)
    private String manufacturer;
    @ExcelProperty(value = "批准文号",index = 7)
    private String pzwh;
    @ExcelProperty(value = "含量规格",index = 8)
    private String dosageFormat;
    @ExcelProperty(value = "包装规格",index = 9)
    private String packageFormat;
    @ExcelProperty(value = "剂型",index = 10)
    private String remedy;
    @ExcelProperty(value = "用法",index = 11)
    private String usage;
    @ExcelProperty(value = "用量",index = 12)
    private String dosage;
    @ExcelProperty(value = "单个包装规格下数量",index = 13)
    private String singlePackageNum;
    @ExcelProperty(value = "单次用药量",index = 14)
    private String singleDosage;
    @ExcelProperty(value = "单次用药次数",index = 15)
    private String singleUseCount;
    @ExcelProperty(value = "适应症",index = 16)
    private String indications;
    @ExcelProperty(value = "注意事项",index = 17)
    private String precautions;
    @ExcelProperty(value = "附件地址",index = 18)
    private String imgUrl;
}
