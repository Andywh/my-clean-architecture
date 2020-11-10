package com.joy.architecture.id.generator.jug;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.NoArgGenerator;
import com.joy.architecture.usecase.port.IdGenerator;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class JugIdGenerator implements IdGenerator {
    @Override
    public String generate() {
        return generator().generate().toString().replaceAll("-", "");
    }

    private static NoArgGenerator generator() {
        return Generators.timeBasedGenerator(EthernetAddress.fromInterface());
    }
}
