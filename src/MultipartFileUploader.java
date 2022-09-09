import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This program demonstrates a usage of the MultipartUtility class.
 * @author www.codejava.net
 *
 */
public class MultipartFileUploader {

    public static void main(String[] args) {

        String charset = "UTF-8";
        File uploadFile1 = new File("E:\\REVEsoft\\ktbilling\\src\\encryption\\encrypted_files\\doc.pdf.enc");

        String requestURL = "https://sandbox-api.didww.com/v3/encrypted_files";


        try {
            MultipartUtility multipart = new MultipartUtility(requestURL, charset);

            multipart.addHeaderField("Accept", "application/vnd.api+json");
            multipart.addHeaderField("Api-Key", "2ypzbhxyv8y0661t1dnc9uep928sk3r8");
            multipart.addHeaderField("X-DIDWW-API-Version", "2021-04-19");

            multipart.addFormField("encrypted_files[encryption_fingerprint]", "c24c8711fed0fb9df377d4dad6090038063eec27:::d8919eb961da809e4d597f5c072e04383055e219");
            multipart.addFormField("encrypted_files[items][][description]", "test");

            multipart.addFilePart("encrypted_files[items][][file]", uploadFile1);

            List<String> response = multipart.finish();

            System.out.println("SERVER REPLIED:");

            for (String line : response) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}