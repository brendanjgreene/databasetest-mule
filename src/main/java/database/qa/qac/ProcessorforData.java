package database.qa.qac;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class ProcessorforData extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		Map<String, String> out = (Map<String, String>) message.getPayload();
		message.setProperty("field",  out.get("field"), PropertyScope.SESSION);
		message.setProperty("operator",  out.get("operator"), PropertyScope.SESSION);
		message.setProperty("value",  out.get("value"), PropertyScope.SESSION);
		return out;
	}

}
