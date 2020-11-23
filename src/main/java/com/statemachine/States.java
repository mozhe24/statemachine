package com.statemachine;

/**
 * @author morker
 */

public enum States {
    // 等待提交
    WAITING_FOR_SUBMIT,
    // 等待 TL 审批
    WAITING_FOR_TL_APPROVE,
    // 等待 DM 审批
    WAITING_FOR_DM_APPROVE,
    // 等待 HR 备案
    WAITING_FOR_HR_RECORD,
    // 流程结束
    END,
}
