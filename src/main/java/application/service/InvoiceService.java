package application.service;




import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.lowagie.text.pdf.codec.Base64.InputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.LoggerContext;

@Service
@Primary
public class InvoiceService {

	Logger log = (Logger) LogManager.getLogger(InvoiceService.class);

	private final String invoice_template_path = "/jasper/invoice_template.jrxml";

    public void generateInvoiceFor( Locale locale) throws IOException {

        File pdfFile = File.createTempFile("my-invoice", ".pdf");

        try(FileOutputStream pos = new FileOutputStream(pdfFile))
        {
			// Load the invoice jrxml template.
            final JasperReport report = loadTemplate();

        }
        catch (final Exception e)
        {
            log.error(String.format("An error occured during PDF creation: %s", e));
        }
    }

     // Load invoice jrxml template
    private JasperReport loadTemplate() throws JRException {

        log.info(String.format("Invoice template path : %s", invoice_template_path));

        final InputStream reportInputStream = (InputStream) getClass().getResourceAsStream(invoice_template_path);
        final JasperDesign jasperDesign = JRXmlLoader.load(reportInputStream);

        return JasperCompileManager.compileReport(jasperDesign);
    }
}