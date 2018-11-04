package com.ioc;

import org.junit.Test;

import com.ioc.Container;
import com.ioc.IoCException;

public class ContainerInitializationTests {
    @Test(expected = IoCException.class)
    public void shouldThrowAnExceptionWhenTheConfigurationIsInvalid() throws IoCException {
        Container container = new Container("invalidConfiguration.json");
    }


}
