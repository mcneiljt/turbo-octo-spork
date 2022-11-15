package com.mcneilio.orc;

import org.apache.hadoop.hive.ql.exec.vector.BytesColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.orc.TypeDescription;

import java.nio.file.Path;
import java.util.ArrayList;
import org.json.JSONObject;

public class BufferedOrcWriter {

    BufferedOrcWriter(Path output, TypeDescription schema) {
        this.schema = schema;
        this.output = output;
        batch = schema.createRowBatch();
    }

    public void writeJSON(String json) {
        JSONObject in = new JSONObject(json);
    }

    private VectorizedRowBatch getBatch() {
        if (batch.size == batch.getMaxSize()) {
            batches.add(batch);
            batch = schema.createRowBatch();
            return batch;
        }
        return batch;
    }

    private final ArrayList<VectorizedRowBatch> batches = new ArrayList<>();
    private final TypeDescription schema;
    private final Path output;
    private VectorizedRowBatch batch;
}
