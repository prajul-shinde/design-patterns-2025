package com.omsai.design.patterns.behavioral.templatemethod;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    protected Task() {
        auditTrail = new AuditTrail();
    }

    protected void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
