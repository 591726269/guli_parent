package com.bysj.eduservice.controller;


import com.bysj.eduservice.entity.EduTeacher;
import com.bysj.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author wuzuopeng
 * @since 2021-06-24
 */
@Api(description="讲师管理")
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    //查询讲师表所有数据
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> eduTeacherList = eduTeacherService.list(null);
        return eduTeacherList;
    }

    //讲师逻辑删除
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("{id}")
    public boolean removeTeacher(@ApiParam(name = "id", value = "讲师ID", required = true) @PathVariable String id){
        boolean flag = eduTeacherService.removeById(id);
        return false;
    }


}

