package util;

public class Constants {

    public static final String HOST = "localhost"; // Host name or IP address
    public static final int PORT = 1414; // Listener port for your queue manager
    public static final String CHANNEL = "DEV.ADMIN.SVRCONN"; // Channel name
    public static final String QMGR = "QM1"; // Queue manager name
    public static final String APP_USER = "admin"; // User name that application uses to connect to MQ
    public static final String APP_PASSWORD = "passw0rd"; // Password that the application uses to connect to MQ
    public static final String EMPLOYEE_QUEUE = "queue:///Employee";
    public static final String MANAGER_QUEUE = "queue:///Manager";
    public static final String TOPIC1_TOPIC = "topic:///Topic1";
    public static final String TOPIC_SEND = "TOPIC_SEND";
    public static final String TOPIC_RECEIVE = "TOPIC_RECEIVE";
    public static final String QUEUE_SEND = "QUEUE_SEND";
    public static final String QUEUE_RECEIVE = "QUEUE_RECEIVE";


    private Constants() {
    }
}
