package com.app.biz.cassandra;

public class CqlConfig {

	private String keySpace;
    private String readConsistency;
    private String writeConsistency;
    private String entityPackages;
    private boolean nosqlOn = true;
    private boolean beanValidation = true;

    public String getKeySpace() {
        return keySpace;
    }

    public void setKeySpace(String keySpace) {
        this.keySpace = keySpace;
    }

    public String getReadConsistency() {
        return readConsistency;
    }

    public void setReadConsistency(String readConsistency) {
        this.readConsistency = readConsistency;
    }

    public String getWriteConsistency() {
        return writeConsistency;
    }

    public void setWriteConsistency(String writeConsistency) {
        this.writeConsistency = writeConsistency;
    }
    public String getEntityPackages() {
        return entityPackages;
    }

    public void setEntityPackages(String entityPackages) {
        this.entityPackages = entityPackages;
    }

    public boolean isNosqlOn() {
        return nosqlOn;
    }

    public void setNosqlOn(boolean nosqlOn) {
        this.nosqlOn = nosqlOn;
    }

    public boolean isBeanValidation() {
        return beanValidation;
    }

    public void setBeanValidation(boolean beanValidation) {
        this.beanValidation = beanValidation;
    }
}
