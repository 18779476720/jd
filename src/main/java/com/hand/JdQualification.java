package com.hand;
import okhttp3.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenglu
 */
public class JdQualification {
    public static String addQualification(String filePath,String url, String token, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        //下载文件
        downLoadFromUrl( businessChangeFile,businessChangeFileName,filePath);

        String businessChangeFilePath = filePath+businessChangeFileName;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String addQualification(String filePath,String url, String token, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);
        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);

        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String addQualification(String filePath,String url, String token, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile, String taxCertificateFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);
        String taxCertificateFileName =  typeFromUrl(taxCertificateFile);

        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);
        downLoadFromUrl(taxCertificateFile,taxCertificateFileName,filePath);


        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;
        String taxCertificateFilePath = filePath+taxCertificateFileName;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .addFormDataPart("taxCertificateFile", taxCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxCertificateFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String addQualification(String filePath,String url, String token, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile, String taxCertificateFile, String proxyStatementFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);
        String taxCertificateFileName =  typeFromUrl(taxCertificateFile);
        String proxyStatementFileName =  typeFromUrl(proxyStatementFile);
        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);
        downLoadFromUrl(taxCertificateFile,taxCertificateFileName,filePath);
        downLoadFromUrl(proxyStatementFile,proxyStatementFileName,filePath);

        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;
        String taxCertificateFilePath = filePath+taxCertificateFileName;
        String proxyStatementFilePath = filePath+proxyStatementFileName;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .addFormDataPart("taxCertificateFile", taxCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxCertificateFilePath)))
                    .addFormDataPart("proxyStatementFile", proxyStatementFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(proxyStatementFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    /**
     * 修改接口
     */

    public static String modifyQualification(String filePath,String url, String token, String vatId, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);

        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);


        String businessChangeFilePath = filePath+businessChangeFileName;
        System.out.println("businessChangeFilePath:"+businessChangeFilePath);

        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("vatId", vatId)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String modifyQualification(String filePath,String url, String token, String vatId, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);

        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);


        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;

        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("vatId", vatId)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String modifyQualification(String filePath,String url, String token, String vatId, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile, String taxCertificateFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);
        String taxCertificateFileName =  typeFromUrl(taxCertificateFile);

        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);
        downLoadFromUrl(taxCertificateFile,taxCertificateFileName,filePath);


        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;
        String taxCertificateFilePath = filePath+taxCertificateFileName;

        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("vatId", vatId)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .addFormDataPart("taxCertificateFile", taxCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxCertificateFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    public static String modifyQualification(String filePath,String url, String token, String vatId, String unitName, String regPhone, String taxpayerId, String depositBank, String regAddr, String bankAccout, String businessChangeFile, String taxpayerCertificateFile, String taxCertificateFile, String proxyStatementFile) throws IOException {
        String result = null;
        Response response = null;
        //下载文件
        //获取文件名
        String businessChangeFileName =  typeFromUrl(businessChangeFile);
        String taxpayerCertificateFileName =  typeFromUrl(taxpayerCertificateFile);
        String taxCertificateFileName =  typeFromUrl(taxCertificateFile);
        String proxyStatementFileName =  typeFromUrl(proxyStatementFile);
        //下载文件
        downLoadFromUrl(businessChangeFile,businessChangeFileName,filePath);
        downLoadFromUrl(taxpayerCertificateFile,taxpayerCertificateFileName,filePath);
        downLoadFromUrl(taxCertificateFile,taxCertificateFileName,filePath);
        downLoadFromUrl(proxyStatementFile,proxyStatementFileName,filePath);

        String businessChangeFilePath = filePath+businessChangeFileName;
        String taxpayerCertificateFilePath = filePath+taxpayerCertificateFileName;
        String taxCertificateFilePath = filePath+taxCertificateFileName;
        String proxyStatementFilePath = filePath+proxyStatementFileName;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("token", token)
                    .addFormDataPart("vatId", vatId)
                    .addFormDataPart("unitName", unitName)
                    .addFormDataPart("regPhone", regPhone)
                    .addFormDataPart("taxpayerId", taxpayerId)
                    .addFormDataPart("depositBank", depositBank)
                    .addFormDataPart("regAddr", regAddr)
                    .addFormDataPart("bankAccout", bankAccout)
                    .addFormDataPart("businessChangeFile", businessChangeFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(businessChangeFilePath)))
                    .addFormDataPart("taxpayerCertificateFile", taxpayerCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxpayerCertificateFilePath)))
                    .addFormDataPart("taxCertificateFile", taxCertificateFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(taxCertificateFilePath)))
                    .addFormDataPart("proxyStatementFile", proxyStatementFile,
                            RequestBody.create(MediaType.parse("application/octet-stream"),
                                    new File(proxyStatementFilePath)))
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .build();
            response = client.newCall(request).execute();
            result = response.body().string();
            System.out.println("jar包：try-response:" + result);
        } catch (Exception e) {
            System.out.println("jar包异常：" + e.toString());
            result = e.toString();
        } finally {
            System.out.println("jar包：finally-response:" + result);
        }
        return result;
    }

    /**
     * 从网络Url中下载文件
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static void downLoadFromUrl(String urlStr, String fileName, String savePath) throws IOException{
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdir();
        }
        File file = new File(saveDir+File.separator+fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if(fos!=null){
            fos.close();
        }
        if(inputStream!=null){
            inputStream.close();
        }


        System.out.println("info:"+url+" download success");
        System.out.println(file.getPath());

    }

    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }


    /**
     * 获取url中的参数
     *
     * @param url
     * @param name
     * @return
     */
    public static String getUrlParameterReg(String url, String name) {
        Map<String, String> mapRequest = new HashMap();
        String strUrlParam = truncateUrlPage(url);
        if (strUrlParam == null) {
            return "";
        }
        //每个键值为一组
        String[] arrSplit = strUrlParam.split("[&]");
        for (String strSplit : arrSplit) {
            String[] arrSplitEqual = strSplit.split("[=]");
            //解析出键值
            if (arrSplitEqual.length > 1) {
                //正确解析
                mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);
            } else if (!arrSplitEqual[0].equals("")) {
                //只有参数没有值，不加入
                mapRequest.put(arrSplitEqual[0], "");
            }
        }
        return mapRequest.get(name);
    }

    /**
     * 去掉url中的路径，留下请求参数部分
     *
     * @param strURL url地址
     * @return url请求参数部分
     */
    private static String truncateUrlPage(String strURL) {
        String strAllParam = null;
        strURL = strURL.trim();
        String[] arrSplit = strURL.split("[?]");
        if (strURL.length() > 1) {
            if (arrSplit.length > 1) {
                if (arrSplit[1] != null) {
                    strAllParam = arrSplit[1];
                }
            }
        }
        return strAllParam;
    }

    private static String suffixFromFileName(String fileName) {
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        return fileType;
    }
    /**
     * 获取文件后缀
     *
     * @param url
     * @return
     */
    private static String suffixFromUrl(String url) {
        String nonPramStr = url.substring(0, url.indexOf("?") != -1 ? url.indexOf("?") : url.length());
        String fileName = nonPramStr.substring(nonPramStr.lastIndexOf("/") + 1);
        return suffixFromFileName(fileName);
    }
    /**
     * 从url中剥离出文件名
     *
     * @param url 格式如：http://keking.ufile.ucloud.com.cn/20171113164107_月度绩效表模板(新).xls?UCloudPublicKey=ucloudtangshd@weifenf.com14355492830001993909323&Expires=&Signature=I D1NOFtAJSPT16E6imv6JWuq0k=
     * @return
     */
    public static String getFileNameFromURL(String url) {
        // 因为url的参数中可能会存在/的情况，所以直接url.lastIndexOf("/")会有问题
        // 所以先从？处将url截断，然后运用url.lastIndexOf("/")获取文件名
        String noQueryUrl = url.substring(0, url.indexOf("?") != -1 ? url.indexOf("?") : url.length());
        String fileName = noQueryUrl.substring(noQueryUrl.lastIndexOf("/") + 1);
        return fileName;
    }
    public static String typeFromUrl(String url) {
        String fileName;
        String suffix;
        String fullFileName = getUrlParameterReg(url, "fullfilename");
        //没有后缀时启用，使用包  import org.springframework.util.StringUtils;
//        if (!StringUtils.isEmpty(fullFileName)) {
//            fileName = fullFileName;
//            suffix = suffixFromFileName(fileName);
//        } else {
//            fileName = getFileNameFromURL(url);
//            suffix = suffixFromUrl(url);
//        }
        fileName = fullFileName;

        return fileName;
    }
    public static String getsuffixFromUrl(String url) {
        String fileName;
        String suffix;
        String fullFileName = getUrlParameterReg(url, "fullfilename");
        //没有后缀时启用，使用包  import org.springframework.util.StringUtils;
//        if (!StringUtils.isEmpty(fullFileName)) {
//            fileName = fullFileName;
//            suffix = suffixFromFileName(fileName);
//        } else {
//            fileName = getFileNameFromURL(url);
//            suffix = suffixFromUrl(url);
//        }
        fileName = fullFileName;
        suffix = suffixFromFileName(fileName);

        return suffix;
    }

}
