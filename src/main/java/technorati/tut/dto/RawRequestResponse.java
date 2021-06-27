package technorati.tut.dto;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.data.RecordBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.AvroGenerated;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.avro.specific.SpecificRecordBuilderBase;

@AvroGenerated
public class RawRequestResponse extends SpecificRecordBase implements SpecificRecord {
    private static final long serialVersionUID = -436415709981861056L;
    public static final Schema SCHEMA$ = (new Parser()).parse("{\"type\":\"record\",\"name\":\"RawRequestResponse\",\"namespace\":\"technorati.tut.dto\",\"fields\":[{\"name\":\"req_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"requestId\"},{\"name\":\"ts\",\"type\":\"long\",\"doc\":\"timestamp\"},{\"name\":\"req_cookies\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"req_headers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"req_qs\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"req_payload\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"req_uri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resp_cookies\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resp_headers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resp_payload\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resp_status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<RawRequestResponse> ENCODER;
    private static final BinaryMessageDecoder<RawRequestResponse> DECODER;
    /** @deprecated */
    @Deprecated
    public String req_id;
    /** @deprecated */
    @Deprecated
    public long ts;
    /** @deprecated */
    @Deprecated
    public Map<String, String> req_cookies;
    /** @deprecated */
    @Deprecated
    public Map<String, String> req_headers;
    /** @deprecated */
    @Deprecated
    public Map<String, String> req_qs;
    /** @deprecated */
    @Deprecated
    public String req_payload;
    /** @deprecated */
    @Deprecated
    public String req_uri;
    /** @deprecated */
    @Deprecated
    public Map<String, String> resp_cookies;
    /** @deprecated */
    @Deprecated
    public Map<String, String> resp_headers;
    /** @deprecated */
    @Deprecated
    public String resp_payload;
    /** @deprecated */
    @Deprecated
    public String resp_status;
    private static final DatumWriter<RawRequestResponse> WRITER$;
    private static final DatumReader<RawRequestResponse> READER$;

    public static Schema getClassSchema() {
        return SCHEMA$;
    }

    public static BinaryMessageDecoder<RawRequestResponse> getDecoder() {
        return DECODER;
    }

    public static BinaryMessageDecoder<RawRequestResponse> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder(MODEL$, SCHEMA$, resolver);
    }

    public ByteBuffer toByteBuffer() throws IOException {
        return ENCODER.encode(this);
    }

    public static RawRequestResponse fromByteBuffer(ByteBuffer b) throws IOException {
        return (RawRequestResponse)DECODER.decode(b);
    }

    public RawRequestResponse() {
    }

    public RawRequestResponse(String req_id, Long ts, Map<String, String> req_cookies, Map<String, String> req_headers, Map<String, String> req_qs, String req_payload, String req_uri, Map<String, String> resp_cookies, Map<String, String> resp_headers, String resp_payload, String resp_status) {
        this.req_id = req_id;
        this.ts = ts;
        this.req_cookies = req_cookies;
        this.req_headers = req_headers;
        this.req_qs = req_qs;
        this.req_payload = req_payload;
        this.req_uri = req_uri;
        this.resp_cookies = resp_cookies;
        this.resp_headers = resp_headers;
        this.resp_payload = resp_payload;
        this.resp_status = resp_status;
    }

    public Schema getSchema() {
        return SCHEMA$;
    }

    public Object get(int field$) {
        switch(field$) {
            case 0:
                return this.req_id;
            case 1:
                return this.ts;
            case 2:
                return this.req_cookies;
            case 3:
                return this.req_headers;
            case 4:
                return this.req_qs;
            case 5:
                return this.req_payload;
            case 6:
                return this.req_uri;
            case 7:
                return this.resp_cookies;
            case 8:
                return this.resp_headers;
            case 9:
                return this.resp_payload;
            case 10:
                return this.resp_status;
            default:
                throw new AvroRuntimeException("Bad index");
        }
    }

    public void put(int field$, Object value$) {
        switch(field$) {
            case 0:
                this.req_id = (String)value$;
                break;
            case 1:
                this.ts = (Long)value$;
                break;
            case 2:
                this.req_cookies = (Map)value$;
                break;
            case 3:
                this.req_headers = (Map)value$;
                break;
            case 4:
                this.req_qs = (Map)value$;
                break;
            case 5:
                this.req_payload = (String)value$;
                break;
            case 6:
                this.req_uri = (String)value$;
                break;
            case 7:
                this.resp_cookies = (Map)value$;
                break;
            case 8:
                this.resp_headers = (Map)value$;
                break;
            case 9:
                this.resp_payload = (String)value$;
                break;
            case 10:
                this.resp_status = (String)value$;
                break;
            default:
                throw new AvroRuntimeException("Bad index");
        }

    }

    public String getReqId() {
        return this.req_id;
    }

    public void setReqId(String value) {
        this.req_id = value;
    }

    public Long getTs() {
        return this.ts;
    }

    public void setTs(Long value) {
        this.ts = value;
    }

    public Map<String, String> getReqCookies() {
        return this.req_cookies;
    }

    public void setReqCookies(Map<String, String> value) {
        this.req_cookies = value;
    }

    public Map<String, String> getReqHeaders() {
        return this.req_headers;
    }

    public void setReqHeaders(Map<String, String> value) {
        this.req_headers = value;
    }

    public Map<String, String> getReqQs() {
        return this.req_qs;
    }

    public void setReqQs(Map<String, String> value) {
        this.req_qs = value;
    }

    public String getReqPayload() {
        return this.req_payload;
    }

    public void setReqPayload(String value) {
        this.req_payload = value;
    }

    public String getReqUri() {
        return this.req_uri;
    }

    public void setReqUri(String value) {
        this.req_uri = value;
    }

    public Map<String, String> getRespCookies() {
        return this.resp_cookies;
    }

    public void setRespCookies(Map<String, String> value) {
        this.resp_cookies = value;
    }

    public Map<String, String> getRespHeaders() {
        return this.resp_headers;
    }

    public void setRespHeaders(Map<String, String> value) {
        this.resp_headers = value;
    }

    public String getRespPayload() {
        return this.resp_payload;
    }

    public void setRespPayload(String value) {
        this.resp_payload = value;
    }

    public String getRespStatus() {
        return this.resp_status;
    }

    public void setRespStatus(String value) {
        this.resp_status = value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Builder other) {
        return new Builder(other);
    }

    public static Builder newBuilder(RawRequestResponse other) {
        return new Builder(other);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    public void readExternal(ObjectInput in) throws IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    static {
        ENCODER = new BinaryMessageEncoder(MODEL$, SCHEMA$);
        DECODER = new BinaryMessageDecoder(MODEL$, SCHEMA$);
        WRITER$ = MODEL$.createDatumWriter(SCHEMA$);
        READER$ = MODEL$.createDatumReader(SCHEMA$);
    }

    public static class Builder extends SpecificRecordBuilderBase<RawRequestResponse> implements RecordBuilder<RawRequestResponse> {
        private String req_id;
        private long ts;
        private Map<String, String> req_cookies;
        private Map<String, String> req_headers;
        private Map<String, String> req_qs;
        private String req_payload;
        private String req_uri;
        private Map<String, String> resp_cookies;
        private Map<String, String> resp_headers;
        private String resp_payload;
        private String resp_status;

        private Builder() {
            super(RawRequestResponse.SCHEMA$);
        }

        private Builder(Builder other) {
            super(other);
            if (isValidValue(this.fields()[0], other.req_id)) {
                this.req_id = (String)this.data().deepCopy(this.fields()[0].schema(), other.req_id);
                this.fieldSetFlags()[0] = true;
            }

            if (isValidValue(this.fields()[1], other.ts)) {
                this.ts = (Long)this.data().deepCopy(this.fields()[1].schema(), other.ts);
                this.fieldSetFlags()[1] = true;
            }

            if (isValidValue(this.fields()[2], other.req_cookies)) {
                this.req_cookies = (Map)this.data().deepCopy(this.fields()[2].schema(), other.req_cookies);
                this.fieldSetFlags()[2] = true;
            }

            if (isValidValue(this.fields()[3], other.req_headers)) {
                this.req_headers = (Map)this.data().deepCopy(this.fields()[3].schema(), other.req_headers);
                this.fieldSetFlags()[3] = true;
            }

            if (isValidValue(this.fields()[4], other.req_qs)) {
                this.req_qs = (Map)this.data().deepCopy(this.fields()[4].schema(), other.req_qs);
                this.fieldSetFlags()[4] = true;
            }

            if (isValidValue(this.fields()[5], other.req_payload)) {
                this.req_payload = (String)this.data().deepCopy(this.fields()[5].schema(), other.req_payload);
                this.fieldSetFlags()[5] = true;
            }

            if (isValidValue(this.fields()[6], other.req_uri)) {
                this.req_uri = (String)this.data().deepCopy(this.fields()[6].schema(), other.req_uri);
                this.fieldSetFlags()[6] = true;
            }

            if (isValidValue(this.fields()[7], other.resp_cookies)) {
                this.resp_cookies = (Map)this.data().deepCopy(this.fields()[7].schema(), other.resp_cookies);
                this.fieldSetFlags()[7] = true;
            }

            if (isValidValue(this.fields()[8], other.resp_headers)) {
                this.resp_headers = (Map)this.data().deepCopy(this.fields()[8].schema(), other.resp_headers);
                this.fieldSetFlags()[8] = true;
            }

            if (isValidValue(this.fields()[9], other.resp_payload)) {
                this.resp_payload = (String)this.data().deepCopy(this.fields()[9].schema(), other.resp_payload);
                this.fieldSetFlags()[9] = true;
            }

            if (isValidValue(this.fields()[10], other.resp_status)) {
                this.resp_status = (String)this.data().deepCopy(this.fields()[10].schema(), other.resp_status);
                this.fieldSetFlags()[10] = true;
            }

        }

        private Builder(RawRequestResponse other) {
            super(RawRequestResponse.SCHEMA$);
            if (isValidValue(this.fields()[0], other.req_id)) {
                this.req_id = (String)this.data().deepCopy(this.fields()[0].schema(), other.req_id);
                this.fieldSetFlags()[0] = true;
            }

            if (isValidValue(this.fields()[1], other.ts)) {
                this.ts = (Long)this.data().deepCopy(this.fields()[1].schema(), other.ts);
                this.fieldSetFlags()[1] = true;
            }

            if (isValidValue(this.fields()[2], other.req_cookies)) {
                this.req_cookies = (Map)this.data().deepCopy(this.fields()[2].schema(), other.req_cookies);
                this.fieldSetFlags()[2] = true;
            }

            if (isValidValue(this.fields()[3], other.req_headers)) {
                this.req_headers = (Map)this.data().deepCopy(this.fields()[3].schema(), other.req_headers);
                this.fieldSetFlags()[3] = true;
            }

            if (isValidValue(this.fields()[4], other.req_qs)) {
                this.req_qs = (Map)this.data().deepCopy(this.fields()[4].schema(), other.req_qs);
                this.fieldSetFlags()[4] = true;
            }

            if (isValidValue(this.fields()[5], other.req_payload)) {
                this.req_payload = (String)this.data().deepCopy(this.fields()[5].schema(), other.req_payload);
                this.fieldSetFlags()[5] = true;
            }

            if (isValidValue(this.fields()[6], other.req_uri)) {
                this.req_uri = (String)this.data().deepCopy(this.fields()[6].schema(), other.req_uri);
                this.fieldSetFlags()[6] = true;
            }

            if (isValidValue(this.fields()[7], other.resp_cookies)) {
                this.resp_cookies = (Map)this.data().deepCopy(this.fields()[7].schema(), other.resp_cookies);
                this.fieldSetFlags()[7] = true;
            }

            if (isValidValue(this.fields()[8], other.resp_headers)) {
                this.resp_headers = (Map)this.data().deepCopy(this.fields()[8].schema(), other.resp_headers);
                this.fieldSetFlags()[8] = true;
            }

            if (isValidValue(this.fields()[9], other.resp_payload)) {
                this.resp_payload = (String)this.data().deepCopy(this.fields()[9].schema(), other.resp_payload);
                this.fieldSetFlags()[9] = true;
            }

            if (isValidValue(this.fields()[10], other.resp_status)) {
                this.resp_status = (String)this.data().deepCopy(this.fields()[10].schema(), other.resp_status);
                this.fieldSetFlags()[10] = true;
            }

        }

        public String getReqId() {
            return this.req_id;
        }

        public Builder setReqId(String value) {
            this.validate(this.fields()[0], value);
            this.req_id = value;
            this.fieldSetFlags()[0] = true;
            return this;
        }

        public boolean hasReqId() {
            return this.fieldSetFlags()[0];
        }

        public Builder clearReqId() {
            this.req_id = null;
            this.fieldSetFlags()[0] = false;
            return this;
        }

        public Long getTs() {
            return this.ts;
        }

        public Builder setTs(long value) {
            this.validate(this.fields()[1], value);
            this.ts = value;
            this.fieldSetFlags()[1] = true;
            return this;
        }

        public boolean hasTs() {
            return this.fieldSetFlags()[1];
        }

        public Builder clearTs() {
            this.fieldSetFlags()[1] = false;
            return this;
        }

        public Map<String, String> getReqCookies() {
            return this.req_cookies;
        }

        public Builder setReqCookies(Map<String, String> value) {
            this.validate(this.fields()[2], value);
            this.req_cookies = value;
            this.fieldSetFlags()[2] = true;
            return this;
        }

        public boolean hasReqCookies() {
            return this.fieldSetFlags()[2];
        }

        public Builder clearReqCookies() {
            this.req_cookies = null;
            this.fieldSetFlags()[2] = false;
            return this;
        }

        public Map<String, String> getReqHeaders() {
            return this.req_headers;
        }

        public Builder setReqHeaders(Map<String, String> value) {
            this.validate(this.fields()[3], value);
            this.req_headers = value;
            this.fieldSetFlags()[3] = true;
            return this;
        }

        public boolean hasReqHeaders() {
            return this.fieldSetFlags()[3];
        }

        public Builder clearReqHeaders() {
            this.req_headers = null;
            this.fieldSetFlags()[3] = false;
            return this;
        }

        public Map<String, String> getReqQs() {
            return this.req_qs;
        }

        public Builder setReqQs(Map<String, String> value) {
            this.validate(this.fields()[4], value);
            this.req_qs = value;
            this.fieldSetFlags()[4] = true;
            return this;
        }

        public boolean hasReqQs() {
            return this.fieldSetFlags()[4];
        }

        public Builder clearReqQs() {
            this.req_qs = null;
            this.fieldSetFlags()[4] = false;
            return this;
        }

        public String getReqPayload() {
            return this.req_payload;
        }

        public Builder setReqPayload(String value) {
            this.validate(this.fields()[5], value);
            this.req_payload = value;
            this.fieldSetFlags()[5] = true;
            return this;
        }

        public boolean hasReqPayload() {
            return this.fieldSetFlags()[5];
        }

        public Builder clearReqPayload() {
            this.req_payload = null;
            this.fieldSetFlags()[5] = false;
            return this;
        }

        public String getReqUri() {
            return this.req_uri;
        }

        public Builder setReqUri(String value) {
            this.validate(this.fields()[6], value);
            this.req_uri = value;
            this.fieldSetFlags()[6] = true;
            return this;
        }

        public boolean hasReqUri() {
            return this.fieldSetFlags()[6];
        }

        public Builder clearReqUri() {
            this.req_uri = null;
            this.fieldSetFlags()[6] = false;
            return this;
        }

        public Map<String, String> getRespCookies() {
            return this.resp_cookies;
        }

        public Builder setRespCookies(Map<String, String> value) {
            this.validate(this.fields()[7], value);
            this.resp_cookies = value;
            this.fieldSetFlags()[7] = true;
            return this;
        }

        public boolean hasRespCookies() {
            return this.fieldSetFlags()[7];
        }

        public Builder clearRespCookies() {
            this.resp_cookies = null;
            this.fieldSetFlags()[7] = false;
            return this;
        }

        public Map<String, String> getRespHeaders() {
            return this.resp_headers;
        }

        public Builder setRespHeaders(Map<String, String> value) {
            this.validate(this.fields()[8], value);
            this.resp_headers = value;
            this.fieldSetFlags()[8] = true;
            return this;
        }

        public boolean hasRespHeaders() {
            return this.fieldSetFlags()[8];
        }

        public Builder clearRespHeaders() {
            this.resp_headers = null;
            this.fieldSetFlags()[8] = false;
            return this;
        }

        public String getRespPayload() {
            return this.resp_payload;
        }

        public Builder setRespPayload(String value) {
            this.validate(this.fields()[9], value);
            this.resp_payload = value;
            this.fieldSetFlags()[9] = true;
            return this;
        }

        public boolean hasRespPayload() {
            return this.fieldSetFlags()[9];
        }

        public Builder clearRespPayload() {
            this.resp_payload = null;
            this.fieldSetFlags()[9] = false;
            return this;
        }

        public String getRespStatus() {
            return this.resp_status;
        }

        public Builder setRespStatus(String value) {
            this.validate(this.fields()[10], value);
            this.resp_status = value;
            this.fieldSetFlags()[10] = true;
            return this;
        }

        public boolean hasRespStatus() {
            return this.fieldSetFlags()[10];
        }

        public Builder clearRespStatus() {
            this.resp_status = null;
            this.fieldSetFlags()[10] = false;
            return this;
        }

        public RawRequestResponse build() {
            try {
                RawRequestResponse record = new RawRequestResponse();
                record.req_id = this.fieldSetFlags()[0] ? this.req_id : (String)this.defaultValue(this.fields()[0]);
                record.ts = this.fieldSetFlags()[1] ? this.ts : (Long)this.defaultValue(this.fields()[1]);
                record.req_cookies = this.fieldSetFlags()[2] ? this.req_cookies : (Map)this.defaultValue(this.fields()[2]);
                record.req_headers = this.fieldSetFlags()[3] ? this.req_headers : (Map)this.defaultValue(this.fields()[3]);
                record.req_qs = this.fieldSetFlags()[4] ? this.req_qs : (Map)this.defaultValue(this.fields()[4]);
                record.req_payload = this.fieldSetFlags()[5] ? this.req_payload : (String)this.defaultValue(this.fields()[5]);
                record.req_uri = this.fieldSetFlags()[6] ? this.req_uri : (String)this.defaultValue(this.fields()[6]);
                record.resp_cookies = this.fieldSetFlags()[7] ? this.resp_cookies : (Map)this.defaultValue(this.fields()[7]);
                record.resp_headers = this.fieldSetFlags()[8] ? this.resp_headers : (Map)this.defaultValue(this.fields()[8]);
                record.resp_payload = this.fieldSetFlags()[9] ? this.resp_payload : (String)this.defaultValue(this.fields()[9]);
                record.resp_status = this.fieldSetFlags()[10] ? this.resp_status : (String)this.defaultValue(this.fields()[10]);
                return record;
            } catch (Exception var2) {
                throw new AvroRuntimeException(var2);
            }
        }
    }
}

