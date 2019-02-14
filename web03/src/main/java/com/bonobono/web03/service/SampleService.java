package com.bonobono.web03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonobono.web03.mapper.SampleMapper;
import com.bonobono.web03.vo.Sample;

@Service
public class SampleService {
	@Autowired 
	private SampleMapper sampleMapper;  //sampleMapper 인터페이스로부터 구현을 명령받았나?
	
	public List<Sample> getSampleList(){  
		List<Sample> list = sampleMapper.selectsampleList();
		return list;		
	}

	public List<Sample> getSampleOne(int sampleId){
		List<Sample> listOne = sampleMapper.selectSampleOne(sampleId);
		return listOne;	
	}
	
	public int addSample(String sampleName) {
		int result = 0;
		result = sampleMapper.insertSample(sampleName);
		
		return result;
	}
	
	public int removeSample(int sampleId) {
		int result = 0;
		result = sampleMapper.deleteSample(sampleId);
		return result;
	}
	
	public int modifySample(int sampleId, String sampleName) {
		int result = 0;
		result = sampleMapper.updateSample(sampleId, sampleName);
		return result;
	}
}
