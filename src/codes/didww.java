package codes;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class didww {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {

        String encrypted_filesUrl ="https://sandbox-api.didww.com/v3/" + "encrypted_files";
        String response = null;
        String fingerPrint = "c24c8711fed0fb9df377d4dad6090038063eec27:::d8919eb961da809e4d597f5c072e04383055e219";
        String fileName = "E:\\REVEsoft\\ktbilling\\src\\encryption\\encrypted_files\\doc.pdf.enc";
        String description = "test";
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(encrypted_filesUrl);
        httppost.setHeader("Api-Key", "2ypzbhxyv8y0661t1dnc9uep928sk3r8");
        httppost.setHeader("X-DIDWW-API-Version", "2021-04-19");
        httppost.setHeader("Accept", "application/vnd.api+json");

        try {
            FileBody bin = new FileBody(new File(fileName));
            MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart("encrypted_files[encryption_fingerprint]", new StringBody(fingerPrint));
            reqEntity.addPart("encrypted_files[items][][description]", new StringBody(description));
            reqEntity.addPart("encrypted_files[items][][file]", bin);


            httppost.setEntity(reqEntity);
            System.out.println("Requesting : " + httppost.getRequestLine());
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httppost, responseHandler);
            System.out.println("responseBody : " + responseBody);

        } catch (ClientProtocolException e) {

        } finally {
            httpclient.getConnectionManager().shutdown();
        }
    }
}
