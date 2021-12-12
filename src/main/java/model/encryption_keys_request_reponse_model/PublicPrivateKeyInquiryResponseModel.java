package model.encryption_keys_request_reponse_model;

import model.common.MessageRequestHeaderModel;

public class PublicPrivateKeyInquiryResponseModel {

    private MessageRequestHeaderModel messageRequestHeaderModel;
    private EncryptionKeyBodyModel encryptionKeyBodyModel;

    public MessageRequestHeaderModel getMessageRequestHeader() {
        return messageRequestHeaderModel;
    }

    public void setMessageRequestHeader(MessageRequestHeaderModel messageRequestHeaderModel) {
        this.messageRequestHeaderModel = messageRequestHeaderModel;
    }

    public EncryptionKeyBodyModel getEncryptionKeyBody() {
        return encryptionKeyBodyModel;
    }

    public void setEncryptionKeyBody(EncryptionKeyBodyModel encryptionKeyBodyModel) {
        this.encryptionKeyBodyModel = encryptionKeyBodyModel;
    }
}
