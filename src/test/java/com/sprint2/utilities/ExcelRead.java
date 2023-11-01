package com.sprint2.utilities;

import com.sprint2.pages.LoginPage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.K;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelRead {
//    LoginPage loginPage=new LoginPage();
    public static void read_from_excel()  {


        FileInputStream file =null;
        XSSFWorkbook workbook = null;
        try {
            file= new FileInputStream(ConfigurationReader.getProperty("excel_path"));
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet = workbook.getSheet("Credentials");

        List<String> hrUsers=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            hrUsers.add(sheet.getRow(i).getCell(0).getStringCellValue());
            if (sheet.getRow(i+1).getCell(0).getStringCellValue().isBlank()){
                break;
            }
        }

        List<String> hdUsers=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            hdUsers.add(sheet.getRow(i).getCell(1).getStringCellValue());
            if (sheet.getRow(i+1).getCell(1).getStringCellValue().isBlank()){
                break;
            }
        }

        List<String> marketingUsers=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            marketingUsers.add(sheet.getRow(i).getCell(2).getStringCellValue());
            if (sheet.getRow(i+1).getCell(2).getStringCellValue().isBlank()){
                break;
            }
        }

        List<String> passWord=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            passWord.add(sheet.getRow(i).getCell(3).getStringCellValue());
            if (sheet.getRow(i+1).getCell(3).getStringCellValue().isBlank()){
                break;
            }
        }
        System.out.println(passWord);
        System.out.println(marketingUsers);
        System.out.println(hdUsers);
        System.out.println(hdUsers.get(0).length());
        System.out.println(hrUsers);
        //driver.get locate to app

//        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++){
//            locate to username, sendkeys(list.sendkeys).get(0)
//            hrUsers.get(i);
//            locate to password(pasword.sendkeys.list.get(i)
//            passWord.get(i);
//            click
//            assertion
//            get element and add list if list size >0 succesfull
//            locate element in try catch
//        }
    }
}
