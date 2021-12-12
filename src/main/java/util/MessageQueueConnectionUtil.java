package util;

import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsConstants;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.common.CommonConstants;

import javax.jms.*;

import static util.Constants.*;

public class MessageQueueConnectionUtil {

    private static MessageQueueConnectionUtil messageQueueConnectionUtilInstance;
    private JMSContext employeeJmsContext;
    private JMSContext managerJmsContext;
    private JMSConsumer employeeQueueConsumer;
    private JMSConsumer managerQueueConsumer;
    private JMSProducer employeeQueueProducer;
    private JMSProducer managerQueueProducer;
    private Destination employeeQueueDestination;
    private Destination managerQueueDestination;


    private MessageQueueConnectionUtil() throws JMSException {
        constructApplicationJmsContexts();
    }

    public static MessageQueueConnectionUtil getMessageQueueConnectionUtilInstance() throws JMSException {
        if (messageQueueConnectionUtilInstance == null) {
            messageQueueConnectionUtilInstance = new MessageQueueConnectionUtil();
            return messageQueueConnectionUtilInstance;
        }
        return messageQueueConnectionUtilInstance;
    }


    private void constructApplicationJmsContexts() throws JMSException {
        JmsFactoryFactory jmsFactoryFactory = JmsFactoryFactory.getInstance(JmsConstants.WMQ_PROVIDER);
        JmsConnectionFactory jmsConnectionFactory = jmsFactoryFactory.createConnectionFactory();
        jmsConnectionFactory.setStringProperty(CommonConstants.WMQ_HOST_NAME, HOST);
        jmsConnectionFactory.setIntProperty(CommonConstants.WMQ_PORT, PORT);
        jmsConnectionFactory.setStringProperty(CommonConstants.WMQ_CHANNEL, CHANNEL);
        jmsConnectionFactory.setIntProperty(CommonConstants.WMQ_CONNECTION_MODE, CommonConstants.WMQ_CM_CLIENT);
        jmsConnectionFactory.setStringProperty(CommonConstants.WMQ_QUEUE_MANAGER, QMGR);
        jmsConnectionFactory.setStringProperty(CommonConstants.WMQ_APPLICATIONNAME, "JmsPutGet (JMS)");
        jmsConnectionFactory.setBooleanProperty(JmsConstants.USER_AUTHENTICATION_MQCSP, true);
        jmsConnectionFactory.setStringProperty(JmsConstants.USERID, APP_USER);
        jmsConnectionFactory.setStringProperty(JmsConstants.PASSWORD, APP_PASSWORD);
        this.employeeJmsContext = jmsConnectionFactory.createContext();
        this.managerJmsContext = jmsConnectionFactory.createContext();
        createEmployQueueConsumer();
        createEmployQueueProducer();
        createManagerQueueConsumer();
        createManagerQueueProducer();
    }

    private void createEmployQueueProducer() {
        this.employeeQueueDestination = employeeJmsContext.createQueue(EMPLOYEE_QUEUE);
        this.employeeQueueProducer = employeeJmsContext.createProducer();
    }

    private void createEmployQueueConsumer() {
        this.employeeQueueDestination = employeeJmsContext.createQueue(EMPLOYEE_QUEUE);
        this.employeeQueueConsumer = employeeJmsContext.createConsumer(employeeQueueDestination);
    }

    private void createManagerQueueProducer() {
        this.managerQueueDestination = managerJmsContext.createQueue(MANAGER_QUEUE);
        this.managerQueueProducer = managerJmsContext.createProducer();
    }

    private void createManagerQueueConsumer() {
        this.managerQueueDestination = managerJmsContext.createQueue(MANAGER_QUEUE);
        this.managerQueueConsumer = managerJmsContext.createConsumer(managerQueueDestination);
    }


    public JMSConsumer getEmployeeQueueConsumer() {
        return employeeQueueConsumer;
    }


    public JMSProducer getEmployeeQueueProducer() {
        return employeeQueueProducer;
    }

    public JMSContext getEmployeeJmsContext() {
        return employeeJmsContext;
    }


    public Destination getEmployeeQueueDestination() {
        return employeeQueueDestination;
    }

    public JMSConsumer getManagerQueueConsumer() {
        return managerQueueConsumer;
    }

    public JMSProducer getManagerQueueProducer() {
        return managerQueueProducer;
    }

    public JMSContext getManagerJmsContext() {
        return managerJmsContext;
    }

    public Destination getManagerQueueDestination() {
        return managerQueueDestination;
    }
}
