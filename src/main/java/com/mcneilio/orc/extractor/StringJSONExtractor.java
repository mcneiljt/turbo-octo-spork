package com.mcneilio.orc.extractor;

import org.apache.hadoop.hive.ql.exec.vector.BytesColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.json.JSONObject;

public class StringJSONExtractor implements JSONExtractor {
    public void extractJSON(String key, int position, JSONObject in, ColumnVector out) {
        BytesColumnVector o = (BytesColumnVector) out;
        byte[] data = in.getString(key).getBytes();
        o.setVal(position, data);
    }
}
