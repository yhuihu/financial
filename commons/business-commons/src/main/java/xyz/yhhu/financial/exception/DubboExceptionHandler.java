package xyz.yhhu.financial.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.remoting.TimeoutException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tiger
 * @date 2020-06-27
 * @see xyz.yhhu.financial.exception
 **/
@Slf4j
@ControllerAdvice
public class DubboExceptionHandler {
    @ExceptionHandler(TimeoutException.class)
    @ResponseBody
    public ResponseEntity dubboTimeOut(TimeoutException e) {
        return new ResponseEntity<>("服务器请求超时，请刷新页面后重试!", HttpStatus.OK);
    }
}
