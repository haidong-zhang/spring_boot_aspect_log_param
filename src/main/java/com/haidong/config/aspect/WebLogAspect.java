//package com.haidong.config.aspect;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Aspect
//@Component
//public class WebLogAspect {
//	private static Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
//	
//	private final ObjectMapper mapper;
//
//	public WebLogAspect(ObjectMapper mapper) {
//		this.mapper = mapper;
//	}
//	
////	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
//	@Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
//	public void webLog(){
//		
//	}
//	
//	@Before("webLog()")
//	public void doBefore(JoinPoint joinPoint){
//		for(Object object : joinPoint.getArgs()){
//			if(object instanceof MultipartFile || object instanceof HttpServletRequest || object instanceof HttpServletResponse){
//				continue;
//			}
//			
//			try{
//				if(logger.isDebugEnabled()){
//					logger.debug(joinPoint.getTarget().getClass().getName() + "." + 
//				    joinPoint.getSignature().getName() + " : request Parameter : " + mapper.writeValueAsString(object));
//				}else{
//					logger.info(joinPoint.getTarget().getClass().getName() + "." + 
//						    joinPoint.getSignature().getName() + " : request Parameter : " + mapper.writeValueAsString(object));
//				}
//			}catch (Exception e){
//				e.printStackTrace();
//			}
//		}
//	}
//	@AfterReturning(returning = "response",pointcut = "webLog()")
//	public void doAfterReturning(Object response) throws JsonProcessingException{
//		if(response !=null) {
//			logger.info("response parameter : "+mapper.writeValueAsString(response));
//		}
//	}
//	
//}
