
package cn.edu.nju.jw.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-28T20:20:51.660+08:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "数据格式错误", targetNamespace = "http://jw.nju.edu.cn/schema")
public class DataFormatError extends Exception {
    
    private java.lang.String 数据格式错误;

    public DataFormatError() {
        super();
    }
    
    public DataFormatError(String message) {
        super(message);
    }
    
    public DataFormatError(String message, Throwable cause) {
        super(message, cause);
    }

    public DataFormatError(String message, java.lang.String 数据格式错误) {
        super(message);
        this.数据格式错误 = 数据格式错误;
    }

    public DataFormatError(String message, java.lang.String 数据格式错误, Throwable cause) {
        super(message, cause);
        this.数据格式错误 = 数据格式错误;
    }

    public java.lang.String getFaultInfo() {
        return this.数据格式错误;
    }
}
