package com.abc.JasperReport.controller;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.JasperReport.service.ProductService;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

@RestController
@RequestMapping("/reports")
public class ReportController {

	@Autowired
	private ProductService productService;
	
	
	  /* ===================== PDF ===================== */

    @GetMapping(value = "/products/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> downloadProductPdf() throws Exception {

        JasperPrint jasperPrint = buildProductReport();

        byte[] data = JasperExportManager.exportReportToPdf(jasperPrint);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=products.pdf");

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(data);
    }

    /* ===================== MULTI FORMAT ===================== */

    @GetMapping("/products/{format}")
    public ResponseEntity<byte[]> downloadProductReport(@PathVariable String format) throws Exception {

        JasperPrint jasperPrint = buildProductReport();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HttpHeaders headers = new HttpHeaders();
        byte[] data;

        switch (format.toLowerCase()) {

            case "pdf" -> {
                data = JasperExportManager.exportReportToPdf(jasperPrint);
                headers.setContentType(MediaType.APPLICATION_PDF);
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=products.pdf");
                return ResponseEntity.ok().headers(headers).body(data);
            }

            case "html" -> {
                HtmlExporter exporter = new HtmlExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleHtmlExporterOutput(outputStream));
                exporter.exportReport();

                data = outputStream.toByteArray();
                headers.setContentType(MediaType.TEXT_HTML);
            }

            case "xlsx" -> {
                JRXlsxExporter exporter = new JRXlsxExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));

                SimpleXlsxReportConfiguration config = new SimpleXlsxReportConfiguration();
                config.setOnePagePerSheet(true);
                config.setDetectCellType(true);
                exporter.setConfiguration(config);
                exporter.exportReport();

                data = outputStream.toByteArray();
                headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=products.xlsx");
            }

            case "csv" -> {
                JRCsvExporter exporter = new JRCsvExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleWriterExporterOutput(outputStream));
                exporter.exportReport();

                data = outputStream.toByteArray();
                headers.setContentType(MediaType.TEXT_PLAIN);
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=products.csv");
            }

            case "docx" -> {
                JRDocxExporter exporter = new JRDocxExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));
                exporter.exportReport();

                data = outputStream.toByteArray();
                headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=products.docx");
            }

            default -> {
                return ResponseEntity.badRequest().body(null);
            }
        }

        return ResponseEntity.ok().headers(headers).body(data);
    }

    /* ===================== CORE BUILDER ===================== */

    private JasperPrint buildProductReport() throws Exception {

        JRBeanCollectionDataSource dataSource =
                new JRBeanCollectionDataSource(productService.getAll(), false);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("total", "7000");

        ClassPathResource reportResource =
                new ClassPathResource("reports/product_reports.jrxml");

        try (InputStream reportStream = reportResource.getInputStream()) {

            JasperReport jasperReport =
                    JasperCompileManager.compileReport(reportStream);

            return JasperFillManager.fillReport(
                    jasperReport,
                    parameters,
                    dataSource
            );
        }
    }
	
	
	
	
}
