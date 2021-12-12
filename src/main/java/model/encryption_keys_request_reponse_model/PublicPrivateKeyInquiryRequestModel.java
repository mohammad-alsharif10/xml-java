package model.encryption_keys_request_reponse_model;

import model.common.MessageRequestHeaderModel;

public class PublicPrivateKeyInquiryRequestModel {

    private MessageRequestHeaderModel messageRequestHeaderModel;

    public MessageRequestHeaderModel getMessageRequestHeader() {
        return messageRequestHeaderModel;
    }

    public void setMessageRequestHeader(MessageRequestHeaderModel messageRequestHeaderModel) {
        this.messageRequestHeaderModel = messageRequestHeaderModel;
    }
}
