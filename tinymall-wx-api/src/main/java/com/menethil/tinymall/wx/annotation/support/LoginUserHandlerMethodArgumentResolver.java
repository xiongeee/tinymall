package com.menethil.tinymall.wx.annotation.support;

import com.menethil.tinymall.wx.annotation.LoginUser;
import com.menethil.tinymall.wx.service.UserTokenManager;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    // 小程序请求需要登录的页面时，Header 必须附带 TOKEN
    public static final String LOGIN_TOKEN_TINYMALL_KEY = "X-Tinymall-Token";
    public static final String LOGIN_TOKEN_LITEMALL_KEY = "X-Linymall-Token";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(Integer.class) && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {

        String token = request.getHeader(LOGIN_TOKEN_TINYMALL_KEY);

        if (token == null || token.isEmpty()) {
            token = request.getHeader(LOGIN_TOKEN_LITEMALL_KEY);
            if (token == null || token.isEmpty())
                return null;
        }

        return UserTokenManager.getUserId(token);
    }
}
