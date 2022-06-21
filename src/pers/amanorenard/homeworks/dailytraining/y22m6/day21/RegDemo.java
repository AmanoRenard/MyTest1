package pers.amanorenard.homeworks.dailytraining.y22m6.day21;

public class RegDemo extends Simpl. Chinese {
    public static void main(String[] args) {

        Register reg = new Register();

        输出("------------------开始------------------");

        输出("1. 登录IKUN账号，但IKUN不存在：");
        reg.logIn("IKUN", "WoAiKUN1314");

        输出("2. 创建一个账号“CaiXuKun”，但账号已存在：");
        reg.signUp("CaiXuKun","233333");

        输出("3. 登录CaiXuKun账号，但密码错误：");
        reg.logIn("CaiXuKun", "jinitaimei");

        输出("4. 登录CaiXuKun账号，密码正确");
        reg.logIn("CaiXuKun", "233333");

        输出("5. 创建未注册的账号LuBenWei：");
        reg.signUp("55_Kai", "lbwnb666");

        输出("6. 再次注册LuBenWei：");
        reg.signUp("55_Kai", "lbwnb666");

        输出("------------------结束------------------");

        reg.exit();
    }
}
