package com.bonobono.web03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web03.vo.Sample;

@Mapper
public interface SampleMapper {
	List<Sample> selectsampleList();
	int insertSample(String sampleName);
}

