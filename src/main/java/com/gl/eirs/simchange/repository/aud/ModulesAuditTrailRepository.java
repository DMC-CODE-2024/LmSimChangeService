package com.gl.eirs.simchange.repository.aud;

import com.gl.eirs.simchange.entity.aud.ModulesAuditTrail;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ModulesAuditTrailRepository extends JpaRepository<ModulesAuditTrail, Integer>, JpaSpecificationExecutor<ModulesAuditTrail> {


    @Modifying
    @Transactional
    @Query("update ModulesAuditTrail u set u.statusCode=:statusCode, u.status=:status, u.errorMessage=:errMsg, u.count=:count, u.failureCount=:failureCount, u.executionTime=:executionTime, u.modifiedOn=:modifiedOn where u.id=:id")
    void updateModulesAudit_1(@Param("statusCode") int statusCode, @Param("status") String status, @Param("errMsg") String errMsg,
                              @Param("count") int count, @Param("failureCount") int failureCount,
                              @Param("executionTime") long executionTime, @Param("modifiedOn") LocalDateTime modifiedOn,
                              @Param("id") int id);

    default void updateModulesAudit(@Param("statusCode") int statusCode, @Param("status") String status, @Param("errMsg") String errMsg,
                                    @Param("count") int count, @Param("failureCount") int failureCount,
                                    @Param("executionTime") long executionTime, @Param("modifiedOn") LocalDateTime modifiedOn,
                                    @Param("id") int id) {
        updateModulesAudit_1(statusCode, status, errMsg, count == 0 ? count : count - 1, failureCount, executionTime, modifiedOn, id);
    }


}
///