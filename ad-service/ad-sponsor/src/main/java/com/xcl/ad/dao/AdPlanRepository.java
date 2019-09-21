package com.xcl.ad.dao;
/* *
 *@author: xuchunlin
 *@createTime: 09/06/2019/16:08
 *@description: null
 */

import com.xcl.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdPlanRepository extends JpaRepository<AdPlan,Long> {

    AdPlan findByIdAndUserId(Long id,Long userId);

    List<AdPlan> findAllByIdAndUserId(List<Long> ids,Long userId);

    AdPlan findByUserIdAndPlanName(Long userId,String planName);

    List<AdPlan> findAllByPlanStatus(Integer planStatus);
}
