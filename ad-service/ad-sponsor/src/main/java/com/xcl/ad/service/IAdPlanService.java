package com.xcl.ad.service;

import com.xcl.ad.entity.AdPlan;
import com.xcl.ad.exception.AdException;
import com.xcl.ad.vo.AdPlanGetRequest;
import com.xcl.ad.vo.AdPlanRequest;
import com.xcl.ad.vo.AdPlanResponse;

import java.util.List;

public interface IAdPlanService {

    /**
     * 创建推广计划
     *
     * @param request 请求
     * @return 推广计划
     * @throws AdException 异常
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 获取推广计划
     *
     * @param request 请求
     * @return 推广计划
     * @throws AdException 异常
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;


    /**
     * 修改推广计划
     *
     * @param request 请求
     * @return 推广计划
     * @throws AdException 异常
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除推广计划
     *
     * @param request 请求
     * @throws AdException 异常
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}