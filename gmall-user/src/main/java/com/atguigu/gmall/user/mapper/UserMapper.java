package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    List<UmsMember> selectAllUser();
}


