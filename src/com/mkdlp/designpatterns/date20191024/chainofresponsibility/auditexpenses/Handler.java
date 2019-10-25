package com.mkdlp.designpatterns.date20191024.chainofresponsibility.auditexpenses;

public abstract class Handler {

    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    /**
    * @description 审批费用的方法
    * @param user
     * @param fee
    * @author  mkdlp
    * @date  2019/10/25 15:40
    * @return
    */
    public abstract String handleFeeRequest(String user,double fee);
}
