package com.xuecheng.content.service.impl;

import com.xuecheng.content.mapper.CourseCategoryMapper;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
 @Service
public class CourseCategoryServiceImpl implements CourseCategoryService {

 @Autowired
 CourseCategoryMapper courseCategoryMapper;


 @Override
 public List<CourseCategoryTreeDto> queryTreeNodes() {
  return courseCategoryMapper.selectTreeNodes();
 }
}
