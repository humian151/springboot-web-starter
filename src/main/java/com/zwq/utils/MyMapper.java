package com.zwq.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 父Mapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
}
