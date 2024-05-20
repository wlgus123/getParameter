package hs.kr.study.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");

        System.out.println("<test2>");
        System.out.println("data1: " + a);
        System.out.println("data2: " + b);
        System.out.println("data3: " + c);

        return "test2";
    }

    @GetMapping("/test3")
    public String test3(WebRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");

        System.out.println("<test3>");
        System.out.println("data1: " + a);
        System.out.println("data2: " + b);
        System.out.println("data3: " + c);

        return "test3";
    }

    @GetMapping("/test4")
    public String test4(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");

        System.out.println("<test4>");
        System.out.println("data1: " + a);
        System.out.println("data2: " + b);
        for(String str : c) {
            System.out.println("data3: " + str);
        }

        return "test4";
    }
}
