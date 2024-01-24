package com.jasper.reports.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jasper.reports.service.JasperReportService;
import net.sf.jasperreports.engine.JRException;

@Controller
public class ReportController {

	@Autowired
	JasperReportService jasperReportService;

	@GetMapping("item-report/{format}")
	public ResponseEntity<ByteArrayResource> getItemReport() throws JRException, IOException {
		String format = "pdf";
		byte[] reportContent = jasperReportService.getItemReport();

		ByteArrayResource resource = new ByteArrayResource(reportContent);

		return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM)
				.contentLength(resource.contentLength())
				.header(HttpHeaders.CONTENT_DISPOSITION,
						ContentDisposition.attachment().filename("item-report." + format).build().toString())
				.body(resource);
	}
}
