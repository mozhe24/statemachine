package com.statemachine;

/**
 * @author morker
 */

public enum Events {
    // 提交申请
    SUBMIT,
    // WAITING_FOR_TL_APPROVE 审批
    TL_AGREE,
    // WAITING_FOR_TL_APPROVE 驳回
    TL_REJECT,
    // 部门经理审批
    DM_AGREE,
    // 部门经理驳回
    DM_REJECT,
    // WAITING_FOR_HR_RECORD 备案
    HR_RECORD,
}