package com.b4pay.order.dao;

import com.b4pay.order.entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface LotteryDao extends JpaRepository<Lottery,Integer>, JpaSpecificationExecutor<Lottery> {

    @Query(value = "from Lottery where period = ?1")
    public Lottery queryByPeriod(Integer period);
}
