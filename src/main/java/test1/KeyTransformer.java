package test1;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class KeyTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {
		return "Created an instance KeyTransformer Java class. \n"
				+ "And also received url variable: " + src.toString(); 
	}

}
