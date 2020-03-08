package pers.ly.thread;

import java.util.*;

public class ShowMeBug {
    public static void main(String[] args) {
        new ShowMeBug().test();
    }

    public void test(){
        ShowMeBug showMeBug = new ShowMeBug();
        List<ScoreVo> scoreList = showMeBug.getScoreList();
        for (ScoreVo scoreVo: scoreList){

        }
        // TODO 请编写代码实现题目要求
    }
    public List<ScoreVo> getScoreList() {
        List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
        scoreList.add(new ScoreVo("张三", "语文", 80));
        scoreList.add(new ScoreVo("张三", "物理", 76));
        scoreList.add(new ScoreVo("李四", "语文", 78));
        scoreList.add(new ScoreVo("茅十八", "英语", 65));
        scoreList.add(new ScoreVo("李四", "数学", 88));
        scoreList.add(new ScoreVo("李四", "物理", 87));
        scoreList.add(new ScoreVo("王五", "语文", 67));
        scoreList.add(new ScoreVo("张三", "数学", 76));
        scoreList.add(new ScoreVo("李四", "英语", 89));
        scoreList.add(new ScoreVo("王五", "数学", 65));
        scoreList.add(new ScoreVo("赵六", "物理", 95));
        scoreList.add(new ScoreVo("王五", "英语", 78));
        scoreList.add(new ScoreVo("王五", "物理", 65));
        scoreList.add(new ScoreVo("赵六", "语文", 89));
        scoreList.add(new ScoreVo("赵六", "英语", 87));
        scoreList.add(new ScoreVo("黄七", "语文", 78));
        scoreList.add(new ScoreVo("黄七", "数学", 65));
        scoreList.add(new ScoreVo("刘八", "英语", 87));
        scoreList.add(new ScoreVo("张三", "英语", 56));
        scoreList.add(new ScoreVo("黄七", "物理", 76));
        scoreList.add(new ScoreVo("刘八", "数学", 89));
        scoreList.add(new ScoreVo("黄七", "英语", 98));
        scoreList.add(new ScoreVo("刘八", "语文", 56));
        scoreList.add(new ScoreVo("刘八", "物理", 76));
        scoreList.add(new ScoreVo("钱九", "语文", 88));
        scoreList.add(new ScoreVo("钱九", "数学", 67));
        scoreList.add(new ScoreVo("茅十八", "数学", 43));
        scoreList.add(new ScoreVo("钱九", "英语", 75));
        scoreList.add(new ScoreVo("茅十八", "语文", 45));
        scoreList.add(new ScoreVo("茅十八", "物理", 56));

        return scoreList;
    }
    class ScoreVo {
        public String studentName;
        public String courseName;
        public double score;

        public ScoreVo(String studentName, String courseName, double score){
            this.studentName = studentName;
            this.courseName = courseName;
            this.score = score;
        }

        public String toString(){
            return this.studentName + "\t" + this.courseName + "\t" + this.score;
        }
    }
}
