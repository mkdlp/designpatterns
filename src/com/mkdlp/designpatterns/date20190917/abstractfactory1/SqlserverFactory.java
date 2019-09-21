package com.mkdlp.designpatterns.date20190917.abstractfactory1;

public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
