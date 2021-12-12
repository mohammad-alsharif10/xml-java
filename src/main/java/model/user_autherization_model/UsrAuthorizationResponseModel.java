package model.user_autherization_model;

import model.common.MessageRequestHeaderModel;

public class UsrAuthorizationResponseModel {

    private UsrAuthorizationResponseBodyModel usrAuthorizationResponseBodyModel;
    private MessageRequestHeaderModel messageRequestHeaderModel;

    public UsrAuthorizationResponseBodyModel getUsrAuthorizationResponseBody() {
        return usrAuthorizationResponseBodyModel;
    }

    public void setUsrAuthorizationResponseBody(UsrAuthorizationResponseBodyModel usrAuthorizationResponseBodyModel) {
        this.usrAuthorizationResponseBodyModel = usrAuthorizationResponseBodyModel;
    }

    public MessageRequestHeaderModel getMessageRequestHeader() {
        return messageRequestHeaderModel;
    }

    public void setMessageRequestHeader(MessageRequestHeaderModel messageRequestHeaderModel) {
        this.messageRequestHeaderModel = messageRequestHeaderModel;
    }
}
