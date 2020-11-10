package com.joy.architecture.encoder;

import com.joy.architecture.usecase.port.PasswordEncoder;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class Sha256PasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(final String str) {
        return DigestUtils.sha256Hex(str);
    }

}
