package com.bitunified.ledconfig.configuration.config;

import com.bitunified.ledconfig.configuration.parser.steps.ParserDataResult;
import groovy.lang.GroovyClassLoader;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;


public class GroovyCompiler {

    public ParserDataResult compile(OutputStream outputStream) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        String script = getStringFromStream(outputStream);
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        Executor executor;
        Class theParsedClass = groovyClassLoader.parseClass(script);
        executor = (Executor) theParsedClass.newInstance();
        if (executor != null) {
            return executor.execute();
        }
        return null;
    }

    private String getStringFromStream(OutputStream outputStream) throws IOException {
        String data = outputStream.toString();
        System.out.print(data);
        return data;
    }
}
