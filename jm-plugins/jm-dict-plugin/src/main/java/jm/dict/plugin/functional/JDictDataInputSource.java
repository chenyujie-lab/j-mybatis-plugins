package jm.dict.plugin.functional;

import jm.dict.plugin.entity.JDictBase;
import java.util.List;

@FunctionalInterface
public interface JDictDataInputSource<T extends JDictBase> {
    List<T> doQuery(List<String> dictTypeList);
}
