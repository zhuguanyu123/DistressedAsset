package com.example.demo.controller.creditInfoControl;

import com.aliyun.djcloud.common.base.ResultResponse;
import com.example.demo.dao.CreditInfoMapper;
import com.example.demo.pojo.iouMainDao;
import com.example.demo.service.CreditInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javax.annotation.Resource;

@RestController
@RequestMapping("/CreditInfo")
public class CreditInfoControl {

    @Resource
    private CreditInfoService creditInfoService;
    @GetMapping(value = "getCreditList")
    @ApiOperation(value = "获得债权信息列表", notes = "获得债权信息列表")
    public ResultResponse getCreditList(@RequestParam("size") int size , @RequestParam("current") int current){

        Page<iouMainDao> voPage = creditInfoService.getCreditList(size,current);

        return ResultResponse.successJson(voPage);
    }
}
