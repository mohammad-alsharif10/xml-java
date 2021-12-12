package model.common;

public class MessageRequestHeaderModel {

    private String requestUID;

    private String sCId;

    private String functionID;

    private String terminalID;

    public String getRequestUID() {
        return requestUID;
    }

    public void setRequestUID(String requestUID) {
        this.requestUID = requestUID;
    }

    public String getsCId() {
        return sCId;
    }

    public void setsCId(String sCId) {
        this.sCId = sCId;
    }

    public String getFunctionID() {
        return functionID;
    }

    public void setFunctionID(String functionID) {
        this.functionID = functionID;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }
}
