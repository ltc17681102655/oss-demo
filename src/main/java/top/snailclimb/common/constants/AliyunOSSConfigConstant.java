package top.snailclimb.common.constants;

/**
 * @Author: SnailClimb
 * @Date: 2018/12/4 15:09
 * @Description: 阿里云OSS存储的相关常量配置.我这里通过常量类来配置的，当然你也可以通过.properties 配置文件来配置，
 * 然后利用 SpringBoot 的@ConfigurationProperties 注解来注入
 */
public class AliyunOSSConfigConstant {
    //私有构造方法 禁止该类初始化
    private AliyunOSSConfigConstant() {
    }

    //仓库名称
    public static final String BUCKE_NAME = "memory3334-bucket";
    //地域节点
    public static final String END_POINT = "oss-cn-shanghai.aliyuncs.com";
    //AccessKey ID
    public static final String AccessKey_ID = "LTAIROjhc5omNXHO";
    //Access Key Secret
    public static final String AccessKey_Secret = "ZsobZBj14WEROax4q0SbQ1q0drcvSz";
    //仓库中的某个文件夹
    public static final String FILE_HOST = "test";
}
