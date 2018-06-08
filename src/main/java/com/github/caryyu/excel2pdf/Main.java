package com.github.caryyu.excel2pdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        String pathOfXls = "E:\\保单列表.xls";
        String pathOfPdf = "E:\\保单列表.pdf";

        FileInputStream fis = new FileInputStream(pathOfXls);
        List<ExcelObject> objects = new ArrayList<ExcelObject>();
        objects.add(new ExcelObject("导航1",fis));
        FileOutputStream fos = new FileOutputStream(pathOfPdf);
        Excel2Pdf pdf = new Excel2Pdf(objects, fos);
        pdf.convert();
    }
}
