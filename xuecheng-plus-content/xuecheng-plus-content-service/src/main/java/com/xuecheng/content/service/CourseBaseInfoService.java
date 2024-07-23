package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;


public interface CourseBaseInfoService {



  public PageResult<CourseBase>  queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);



  CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);


 public CourseBaseInfoDto getCourseBaseInfo(Long courseId);

 public CourseBase getCourseBase(Long courseId);


 public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

}
