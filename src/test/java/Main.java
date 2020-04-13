

import com.hand.JdQualification;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * @author chenglu
 */
public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        HashMap hashMap = new HashMap();
        hashMap.put("token", "MsVLiw8mumZUrhIN68WqCsLH7");
        hashMap.put("unitName", "测试");
        String url = "https://bizapi.jd.com/api/qualifications/addQualification";
        String token = "MsVLiw8mumZUrhIN68WqCsLH7";
        String unitName = "北京世纪城物业管理有限公司福州分公司";
        String regPhone = "0591-88681517";
        String taxpayerId = "913501003993648768";
        String depositBank = "测试";
        String regAddr = "测试";
        String bankAccout = "422169461483";
        String businessChangeFile = "C:\\Users\\11079\\Desktop\\1586328829(1).png";
//        String a = JdQualification.modifyQualification("C:\\Users\\11079\\eclipse-workspace\\program\\webRoot/attached/jd/",url, token, unitName, regPhone, taxpayerId, depositBank, regAddr, bankAccout, businessChangeFile);
//        System.out.println(a);
        String b = JdQualification.typeFromUrl("http://10.1.8.76:10000/atm_download_free.svc?attachment_id=1&fullfilename=sdf.txt");
        String c = JdQualification.getsuffixFromUrl("http://10.1.8.76:10000/atm_download_free.svc?attachment_id=1&fullfilename=sdf.txt");
        System.out.println(b);
        System.out.println(c);
    }


}
