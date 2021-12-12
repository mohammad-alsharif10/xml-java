import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import xmldto.user_autherization_dto.DssUsrAuthorizationRq;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        // code conversion for DssPubPrivKeysInqRq
//        String xml = "<DssPubPrivKeysInqRq>\n" +
//                "\t<MsgRqHdr>\n" +
//                "\t\t<RqUID>DSS4e37a4b72e0642d48611a7a9ae80e109</RqUID>\n" +
//                "\t\t<SCId>DSS</SCId>\n" +
//                "\t\t<FuncId>getEncryptionKeys</FuncId>\n" +
//                "\t\t<TerminalId>x.x.x.x</TerminalId>\n" +
//                "\t</MsgRqHdr>\n" +
//                "</DssPubPrivKeysInqRq>\n";
//
//        XmlMapper xmlMapper = new XmlMapper();
//        DssPubPrivKeysInqRq value = xmlMapper.readValue(xml, DssPubPrivKeysInqRq.class);
//        System.out.println(value);
//        String xmlConverted = xmlMapper.writeValueAsString(value);
//        System.out.println(xmlConverted);

        // // code conversion for EtradePubPrivKeysInqRs
//        String xml = "<EtradePubPrivKeysInqRs>\n" +
//                "\t<MsgRqHdr>\n" +
//                "\t\t<RqUID>DSS4e37a4b72e0642d48611a7a9ae80e101</RqUID>\n" +
//                "\t\t<SCId>ETRD</SCId>\n" +
//                "\t\t<FuncId>userAuthorization</FuncId>\n" +
//                "\t\t<TerminalId>x.x.x.x</TerminalId>\n" +
//                "\t</MsgRqHdr>\n" +
//                "\t<Body>\n" +
//                "\t\t<privateKey>xxxx</privateKey>\n" +
//                "\t\t<publicKey>xxxx</publicKey>\n" +
//                "\t</Body>\n" +
//                "</EtradePubPrivKeysInqRs>\n";
//
//        XmlMapper xmlMapper = new XmlMapper();
//        EtradePubPrivKeysInqRs value = xmlMapper.readValue(xml, EtradePubPrivKeysInqRs.class);
//        System.out.println(value);
//        String xmlConverted = xmlMapper.writeValueAsString(value);
//        System.out.println(xmlConverted);


        // code conversion for userAutherization
        String xml = "<DssUsrAuthorizationRq>\n" +
                "\t<MsgRqHdr>\n" +
                "\t\t<RqUID>DSS4e37a4b72e0642d48611a7a9ae80e101</RqUID>\n" +
                "\t\t<SCId>DSS</SCId>\n" +
                "\t\t<FuncId>userAuthorization</FuncId>\n" +
                "\t\t<TerminalId>x.x.x.x</TerminalId>\n" +
                "\t</MsgRqHdr>\n" +
                "\t<Body>\n" +
                "\t\t<UserId>1234</UserId>\n" +
                "\t</Body>\n" +
                "</DssUsrAuthorizationRq>\n";

        XmlMapper xmlMapper = new XmlMapper();
        DssUsrAuthorizationRq value = xmlMapper.readValue(xml, DssUsrAuthorizationRq.class);
        System.out.println(value);
        String xmlConverted = xmlMapper.writeValueAsString(value);
        System.out.println(xmlConverted);
    }
}
