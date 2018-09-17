package com.example.quickstart.controller;


import com.example.quickstart.dao.SspaiDAO;
import com.example.quickstart.entity.Sspai;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Air on 2018/9/10.
 */
@Controller
public class
SspaiController {
    @Resource
    private SspaiDAO sspaiDAO;
//    private CardDAO cardDAO;

    @GetMapping("/sspai")
    public String sspai(ModelMap map){
        List<Sspai> sspaiList = sspaiDAO.getSspais();
        map.addAttribute("sspaiList",sspaiList);
//        List<Card> cardList = cardDAO.getCards();
//        map.addAttribute("cardList",cardList)
        return "sspai";
    }
}
