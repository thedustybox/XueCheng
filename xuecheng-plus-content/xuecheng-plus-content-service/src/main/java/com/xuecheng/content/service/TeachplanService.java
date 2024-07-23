package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.BindTeachplanMediaDto;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.TeachplanMedia;

import java.util.List;


public interface TeachplanService {

 public List<TeachplanDto> findTeachplanTree(Long courseId);

 public void saveTeachplan(SaveTeachplanDto dto);

 public TeachplanMedia associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);

}
