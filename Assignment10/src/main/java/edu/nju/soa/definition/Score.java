
package edu.nju.soa.definition;

import edu.nju.soa.schema.tns.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Score", targetNamespace = "http://jw.nju.edu.cn/schema")
public interface Score {


    /**
     * Add score
     * @param courseScoreListTypeHolder Mode: in and out
     * @throws IdNotFoundException cannot find id
     * @throws ScoreTypeException score type error
     * @throws ScoreModifyException score modify error
     * @throws AuthorityException do not have authority
     */
    @WebMethod(action = "score/addScore")
    @RequestWrapper(localName = "addScore", targetNamespace = "http://jw.nju.edu.cn/schema", className = "cn.edu.nju.jw.schema.AddScoreType")
    @ResponseWrapper(localName = "modifyScore", targetNamespace = "http://jw.nju.edu.cn/schema", className = "cn.edu.nju.jw.schema.ModifyScoreType")
    @Action(input = "score/addScoreRequest", output = "score/addScoreResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "score/addScore/Fault/IdNotFoundException"),
        @FaultAction(className = ScoreTypeException.class, value = "score/addScore/Fault/ScoreTypeException"),
        @FaultAction(className = ScoreModifyException.class, value = "score/addScore/Fault/ScoreModifyException"),
        @FaultAction(className = AuthorityException.class, value = "score/addScore/Fault/AuthorityException")
    })
    void addScore(
            @WebParam(name = "课程成绩列表", targetNamespace = "http://jw.nju.edu.cn/schema", mode = WebParam.Mode.INOUT)
                    Holder<CourseScoreListType> courseScoreListTypeHolder)
        throws AuthorityException, IdNotFoundException, ScoreModifyException, ScoreTypeException
    ;

    /**
     * Get score
     * @param parameters student id
     * @return
     *     returns cn.edu.nju.jw.schema.CourseScoreListType
     * @throws IdNotFoundException cannot find id
     */
    @WebMethod(action = "score/getScore")
    @WebResult(name = "课程成绩列表", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "score/getScoreRequest", output = "score/getScoreResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "score/getScore/Fault/IdNotFoundException")
    })
    CourseScoreListType getScore(
            @WebParam(name = "学号", targetNamespace = "http://jw.nju.edu.cn/schema", partName = "parameters")
                    String parameters)
        throws IdNotFoundException
    ;

    /**
     * update score
     * @param parameters  score list
     * @throws IdNotFoundException cannot find id
     * @throws ScoreTypeException score type error
     * @throws ScoreModifyException score modify error
     * @throws AuthorityException do not have authority
     */
    @WebMethod(action = "score/modifyScore")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "score/modifyScoreRequest", output = "score/modifyScoreResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "score/modifyScore/Fault/IdNotFoundException"),
        @FaultAction(className = ScoreTypeException.class, value = "score/modifyScore/Fault/ScoreTypeException"),
        @FaultAction(className = ScoreModifyException.class, value = "score/modifyScore/Fault/ScoreModifyException"),
        @FaultAction(className = AuthorityException.class, value = "score/modifyScore/Fault/AuthorityException")
    })
    void modifyScore(
            @WebParam(name = "课程成绩列表", targetNamespace = "http://jw.nju.edu.cn/schema", mode = WebParam.Mode.INOUT, partName = "parameters")
                    Holder<CourseScoreListType> parameters)
        throws AuthorityException, IdNotFoundException, ScoreModifyException, ScoreTypeException
    ;

    /**
     * delete score
     * @param parameters  score list
     * @throws IdNotFoundException cannot find id
     * @throws ScoreTypeException score type error
     * @throws ScoreModifyException score modify error
     * @throws AuthorityException do not have authority
     */
    @WebMethod(action = "score/deleteScore")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "score/deleteScoreRequest", output = "score/deleteScoreResponse", fault = {
            @FaultAction(className = IdNotFoundException.class, value = "score/deleteScore/Fault/IdNotFoundException"),
            @FaultAction(className = ScoreTypeException.class, value = "score/deleteScore/Fault/ScoreTypeException"),
            @FaultAction(className = ScoreModifyException.class, value = "score/deleteScore/Fault/ScoreModifyException"),
            @FaultAction(className = AuthorityException.class, value = "score/deleteScore/Fault/AuthorityException")
    })
    void deleteScore(
            @WebParam(name = "课程成绩列表", targetNamespace = "http://jw.nju.edu.cn/schema", mode = WebParam.Mode.INOUT, partName = "parameters")
                    Holder<CourseScoreListType> parameters)
            throws AuthorityException, IdNotFoundException, ScoreModifyException, ScoreTypeException
    ;

}
