package com.qfedu.dao;

import com.qfedu.entity.Note;

public interface NoteMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Note record);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
}