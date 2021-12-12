package util;

import model.common.MessageRequestHeaderModel;
import model.encryption_keys_request_reponse_model.EncryptionKeyBodyModel;
import model.encryption_keys_request_reponse_model.PublicPrivateKeyInquiryRequestModel;
import model.encryption_keys_request_reponse_model.PublicPrivateKeyInquiryResponseModel;
import model.user_autherization_model.UsrAuthorizationRequestBodyModel;
import model.user_autherization_model.UsrAuthorizationRequestModel;
import model.user_autherization_model.UsrAuthorizationResponseBodyModel;
import model.user_autherization_model.UsrAuthorizationResponseModel;
import model.user_loggedout_notification_model.UsrLogOutRequestBodyModel;
import model.user_loggedout_notification_model.UsrLogOutRequestModel;
import xmldto.common.MsgRqHdr;
import xmldto.encryption_keys_request_reponse_dto.DssPubPrivKeysInqRq;
import xmldto.encryption_keys_request_reponse_dto.EncryptionKeysBody;
import xmldto.encryption_keys_request_reponse_dto.EtradePubPrivKeysInqRs;
import xmldto.user_autherization_dto.DssUsrAuthorizationRq;
import xmldto.user_autherization_dto.EtradeUsrAuthorizationReqBody;
import xmldto.user_autherization_dto.EtradeUsrAuthorizationResBody;
import xmldto.user_autherization_dto.EtradeUsrAuthorizationRs;
import xmldto.user_loggedout_notification_dto.DssUsrLogOutRq;
import xmldto.user_loggedout_notification_dto.DssUsrLogOutRqBody;

public class ObjectConversionUtil {

//    private final MsgRqHdr msgRqHdr = new MsgRqHdr();
//    private final MessageRequestHeaderModel messageRequestHeaderModel = new MessageRequestHeaderModel();
//    private final EncryptionKeyBodyModel encryptionKeyBodyModel = new EncryptionKeyBodyModel();
//    private final EncryptionKeysBody encryptionKeysBody = new EncryptionKeysBody();
//    private final PublicPrivateKeyInquiryRequestModel publicPrivateKeyInquiryRequestModel = new PublicPrivateKeyInquiryRequestModel();
//    private final PublicPrivateKeyInquiryResponseModel publicPrivateKeyInquiryResponseModel = new PublicPrivateKeyInquiryResponseModel();
//    private final DssPubPrivKeysInqRq dssPubPrivKeysInqRq = new DssPubPrivKeysInqRq();
//    private final EtradePubPrivKeysInqRs etradePubPrivKeysInqRs = new EtradePubPrivKeysInqRs();
//    private final UsrAuthorizationRequestBodyModel usrAuthorizationRequestBodyModel = new UsrAuthorizationRequestBodyModel();
//    private final UsrAuthorizationResponseBodyModel usrAuthorizationResponseBodyModel = new UsrAuthorizationResponseBodyModel();
//    private final UsrAuthorizationRequestModel usrAuthorizationRequestModel = new UsrAuthorizationRequestModel();
//    private final UsrAuthorizationResponseModel usrAuthorizationResponseModel = new UsrAuthorizationResponseModel();
//    private final EtradeUsrAuthorizationReqBody etradeUsrAuthorizationReqBody = new EtradeUsrAuthorizationReqBody();
//    private final EtradeUsrAuthorizationResBody etradeUsrAuthorizationResBody = new EtradeUsrAuthorizationResBody();
//    private final DssUsrAuthorizationRq dssUsrAuthorizationRq = new DssUsrAuthorizationRq();
//    private final EtradeUsrAuthorizationRs etradeUsrAuthorizationRs = new EtradeUsrAuthorizationRs();
//    private final UsrLogOutRequestBodyModel usrLogOutRequestBodyModel = new UsrLogOutRequestBodyModel();
//    private final UsrLogOutRequestModel usrLogOutRequestModel = new UsrLogOutRequestModel();
//    private final DssUsrLogOutRqBody dssUsrLogOutRqBody = new DssUsrLogOutRqBody();
//    private final DssUsrLogOutRq dssUsrLogOutRq = new DssUsrLogOutRq();
//    private static ObjectConversionUtil objectConversionUtilInstance;
//
//    private ObjectConversionUtil() {
//    }
//
//    public static ObjectConversionUtil getObjectConversionUtilInstance() {
//        if (objectConversionUtilInstance == null) {
//            objectConversionUtilInstance = new ObjectConversionUtil();
//            return objectConversionUtilInstance;
//        }
//        return objectConversionUtilInstance;
//    }
//
//    public MessageRequestHeaderModel convertFromMessageHeaderXmlToModel(MsgRqHdr msgRqHdr) {
//        messageRequestHeaderModel.setRequestUID(msgRqHdr.RqUID);
//        messageRequestHeaderModel.setFunctionID(msgRqHdr.FuncId);
//        messageRequestHeaderModel.setsCId(msgRqHdr.SCId);
//        messageRequestHeaderModel.setTerminalID(msgRqHdr.TerminalId);
//        return messageRequestHeaderModel;
//    }
//
//    public MsgRqHdr convertFromMessageHeaderModelToXml(MessageRequestHeaderModel messageRequestHeaderModel) {
//        msgRqHdr.RqUID = messageRequestHeaderModel.getRequestUID();
//        msgRqHdr.FuncId = messageRequestHeaderModel.getFunctionID();
//        msgRqHdr.SCId = messageRequestHeaderModel.getsCId();
//        msgRqHdr.TerminalId = messageRequestHeaderModel.getTerminalID();
//        return msgRqHdr;
//    }
//
//    public EncryptionKeyBodyModel convertFromEncryptionKeyBodyXmlToModel(EncryptionKeysBody encryptionKeysBody) {
//        encryptionKeyBodyModel.setPrivateKey(encryptionKeysBody.privateKey);
//        encryptionKeyBodyModel.setPublicKey(encryptionKeysBody.publicKey);
//        return encryptionKeyBodyModel;
//    }
//
//    public EncryptionKeysBody convertFromEncryptionKeyBodyModelToXml(EncryptionKeyBodyModel encryptionKeyBodyModel) {
//        encryptionKeysBody.privateKey = encryptionKeyBodyModel.getPrivateKey();
//        encryptionKeysBody.publicKey = encryptionKeyBodyModel.getPublicKey();
//        return this.encryptionKeysBody;
//    }
//
//    public EtradePubPrivKeysInqRs convertFromEncryptionKeyResponseModelToXml(PublicPrivateKeyInquiryResponseModel inquiryResponseModel) {
//        etradePubPrivKeysInqRs.MsgRqHdr = convertFromMessageHeaderModelToXml(inquiryResponseModel.getMessageRequestHeader());
//        etradePubPrivKeysInqRs.Body = convertFromEncryptionKeyBodyModelToXml(inquiryResponseModel.getEncryptionKeyBody());
//        return etradePubPrivKeysInqRs;
//    }
//
//    public PublicPrivateKeyInquiryResponseModel convertFromEncryptionKeyResponseXmlToModel(EtradePubPrivKeysInqRs etradePubPrivKeysInqRs) {
//        publicPrivateKeyInquiryResponseModel.setMessageRequestHeader(convertFromMessageHeaderXmlToModel(etradePubPrivKeysInqRs.MsgRqHdr));
//        publicPrivateKeyInquiryResponseModel.setEncryptionKeyBody(convertFromEncryptionKeyBodyXmlToModel(etradePubPrivKeysInqRs.Body));
//        return publicPrivateKeyInquiryResponseModel;
//    }
//
//    public DssPubPrivKeysInqRq convertFromEncryptionKeyRequestModelToXml(PublicPrivateKeyInquiryRequestModel inquiryRequestModel) {
//        dssPubPrivKeysInqRq.MsgRqHdr = convertFromMessageHeaderModelToXml(inquiryRequestModel.getMessageRequestHeader());
//        return dssPubPrivKeysInqRq;
//    }
//
//    public PublicPrivateKeyInquiryRequestModel convertFromEncryptionKeyRequestXmlToModel(DssPubPrivKeysInqRq dssPubPrivKeysInqRq) {
//        publicPrivateKeyInquiryRequestModel.setMessageRequestHeader(convertFromMessageHeaderXmlToModel(dssPubPrivKeysInqRq.MsgRqHdr));
//        return publicPrivateKeyInquiryRequestModel;
//    }
//
//    public UsrAuthorizationRequestBodyModel convertFromUsrAuthorizationRequestBodyXmlToModel(EtradeUsrAuthorizationReqBody authorizationReqBody) {
//        usrAuthorizationRequestBodyModel.setUserId(authorizationReqBody.UserId);
//        return usrAuthorizationRequestBodyModel;
//    }
//
//    public UsrAuthorizationResponseBodyModel convertFromUsrAuthorizationResponseBodyXmlToModel(EtradeUsrAuthorizationResBody authorizationResBody) {
//        usrAuthorizationResponseBodyModel.setUserID(authorizationResBody.UserID);
//        usrAuthorizationResponseBodyModel.setUserLoggedIn(authorizationResBody.UserLoggedIn);
//        return usrAuthorizationResponseBodyModel;
//    }
//
//    public UsrAuthorizationRequestModel convertFromUsrAuthorizationRequestXmlToModel(DssUsrAuthorizationRq authorizationRq) {
//        usrAuthorizationRequestModel.setUsrAuthorizationRequestBody(convertFromUsrAuthorizationRequestBodyXmlToModel(authorizationRq.Body));
//        usrAuthorizationRequestModel.setMessageRequestHeader(convertFromMessageHeaderXmlToModel(authorizationRq.MsgRqHdr));
//        return usrAuthorizationRequestModel;
//    }
//
//    public UsrAuthorizationResponseModel convertFromUsrAuthorizationResponseXmlToModel(EtradeUsrAuthorizationRs authorizationRs) {
//        usrAuthorizationResponseModel.setMessageRequestHeader(convertFromMessageHeaderXmlToModel(authorizationRs.MsgRqHdr));
//        return usrAuthorizationResponseModel;
//    }
//
//
//    public EtradeUsrAuthorizationReqBody convertFromUsrAuthorizationRequestBodyModelToXml(UsrAuthorizationRequestBodyModel requestBodyModel) {
//        etradeUsrAuthorizationReqBody.UserId = requestBodyModel.getUserId();
//        return etradeUsrAuthorizationReqBody;
//    }
//
//    public EtradeUsrAuthorizationResBody convertFromUsrAuthorizationResponseBodyModelToXml(UsrAuthorizationResponseBodyModel responseBodyModel) {
//        etradeUsrAuthorizationResBody.UserID = responseBodyModel.getUserID();
//        etradeUsrAuthorizationResBody.UserLoggedIn = responseBodyModel.getUserLoggedIn();
//        return etradeUsrAuthorizationResBody;
//    }
//
//    public DssUsrAuthorizationRq convertFromUsrAuthorizationRequestModelToXml(UsrAuthorizationRequestModel requestModel) {
//        dssUsrAuthorizationRq.Body = convertFromUsrAuthorizationRequestBodyModelToXml(requestModel.getUsrAuthorizationRequestBody());
//        dssUsrAuthorizationRq.MsgRqHdr = convertFromMessageHeaderModelToXml(requestModel.getMessageRequestHeader());
//        return dssUsrAuthorizationRq;
//    }
//
//    public EtradeUsrAuthorizationRs convertFromUsrAuthorizationResponseModelToXml(UsrAuthorizationResponseModel responseModel) {
//        etradeUsrAuthorizationRs.Body = convertFromUsrAuthorizationResponseBodyModelToXml(responseModel.getUsrAuthorizationResponseBody());
//        etradeUsrAuthorizationRs.MsgRqHdr = convertFromMessageHeaderModelToXml(responseModel.getMessageRequestHeader());
//        return etradeUsrAuthorizationRs;
//    }
//
//    public UsrLogOutRequestBodyModel convertFromLogoutRequestBodyXmlToModel(DssUsrLogOutRqBody dssUsrLogOutRqBody) {
//        usrLogOutRequestBodyModel.setUserId(dssUsrLogOutRqBody.UserId);
//        return usrLogOutRequestBodyModel;
//    }
//
//    public UsrLogOutRequestModel convertFromLogoutRequestXmlToModel(DssUsrLogOutRq dssUsrLogOutRq) {
//        usrLogOutRequestModel.setMessageRequestHeader(convertFromMessageHeaderXmlToModel(dssUsrLogOutRq.MsgRqHdr));
//        usrLogOutRequestModel.setUsrLogOutRquestBody(convertFromLogoutRequestBodyXmlToModel(dssUsrLogOutRq.Body));
//        return usrLogOutRequestModel;
//    }
//
//    public DssUsrLogOutRqBody convertFromLogoutRequestBodyModelToXml(UsrLogOutRequestBodyModel requestBodyModel) {
//        dssUsrLogOutRqBody.UserId = requestBodyModel.getUserId();
//        return dssUsrLogOutRqBody;
//    }
//
//    public DssUsrLogOutRq convertFromLogoutRequestModelToXml(UsrLogOutRequestModel requestModel) {
//        dssUsrLogOutRq.Body = convertFromLogoutRequestBodyModelToXml(requestModel.getUsrLogOutRquestBody());
//        dssUsrLogOutRq.MsgRqHdr = convertFromMessageHeaderModelToXml(requestModel.getMessageRequestHeader());
//        return dssUsrLogOutRq;
//    }

}






