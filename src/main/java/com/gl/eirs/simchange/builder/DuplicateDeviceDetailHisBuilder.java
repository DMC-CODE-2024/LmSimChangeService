package com.gl.eirs.simchange.builder;

import com.gl.eirs.simchange.entity.app.DuplicateDeviceDetail;
import com.gl.eirs.simchange.entity.app.DuplicateDeviceDetailHis;
import lombok.Builder;
import org.springframework.stereotype.Component;

import static com.gl.eirs.simchange.constants.Constants.remarks;

@Component
@Builder
public class DuplicateDeviceDetailHisBuilder {
    public DuplicateDeviceDetailHis forInsert(DuplicateDeviceDetail duplicateDeviceDetail ,int operation, String action) {

        DuplicateDeviceDetailHis duplicateDeviceDetailHis = new DuplicateDeviceDetailHis();
        duplicateDeviceDetailHis.setImsi(duplicateDeviceDetail.getImsi());
        duplicateDeviceDetailHis.setId(duplicateDeviceDetail.getId());
        duplicateDeviceDetailHis.setImei(duplicateDeviceDetail.getImei());
        duplicateDeviceDetailHis.setMsisdn(duplicateDeviceDetail.getMsisdn());
        duplicateDeviceDetailHis.setCreatedOn(duplicateDeviceDetail.getCreatedOn());
        duplicateDeviceDetailHis.setModifiedOn(duplicateDeviceDetail.getModifiedOn());
        duplicateDeviceDetailHis.setFileName(duplicateDeviceDetail.getFileName());
        duplicateDeviceDetailHis.setEdrTime(duplicateDeviceDetail.getEdrTime());
        duplicateDeviceDetailHis.setStatus(duplicateDeviceDetail.getStatus());
        duplicateDeviceDetailHis.setOperator(duplicateDeviceDetail.getOperator());
        duplicateDeviceDetailHis.setExpiryDate(duplicateDeviceDetail.getExpiryDate());
        duplicateDeviceDetailHis.setUpdateBy(duplicateDeviceDetail.getUpdateBy());
        duplicateDeviceDetailHis.setTransactionId(duplicateDeviceDetail.getTransactionId());
        duplicateDeviceDetailHis.setReminderStatus(duplicateDeviceDetail.getReminderStatus());
        duplicateDeviceDetailHis.setSuccessCount(duplicateDeviceDetail.getSuccessCount());
        duplicateDeviceDetailHis.setFailCount(duplicateDeviceDetail.getFailCount());
        duplicateDeviceDetailHis.setActualImei(duplicateDeviceDetail.getActualImei());
        duplicateDeviceDetailHis.setAction(action);
        duplicateDeviceDetailHis.setActionRemark(remarks);
        duplicateDeviceDetailHis.setRemarks(duplicateDeviceDetail.getRemarks());
        duplicateDeviceDetailHis.setRedmineTktId(duplicateDeviceDetail.getRedmineTktId());
        return duplicateDeviceDetailHis;
    }
}
