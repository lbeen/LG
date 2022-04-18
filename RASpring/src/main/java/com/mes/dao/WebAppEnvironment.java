package com.mes.dao;

import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.pnuts.Environment;
import pnuts.ext.CompositePackage;
import pnuts.lang.Context;
import pnuts.lang.Package;
import pnuts.lang.PnutsImpl;

import java.util.Hashtable;

public class WebAppEnvironment extends Environment {

    public WebAppEnvironment(Server server) {
        super(server, null, false, null, null, null);
        this.initialize();
    }

    private void initialize() {
        this.properties = new Hashtable<String, Object>();
        this.globalFunctions = null;
        this.disableCaching = true;
        this.basePackage = new Package("basePackage", null);
        this.baseContext = new Context(this.basePackage);
        ClassLoader var1 = Environment.getCustomClassLoader();
        this.baseContext.setClassLoader(var1);
        this.basePackage.set("environment", this, this.baseContext);
        this.rootPackage = new CompositePackage(this.basePackage);
        this.rootContext = new Context(this.baseContext);
        this.rootContext.setCurrentPackage(this.rootPackage);
        this.rootContext.setImplementation(new PnutsImpl());
        this.rootContext.setClassLoader(var1);
    }
}
