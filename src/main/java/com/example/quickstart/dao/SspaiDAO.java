package com.example.quickstart.dao;

import com.example.quickstart.entity.Sspai;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Air on 2018/9/10.
 */
@Configuration
@Data
public class SspaiDAO {
    public List<Sspai> getSspais(){
        Sspai[] sspais = {
                new Sspai("1.png","Tp","1天前",
                        "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1",
                        "如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。",
                        "11.png",25,15),
                new Sspai("2.png","化学心情下2","09月07日",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？",
                        "12.png",67,42),
                new Sspai("3.png","洛世","09月05日",
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全",
                        "Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。",
                        "13.png",65,76),
        };
        List<Sspai> sspaiList = Arrays.asList(sspais);
        return sspaiList;
    }
}
