package com.publiccms.views.method.tools;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sanluan.common.base.BaseMethod;
import static com.sanluan.common.tools.VerificationUtils.encode;

import freemarker.template.TemplateModelException;

/**
 *
 * GetMd5Method
 * 
 */
@Component
public class GetMd5Method extends BaseMethod {

    @SuppressWarnings("unchecked")
    @Override
    public Object exec(@SuppressWarnings("rawtypes") List arguments) throws TemplateModelException {
        String string = getString(0, arguments);
        if (notEmpty(string)) {
            return encode(string);
        }
        return null;
    }
    
    @Override
    public boolean needAppToken() {
        return false;
    }

    @Override
    public int minParamtersNumber() {
        return 1;
    }
}
