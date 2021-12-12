package model.user_autherization_model;

import model.common.MessageRequestHeaderModel;

public class UsrAuthorizationRequestModel {

    private UsrAuthorizationRequestBodyModel usrAuthorizationRequestBodyModel;
    private MessageRequestHeaderModel messageRequestHeaderModel;

    public UsrAuthorizationRequestBodyModel getUsrAuthorizationRequestBody() {
        return usrAuthorizationRequestBodyModel;
    }

    public void setUsrAuthorizationRequestBody(UsrAuthorizationRequestBodyModel usrAuthorizationRequestBodyModel) {
        this.usrAuthorizationRequestBodyModel = usrAuthorizationRequestBodyModel;
    }

    public MessageRequestHeaderModel getMessageRequestHeader() {
        return messageRequestHeaderModel;
    }

    public void setMessageRequestHeader(MessageRequestHeaderModel messageRequestHeaderModel) {
        this.messageRequestHeaderModel = messageRequestHeaderModel;
    }
}
