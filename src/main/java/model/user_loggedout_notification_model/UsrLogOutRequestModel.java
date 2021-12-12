package model.user_loggedout_notification_model;

import model.common.MessageRequestHeaderModel;

public class UsrLogOutRequestModel {

    private UsrLogOutRequestBodyModel usrLogOutRequestBodyModel;
    private MessageRequestHeaderModel messageRequestHeaderModel;

    public UsrLogOutRequestBodyModel getUsrLogOutRquestBody() {
        return usrLogOutRequestBodyModel;
    }

    public void setUsrLogOutRquestBody(UsrLogOutRequestBodyModel usrLogOutRequestBodyModel) {
        this.usrLogOutRequestBodyModel = usrLogOutRequestBodyModel;
    }

    public MessageRequestHeaderModel getMessageRequestHeader() {
        return messageRequestHeaderModel;
    }

    public void setMessageRequestHeader(MessageRequestHeaderModel messageRequestHeaderModel) {
        this.messageRequestHeaderModel = messageRequestHeaderModel;
    }
}
