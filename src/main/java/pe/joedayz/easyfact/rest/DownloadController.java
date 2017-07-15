package pe.joedayz.easyfact.rest;

import org.springframework.core.io.InputStreamResource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by josediaz on 7/15/17.
 */

@RestController
@RequestMapping("/download")
public class DownloadController {

    private static final String APPLICATION_PDF = "application/pdf";

    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value = "/pdf/{fileName:.+}", method = RequestMethod.GET, produces = "application/pdf")
    public @ResponseBody
    HttpEntity<byte[]> download(@PathVariable("fileName") String fileName, HttpServletResponse response) throws IOException {
        System.out.println("Calling Download:- " + fileName);


        File file = new File("/Users/josediaz/sunat/sunat-docs/envio/" + fileName);
        if (!file.exists()){
            throw new FileNotFoundException("file " + fileName + " was not found.");
        }



        byte[] document = FileCopyUtils.copyToByteArray(file);
        HttpHeaders header = new HttpHeaders();
        header.setContentType(new MediaType("application", "pdf"));
        header.set("Content-Disposition", "inline; filename=" + file.getName());
        header.setContentLength(document.length);
        return new HttpEntity<byte[]>(document, header);
    }



}
