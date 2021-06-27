import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import technorati.tut.dto.RawRequestResponse;

import java.nio.ByteBuffer;

public class HDFSSequenceFileReader {
    public static void main(String[] args) throws Exception {
        Configuration config =  new Configuration();
        //Path path = new Path("/Users/rajkumar.natarajan/data/rivr/OAPN/2021/06/26/05/BUFM0231-RANATA.local.1624686965122");
        Path path = new Path("./src/main/resources/BUFM0231-RANATA.local.1624686965122");

        SequenceFile.Reader reader = new SequenceFile.Reader(FileSystem.get(config), path, config);
        WritableComparable key = (WritableComparable) reader.getKeyClass().newInstance();
        Writable value = (Writable) reader.getValueClass().newInstance();
        while (reader.next(key, value)) {
            // do some thing
            System.out.println("key = " + key + "\t value = " + value.getClass());
            byte[] bytes = ((BytesWritable) value).getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            RawRequestResponse reqresp = RawRequestResponse.fromByteBuffer(buffer);
            System.out.println(reqresp);
        }
            reader.close();
    }
}
