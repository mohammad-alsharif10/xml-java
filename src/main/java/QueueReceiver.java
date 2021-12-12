import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import util.MessageQueueConnectionUtil;
import xmldto.user_autherization_dto.DssUsrAuthorizationRq;

import javax.jms.JMSException;

public class QueueReceiver {


    public static void main(String[] args) throws JsonProcessingException {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            MessageQueueConnectionUtil messageQueueConnectionUtil = MessageQueueConnectionUtil.getMessageQueueConnectionUtilInstance();
//            messageQueueConnectionUtil.getEmployeeQueueConsumer().setMessageListener(message -> {
//                System.out.println(message);
//
//            });

            String employeeMessage = messageQueueConnectionUtil.getEmployeeQueueConsumer().receiveBody(String.class, 15000);
            System.out.println("\nReceived employee message:\n" + employeeMessage);
            DssUsrAuthorizationRq employeeValue = xmlMapper.readValue(employeeMessage, DssUsrAuthorizationRq.class);
            System.out.println(employeeValue);

            String managerMessage = messageQueueConnectionUtil.getManagerQueueConsumer().receiveBody(String.class, 15000);
            System.out.println("\nReceived manager  message:\n" + managerMessage);
            DssUsrAuthorizationRq managerValue = xmlMapper.readValue(managerMessage, DssUsrAuthorizationRq.class);
            System.out.println(managerValue);
            recordSuccess();
        } catch (JMSException jmsex) {
            recordFailure(jmsex);
        }


    } // end main()

    /**
     * Record this run as successful.
     */
    private static void recordSuccess() {
        System.out.println("SUCCESS");
    }

    /**
     * Record this run as failure.
     *
     * @param ex
     */
    private static void recordFailure(Exception ex) {
        if (ex != null) {
            if (ex instanceof JMSException) {
                processJMSException((JMSException) ex);
            } else {
                System.out.println(ex);
            }
        }
        System.out.println("FAILURE");
    }

    /**
     * Process a JMSException and any associated inner exceptions.
     *
     * @param jmsex
     */
    private static void processJMSException(JMSException jmsex) {
        System.out.println(jmsex);
        Throwable innerException = jmsex.getLinkedException();
        if (innerException != null) {
            System.out.println("Inner exception(s):");
        }
        while (innerException != null) {
            System.out.println(innerException);
            innerException = innerException.getCause();
        }
        return;
    }
}
