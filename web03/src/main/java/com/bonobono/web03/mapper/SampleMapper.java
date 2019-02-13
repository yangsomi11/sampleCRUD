package com.bonobono.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	//목록
	List<Sample> selectsampleList();
	//추가
	int insertSample(String sampleName);
	//삭제
	int deleteSample(int sampleId);
	
		
}

