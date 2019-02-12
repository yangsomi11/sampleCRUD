package com.bonobono.web03.vo;


public class Sample {
	private int sampleId;//sample.sample_id (클레스안에 컬럼)
	private String sampleName; //sample클레스내에  sample_name컬럼
	
	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	@Override
	public String toString() {
		return "sample [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
	}
	
}
