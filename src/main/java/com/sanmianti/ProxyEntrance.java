package com.sanmianti;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description MBG Proxy 入口
 * @Author sanmianti
 * @Date 2020/7/12 0:08
 */
public class ProxyEntrance {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(new ProgressCallback() {
            public void introspectionStarted(int totalTasks) {

            }

            public void generationStarted(int totalTasks) {

            }

            public void saveStarted(int totalTasks) {

            }

            public void startTask(String taskName) {
                System.out.println("taskName:" + taskName);
            }

            public void done() {
                System.out.println("done");
            }

            public void checkCancel() {

            }
        });
    }

}
