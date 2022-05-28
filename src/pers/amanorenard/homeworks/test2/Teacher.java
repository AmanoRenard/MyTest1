package pers.amanorenard.homeworks.test2;

class Teacher {
    public void checkScore(int score) {
        if (score>100 || score < 0) {
            try {
                throw new ScoreException("你给出的分数不正确，必须在0~100之间");
            } catch (ScoreException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("分数正确");
        }
    }

    public void checkScore2(int score) throws Exception{
        if (score>100 || score < 0) {
            throw new ScoreException("你给出的分数不正确，必须在0~100之间");
        } else {
            System.out.println("分数正确");
        }
    }
}
