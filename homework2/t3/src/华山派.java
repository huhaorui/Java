class 华山派 {
    private String 姓名;
    private String 性别;
    private int 年龄;
    private String 辈分;

    华山派(String a, String b, int c, String d) {
        姓名 = a;
        性别 = b;
        年龄 = c;
        辈分 = d;
    }

    void isLover(华山派 甲) {
        if ((甲.姓名.equals("令狐冲") && 姓名.equals("岳灵珊")) || (甲.姓名.equals("岳灵珊") && 姓名.equals("令狐冲")))
            System.out.println(甲.姓名 + "和" + 姓名 + "曾经深深相爱着");
        else if ((甲.姓名.equals("林平之") && 姓名.equals("岳灵珊")) || (甲.姓名.equals("岳灵珊") && 姓名.equals("林平之")))
            System.out.println(甲.姓名 + "和" + 姓名 + "深深相爱着");
        else
            System.out.println(甲.姓名 + "和" + 姓名 + "这2个人没有爱情关系");
    }
}

class 华山派测试 {
    public static void main(String[] Args) {
        华山派 令狐冲 = new 华山派("令狐冲", "男", 30, "大弟子");
        华山派 岳灵珊 = new 华山派("岳灵珊", "女", 20, "小师妹");
        华山派 林平之 = new 华山派("林平之", "男", 18, "小师弟");
        令狐冲.isLover(岳灵珊);
        林平之.isLover(岳灵珊);
    }
}