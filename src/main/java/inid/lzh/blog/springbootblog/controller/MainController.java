package inid.lzh.blog.springbootblog.controller;

import inid.lzh.blog.springbootblog.core.Result;
import inid.lzh.blog.springbootblog.core.ResultGenerator;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {


    @RequestMapping("/")
    public ModelAndView  testApiUpData(ModelMap modelMap){
        modelMap.addAttribute("title","这是我的标题");
        modelMap.addAttribute("name","这是我的名称");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


    @RequestMapping("/test")
    public Result<String> test(){
      return ResultGenerator.genFailResult("嘎嘎嘎");
    }




}
