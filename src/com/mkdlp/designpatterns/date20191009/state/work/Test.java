package com.mkdlp.designpatterns.date20191009.state.work;

public class Test {

    public static void main(String[] args) {
        Work work=new Work();
        work.setHour(9);
        work.work();
        work.setHour(10);
        work.work();
        work.setHour(12);
        work.work();
        work.setHour(13);
        work.work();
        work.setHour(14);
        work.work();
        work.setHour(17);
        work.work();

        work.setFinished(true);
        //work.setFinished(false);

        work.setHour(19);
        work.work();
        work.setHour(22);
        work.work();
    }
}
