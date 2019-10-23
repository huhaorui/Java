public class 日月神教 {
    String 姓名;
    String 性别;
    int 年龄;
    String 职务;

    static boolean isFather(日月神教 甲, 日月神教 乙) {
        return 甲.姓名.equals("任我行") && 乙.姓名.equals("任盈盈");
    }
    static String relationShip(日月神教 甲,华山派 乙){
        return "我不要分了！";
    }
}
