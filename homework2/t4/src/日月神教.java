public class 日月神教 {
    String 姓名;
    String 性别;
    int 年龄;
    String 职务;

    日月神教(String _姓名, String _性别, int _年龄, String _职务) {
        姓名 = _姓名;
        性别 = _性别;
        年龄 = _年龄;
        职务 = _职务;
    }

    static boolean isFather(日月神教 甲, 日月神教 乙) {
        return 甲.姓名.equals("任我行") && 乙.姓名.equals("任盈盈");
    }

    static String relationShip(日月神教 甲, 华山派 乙) {
        switch (甲.姓名) {
            case "任我行":
                switch (乙.姓名) {
                    case "令狐冲":return "翁婿";
                    case "岳灵珊":
                    case "林平之":
                }
            case "任盈盈":
                switch (乙.姓名) {
                    case "令狐冲":return "夫妻";
                    case "岳灵珊":return "情敌";
                    case "林平之":
                }
            case "东方不败":
                switch (乙.姓名) {
                    case "令狐冲":return "敌人";
                    case "岳灵珊":
                    case "林平之":
                }
        }
        return "未知关系";
    }
}

class test {
    public static void main(String[] args) {
        日月神教 任我行 = new 日月神教("任我行", "男", 40, "日月神教教主");
        日月神教 任盈盈 = new 日月神教("任盈盈", "女", 20, "继任日月神教教主，修好各派");
        日月神教 东方不败 = new 日月神教("东方不败", "男", 50, "日月神教光明右使、副教主、教主");
        华山派 令狐冲 = new 华山派("令狐冲", "男", 30, "大弟子");
        华山派 岳灵珊 = new 华山派("岳灵珊", "女", 20, "小师妹");
        华山派 林平之 = new 华山派("林平之", "男", 18, "小师弟");
        if (日月神教.isFather(任我行, 任盈盈)) System.out.println("任我行和任盈盈是父女关系");
        if (日月神教.isFather(任我行, 东方不败)) System.out.println("任我行和东方不败是父女关系");
        if (日月神教.isFather(任盈盈, 任我行)) System.out.println("任盈盈和任我行是父女关系");
        if (日月神教.isFather(任盈盈, 东方不败)) System.out.println("任盈盈和东方不败是父女关系");
        if (日月神教.isFather(东方不败, 任盈盈)) System.out.println("东方不败和任盈盈是父女关系");
        if (日月神教.isFather(东方不败, 任我行)) System.out.println("东方不败和任我行是父女关系");
        System.out.println("任我行和令狐冲是" + 日月神教.relationShip(任我行, 令狐冲));
        System.out.println("任我行和岳灵珊是" +日月神教.relationShip(任我行, 岳灵珊));
        System.out.println("任我行和林平之是" +日月神教.relationShip(任我行, 林平之));
        System.out.println("任盈盈和令狐冲是" +日月神教.relationShip(任盈盈, 令狐冲));
        System.out.println("任盈盈和岳灵珊是" +日月神教.relationShip(任盈盈, 岳灵珊));
        System.out.println("任盈盈和林平之是" +日月神教.relationShip(任盈盈, 林平之));
        System.out.println("东方不败和令狐冲是" +日月神教.relationShip(东方不败, 令狐冲));
        System.out.println("东方不败和岳灵珊是" +日月神教.relationShip(东方不败, 岳灵珊));
        System.out.println("东方不败和林平之是" +日月神教.relationShip(东方不败, 林平之));
    }
}

