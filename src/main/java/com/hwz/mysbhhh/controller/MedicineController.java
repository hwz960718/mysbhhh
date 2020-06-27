package com.hwz.mysbhhh.controller;

import cn.hutool.core.date.DateUtil;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hwz.mysbhhh.model.MedicionExcelModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

import static com.alibaba.excel.EasyExcelFactory.write;

/**
 * @author hwz
 * @date 2020/6/25
 */
@RestController
@RequestMapping("/medicine/")
public class MedicineController {

    @GetMapping("download")
    public void exportVolunteerExcelTemplate(HttpServletResponse response) throws IOException {
        MedicionExcelModel medicineExcelModel = new MedicionExcelModel();
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition",
                "attachment;filename=" + DateUtil.today() + "-medicine-" + ExcelTypeEnum.XLSX.getValue());
        write(response.getOutputStream(), MedicionExcelModel.class).sheet("Sheet1")
                .doWrite(Collections.singletonList(medicineExcelModel));
    }

    @GetMapping("import")
    public void importVolunteerExcel(MultipartFile file) {


    }
}
