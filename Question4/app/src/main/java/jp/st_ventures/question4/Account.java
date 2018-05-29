package jp.st_ventures.question4;

import java.util.logging.Logger;

/*
 * Accountクラスコンストラクタを作成し、インターン(internship)の参加者の一覧をコンソールにログを出力する。
 * Accountクラスには、下記のプロパティとメソッドを定義する。
 *
 * 【プロパティ】
 * 氏名：文字列型
 * 年齢：整数型
 * 性別：文字列型
 * 得意な言語：文字列型
 *
 * 【メソッド】
 * 男性の場合、「○○君は、○○が得意な○○歳です。」と表示する。
 * 女性の場合、「○○さんは、○○が得意な○○歳です。」と表示する。
 *
 * なお、Encapsulation条件を満たす。
 */
public class Account {

    // プロパティ(カプセル化のため、全てprivateとする)
    private String  name;
    private int     age;
    private String  gender;
    private String  customerLanguage;

    public Account(String name,int age,String gender,String customerLanguage){
        // nullチェックを行う。
        if(name==null || gender==null || customerLanguage==null) {
            Exception; //TODO
            return;
        }else{
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.customerLanguage = customerLanguage;
        }
    }

    public void outputLogOfStatus(){
        Logger logger = Logger.getLogger("Account");
        if(gender == "男性") {
            logger.info(String.format("%s君は、%sが得意な%d歳です。",name,customerLanguage,age));
        }else if(gender == "女性"){
            logger.info(String.format("%sさんは、%sが得意な%d歳です。",name,customerLanguage,age));
        }else{ // どちらでもなければそもそも異常なのでエラーを出す。
            Exception;  // TODO
        }
    }

}
