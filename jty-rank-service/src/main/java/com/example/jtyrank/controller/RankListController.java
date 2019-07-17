package com.example.jtyrank.controller;

import com.example.jtykpi.support.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yeting
 * @Date: 2019/7/12 14:00
 */
@RestController
@RequestMapping(value = "/kpi")
public class RankListController {
    /**
     *
     * @return
     */
    @GetMapping("/infor")
    public Result getCurrentUser() {
        return Result.success("123");
    }
}
