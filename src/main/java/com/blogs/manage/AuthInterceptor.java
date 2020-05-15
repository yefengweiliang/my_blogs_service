package com.blogs.manage;
import com.blogs.common.utils.SpringContextUtils;
import com.blogs.entity.pojo.UserInfo;
import com.blogs.feign.UserAuthFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 权限拦截器
 *
 * @author wanghongshen
 * @date 2020-05-14
 */
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {

    private UserAuthFeignClient userAuthFeignClient= (UserAuthFeignClient) SpringContextUtils.getBeanByClass(UserAuthFeignClient.class);

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        String userId = path.split("/")[2];
        UserInfo userInfo = new UserInfo();
        userInfo.setId(Long.parseLong(userId));
        Map result = (Map) userAuthFeignClient.getUserInfo(userInfo);
        List respVO = (List) result.get("respVo");
        Map res = (Map)respVO.get(0);
        if(Integer.parseInt(res.get("total").toString()) >0){
            return true;
        }else{
            log.error("鉴权没通过");
            return false;
        }
    }
    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
