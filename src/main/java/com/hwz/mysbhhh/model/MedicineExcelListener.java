package com.hwz.mysbhhh.model;

import com.alibaba.excel.analysis.ExcelAnalyser;
import com.alibaba.excel.analysis.ExcelReadExecutor;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.List;

/**
 * @author hwz
 * @date 2020/7/4
 */
public class MedicineExcelListener implements ExcelAnalyser {
    @Override
    public void analysis(List<ReadSheet> list, Boolean aBoolean) {

    }

    @Override
    public void finish() {

    }

    @Override
    public ExcelReadExecutor excelExecutor() {
        return null;
    }

    @Override
    public AnalysisContext analysisContext() {
        return null;
    }
}
