package com.mes.timer.sys;

public enum Factory {
    BS("保山"), TC("腾冲");

    public final String factoryName;

    Factory(String factoryName) {
        this.factoryName = factoryName;
    }

    public static Factory getFactory(String factory){
        return TC.name().equalsIgnoreCase(factory) ? TC : BS;
    }
}
