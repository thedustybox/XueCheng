package com.xuecheng.search.dto;

import lombok.Data;
import lombok.ToString;


 @Data
 @ToString
public class SearchCourseParamDto {

  //关键字
  private String keywords;

  //大分类
  private String mt;

  //小分类
  private String st;
  //难度等级
  private String grade;




}
