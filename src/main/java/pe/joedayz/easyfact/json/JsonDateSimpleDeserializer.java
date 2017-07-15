package pe.joedayz.easyfact.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by josediaz on 28/10/2016.
 */
public class JsonDateSimpleDeserializer extends JsonDeserializer<Date> {


	
    private SimpleDateFormat formatterFull =
            new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    	SimpleDateFormat formatter =
                new SimpleDateFormat("dd/MM/yyyy");
    	String dateAsString = p.getText();
        try {
            if (!StringUtils.hasText(dateAsString)) {
                return null;
            }
            if(dateAsString.length()>10){
                return formatterFull.parse(dateAsString);
            }
            return formatter.parse(dateAsString);

        }
        catch (ParseException pe) {
            throw new RuntimeException(pe);
        }
    }

}