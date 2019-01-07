package io.fast.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.RandomUtil;

/**
 * @author: dj
 * @Date: 2019/1/7 09:09
 * @Description: 批量生成测试文件
 */

public class FileTestUtil {

    public static void createFile() {
        var path = "E:\\ftpRead\\a";
        for (var i = 0; i < 100; i++) {
            var fileName = UUID.randomUUID();
            var newFilePath = path + System.getProperty("file.separator") + fileName + ".txt";
            FileWriter writer = new FileWriter(newFilePath);
            StringBuffer content = new StringBuffer();
            for (var a = 0; a < RandomUtil.randomInt(1000); a++) {
                content.append(UUID.randomUUID().toString());
            }
            writer.write(content.toString());
        }
    }

    public static void main(String[] args) {
        createFile();
    }

}
