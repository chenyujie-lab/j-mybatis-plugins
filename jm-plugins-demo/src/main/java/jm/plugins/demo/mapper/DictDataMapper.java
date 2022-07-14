package jm.plugins.demo.mapper;

import jm.plugins.demo.entity.DictData;

import java.util.List;

public interface DictDataMapper {
    List<DictData> listDictDataByType(List<String> typeList);
}
