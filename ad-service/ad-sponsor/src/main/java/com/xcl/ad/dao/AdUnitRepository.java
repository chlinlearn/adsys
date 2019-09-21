package com.xcl.ad.dao;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:16
 * @Description: null
 * @Version: 1.0
 */

import com.xcl.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdUnitRepository extends JpaRepository<AdUnit,Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
