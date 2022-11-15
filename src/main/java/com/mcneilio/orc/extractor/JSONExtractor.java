package com.mcneilio.orc.extractor;

import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.json.JSONObject;

public interface JSONExtractor {
    void extractJSON(String key, int position, JSONObject in, ColumnVector out);
}
