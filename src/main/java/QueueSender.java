import util.MessageQueueConnectionUtil;

import javax.jms.JMSException;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

public class QueueSender {


    public static void main(String[] args) {
        try {
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
            MessageQueueConnectionUtil messageQueueConnectionUtil = MessageQueueConnectionUtil.getMessageQueueConnectionUtilInstance();
            TextMessage employeeMessage = messageQueueConnectionUtil.getEmployeeJmsContext().createTextMessage(xml);
            TemporaryQueue temporaryQueue = messageQueueConnectionUtil.getEmployeeJmsContext().createTemporaryQueue();
            employeeMessage.setJMSReplyTo(temporaryQueue);
            messageQueueConnectionUtil.getEmployeeQueueProducer().send(messageQueueConnectionUtil.getEmployeeQueueDestination(), employeeMessage);

            TextMessage managerMessage = messageQueueConnectionUtil.getManagerJmsContext().createTextMessage(xml);
            messageQueueConnectionUtil.getManagerQueueProducer().send(messageQueueConnectionUtil.getManagerQueueDestination(), managerMessage);
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
