package com.shenruihai.export.holiday.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SQLUtils {

    public static void main1(String[] args) {
        long begin= 0;
        long end = 19048445;

        long incremental = 200000;

        while (true){


            if(begin>end)return;

//            String sql_auth_pay = "update auth_pay set compress_bk_info = compress(bk_info) where bk_info is not null and compress_bk_info is null and id> "+begin+" and id<"+ (begin+ + incremental) +" ;";
//            System.out.println(sql_auth_pay);

//            String sql_bk_request = "update bk_request set compress_bk_info = compress(bk_info), update_time=update_time where bk_info is not null and compress_bk_info is null and id> "+begin+" and id<"+ (begin+ + incremental) +" ;";
//            System.out.println(sql_bk_request);

            String sql_business_accounting = "update business_accounting set compress_bk_info = compress(bk_info), update_time=update_time where bk_info is not null and compress_bk_info is null and id> "+begin+" and id<"+ (begin+ + incremental) +" ;";
            System.out.println(sql_business_accounting);

            begin += incremental;
        }


    }

    public static void main(String[] args) throws IOException {
        for(int i=0; i<100000;i++){
            String sql = "INSERT INTO compress_info set `bk_info` = '{\"bmdBkInfoList\": [{\"desc\": \"还款记账_BMD_RS_20210330141722UStqB9\", \"businessId\": \"还款记账_BMD_RS_20210330141722UStqB9"+i+"\", \"businessType\": \"消费分期\", \"bmdBkEntryList\": [{\"type\": 1, \"phase\": 3, \"amount\": 748, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"ASSET\", \"subCatalog\": \"ACCOUNTS_RECEIVABLE\", \"groupDisplayName\": \"贷款本金\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|3\"}, {\"type\": 1, \"phase\": 3, \"amount\": 96, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"利息收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|3\"}, {\"type\": 1, \"phase\": 3, \"amount\": 161, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"服务费收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|3\"}, {\"type\": 1, \"phase\": 4, \"amount\": 770, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"ASSET\", \"subCatalog\": \"ACCOUNTS_RECEIVABLE\", \"groupDisplayName\": \"贷款本金\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|4\"}, {\"type\": 1, \"phase\": 4, \"amount\": 88, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"利息收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|4\"}, {\"type\": 1, \"phase\": 4, \"amount\": 147, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"服务费收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141625QryHt8\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141625QryHt8|4\"}, {\"type\": 1, \"phase\": 3, \"amount\": 748, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"ASSET\", \"subCatalog\": \"ACCOUNTS_RECEIVABLE\", \"groupDisplayName\": \"贷款本金\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|3\"}, {\"type\": 1, \"phase\": 3, \"amount\": 96, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"利息收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|3\"}, {\"type\": 1, \"phase\": 3, \"amount\": 161, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"服务费收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|3\"}, {\"type\": 1, \"phase\": 4, \"amount\": 770, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"ASSET\", \"subCatalog\": \"ACCOUNTS_RECEIVABLE\", \"groupDisplayName\": \"贷款本金\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|4\"}, {\"type\": 1, \"phase\": 4, \"amount\": 88, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"利息收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|4\"}, {\"type\": 1, \"phase\": 4, \"amount\": 147, \"appKey\": null, \"channel\": null, \"subject\": \"ZHIDUXIAODAI\", \"domainNo\": null, \"identity\": null, \"merchant\": null, \"bmdBkGroup\": {\"catalog\": \"REVENUE\", \"subCatalog\": \"INTEREST_INCOME\", \"groupDisplayName\": \"服务费收入/已收\"}, \"contractNo\": \"BMD_V2_20210330141626JFkxv9\", \"debitCredit\": \"CREDIT\", \"bmdBkAccountName\": \"BMD_V2_20210330141626JFkxv9|4\"}]}], \"associatedBkId\": \"BMD_RS_20210330141722UStqB9\"}';";
            SQLUtils.createFile(sql);
        }

   }

    public static void createFile(String input) throws IOException {
        //设置文件路径
        String filePath = "/Users/shenruihai/";
        File dir = new File(filePath);
        // 一、检查放置文件的文件夹路径是否存在，不存在则创建
        if (!dir.exists()) {
            dir.mkdirs();// mkdirs创建多级目录
        }
        File checkFile = new File(filePath + "/compress.sql");
        FileWriter fw = null;
        try {
            // 二、检查目标文件是否存在，不存在则创建
            if (!checkFile.exists()) {
                checkFile.createNewFile();// 创建目标文件
            }
            // 三、向目标文件中写入内容
            // FileWriter(File file, boolean append)，append为true时为追加模式，false或缺省则为覆盖模式
            fw = new FileWriter(checkFile, true);
            fw.write(input+"\r\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fw)
                fw.close();
        }
    }

}
