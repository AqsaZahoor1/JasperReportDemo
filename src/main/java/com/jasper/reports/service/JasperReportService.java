package com.jasper.reports.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.jasper.reports.model.ConsumerBill;
import com.jasper.reports.model.ElectricityCharges;
import com.jasper.reports.model.FurCharges;
import com.jasper.reports.model.Item;
import com.jasper.reports.model.ReportContent;
import com.jasper.reports.model.SuiGasCharges;
import com.jasper.reports.model.UtilityBillFields;
import com.jasper.reports.model.WaterCharges;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class JasperReportService {

	public byte[] getItemReport() throws FileNotFoundException {

		JasperReport jasperReport;
		byte[] reportContent = null;

		try {

			File file = ResourceUtils.getFile("classpath:report_template.jrxml");
			jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
			
			List<ConsumerBill> list = new ArrayList<ConsumerBill>();
			list.add(new ConsumerBill());
			JRBeanCollectionDataSource dataSource1 = new JRBeanCollectionDataSource(list);
			
			List<ElectricityCharges> list2 = new ArrayList<ElectricityCharges>();
			list2.add(new ElectricityCharges());
			JRBeanCollectionDataSource dataSource2 = new JRBeanCollectionDataSource(list2);
			
			List<WaterCharges> list4 = new ArrayList<WaterCharges>();
			list4.add(new WaterCharges());
			JRBeanCollectionDataSource dataSource4 = new JRBeanCollectionDataSource(list4);
			
			List<FurCharges> list5 = new ArrayList<FurCharges>();
			list5.add(new FurCharges());
			JRBeanCollectionDataSource dataSource5 = new JRBeanCollectionDataSource(list5);
			
			List<SuiGasCharges> list6 = new ArrayList<SuiGasCharges>();
			list6.add(new SuiGasCharges());
			JRBeanCollectionDataSource dataSource6 = new JRBeanCollectionDataSource(list6);
			
			List<UtilityBillFields> list7 = new ArrayList<UtilityBillFields>();
			list7.add(new UtilityBillFields());
			JRBeanCollectionDataSource dataSource7 = new JRBeanCollectionDataSource(list7);
			
			List<ReportContent> mainList = new ArrayList<ReportContent>();
			mainList.add(new ReportContent());
			JRBeanCollectionDataSource mainDataSource = new JRBeanCollectionDataSource(mainList);
			
			 Map<String, Object> parameters = new HashMap<>();
	            parameters.put("no", "123");  
	            parameters.put("rank", "123"); 
	            parameters.put("name", "Aqsa ");  
	            parameters.put("unit", "300 units"); 
	            parameters.put("address", "Rawalpoindi , Pakistan"); 
	            parameters.put("electric", "123"); 
	            parameters.put("water", "123"); 
	            parameters.put("furniture", "38989");  // Set the value for the "no" parameter
	            parameters.put("Dataset1", dataSource1); 
	            parameters.put("Dataset2", dataSource2);
	            parameters.put("Dataset3", new JRBeanCollectionDataSource(list2)); 
	            parameters.put("Dataset4", dataSource4);
	            parameters.put("Dataset5", dataSource5);    
	            parameters.put("Dataset6", dataSource6);
	            
	            parameters.put("Utilities_Bill_Fields", new JRBeanCollectionDataSource(list7));
	            parameters.put("Utilities_Bill_Fields_1", new JRBeanCollectionDataSource(list7));
	            parameters.put("Total_Recovery", new JRBeanCollectionDataSource(list7));
	            parameters.put("Sui_Gas_1",  new JRBeanCollectionDataSource(list6));
	            
	            parameters.put("Dataset1.1", new JRBeanCollectionDataSource(list)); 
	            parameters.put("Dataset1.2", new JRBeanCollectionDataSource(list)); 
	        
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, mainDataSource);

			reportContent = JasperExportManager.exportReportToPdf(jasperPrint);

		} catch (FileNotFoundException | JRException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

		return reportContent;
	}
}
