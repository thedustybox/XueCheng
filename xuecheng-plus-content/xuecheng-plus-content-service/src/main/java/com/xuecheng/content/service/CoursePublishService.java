package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CoursePreviewDto;
import com.xuecheng.content.model.po.CoursePublish;

import java.io.File;


public interface CoursePublishService {


  public CoursePreviewDto getCoursePreviewInfo(Long courseId);

  public void commitAudit(Long companyId,Long courseId);

  public void publish(Long companyId,Long courseId);

  public File generateCourseHtml(Long courseId);

  public void  uploadCourseHtml(Long courseId, File file);

  //创建索引
  public Boolean saveCourseIndex(Long courseId) ;

  public CoursePublish getCoursePublish(Long courseId);

}
