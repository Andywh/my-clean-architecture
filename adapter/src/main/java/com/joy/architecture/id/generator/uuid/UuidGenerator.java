package com.joy.architecture.id.generator.uuid;

import com.joy.architecture.usecase.port.IdGenerator;

import java.util.UUID;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class UuidGenerator implements IdGenerator {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
