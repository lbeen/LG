package com.mes.dao;

import com.datasweep.compatibility.client.Server;
import com.datasweep.compatibility.manager.ServerFactoryImpl;
import com.datasweep.plantops.common.utility.EncryptionUtils;
import com.rockwell.mes.commons.base.ifc.services.IFunctionsEx;
import com.rockwell.mes.commons.base.ifc.services.PCContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DaoInitialization {
    @Value("${ra-jboss.remote}")
    private String remote;
    @Value("${ra-jboss.http}")
    private String http;
    @Value("${ra-jboss.user}")
    private String user;
    @Value("${ra-jboss.password}")
    private String password;

    @PostConstruct
    public void init() {
        try {
            System.setProperty("com.datasweep.plantops.j2eevendor", "JBoss");
            Server server = ServerFactoryImpl.connectServer(remote, http);
            server.login(user, EncryptionUtils.getPlainTextPassword(password));
            PCContext.setEnvironment(new WebAppEnvironment(server));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IFunctionsEx getFunction() {
        return PCContext.getFunctions();
    }
}
