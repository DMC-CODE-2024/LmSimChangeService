package com.gl.eirs.simchange.repository.app;

import com.gl.eirs.simchange.entity.app.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlackListRepository extends JpaRepository<BlackList, Integer> {
    List<BlackList> findAllByImsi(String imsi);

}
