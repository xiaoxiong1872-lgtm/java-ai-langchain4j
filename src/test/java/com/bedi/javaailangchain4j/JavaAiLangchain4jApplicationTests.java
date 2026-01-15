package com.bedi.javaailangchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.community.model.dashscope.WanxImageModel;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.output.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class JavaAiLangchain4jApplicationTests {

    @Autowired
    private OpenAiChatModel model;

    @Test
    public void test() {
        System.out.println("开始测试...");
        try {
//            String answer = model.chat("下班后去哪吃喝玩乐,我在北京朝阳区高家园,帮我推荐一些高性价比的地方和活动");
            String answer = model.chat("你是什么模型");
            System.out.println("模型创建成功:" + answer);
        } catch (Exception e) {
            System.err.println("调用模型出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //    @Autowired
//    private ChatLanguageModel chatModel;
    @Autowired
    private OllamaChatModel ollamaChatModel;

    @Test
    public void test2() {
        System.out.println("开始测试...");
        try {
            String answer = ollamaChatModel.chat("你是谁");
            System.out.println("模型创建成功:" + answer);
        } catch (Exception e) {
            System.err.println("调用模型出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 通义千问大模型
     */
    @Autowired
    private QwenChatModel qwenChatModel;

    @Test
    public void testDashScopeQwen() {
        //向模型提问
        String answer = qwenChatModel.chat("领导不作为怎么办 又没有产品人员,而我是个外包,只有我一个后端开发");
        //输出结果
        System.out.println(answer);
    }

    @Test
    public void testDashScopeWanx() {
        WanxImageModel wanxImageModel = WanxImageModel.builder()
                .modelName("wanx2.1-t2i-plus")
                .apiKey("sk-ed16b2f0fcbc45fdb7ded8e6cf9f4128")
                .build();
//        Response<Image> response = wanxImageModel.generate("奇幻森林精灵：在一片弥漫着轻柔薄雾的\n" +
//                "                古老森林深处，阳光透过茂密枝叶洒下金色光斑。一位身材娇小、长着透明薄翼的精灵少女站在一朵硕大的蘑菇上。她\n" +
//                "                有着海藻般的绿色长发，发间点缀着蓝色的小花，皮肤泛着珍珠般的微光。身上穿着由翠绿树叶和白色藤蔓编织而成的\n" +
//                "                连衣裙，手中捧着一颗散发着柔和光芒的水晶球，周围环绕着五彩斑斓的蝴蝶，脚下是铺满苔藓的地面，蘑菇和蕨类植\n" +
//                "                物丛生，营造出神秘而梦幻的氛围。");
        Response<Image> response = wanxImageModel.generate("英雄联盟的天使,庄重神圣不可侵犯,全身散发着金色光芒");
        System.out.println(response.content().url());
    }
}
