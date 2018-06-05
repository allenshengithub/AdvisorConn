package alphabet.adviserconn.ImaginarySpace;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/4/14.
 */

public class Text4 implements Parcelable {

    /**
     * type : right_option
     * option_statement1 : 你好
     * answer_statement1 : $charpter1-2$
     * option_statement2 : 你也好
     * answer_statement2 : $sheet2$
     * option_question1 : 怎么了？
     * answer_question1 : $charpter1-2$
     * option_question2 : 你是？
     * answer_question2 : $sheet2$
     * option_surprise1 : 不好！
     * answer_surprise1 : 哦。。打扰了
     * option_surprise2 : 不是！
     * answer_surprise2 : 哦。。打扰了
     * option_ellipsis1 : 爱过
     * answer_ellipsis1 : 哦。。打扰了
     * option_ellipsis2 : 不买保险
     * answer_ellipsis2 : 哦。。打扰了
     * option_ellipsis3 : 不想了解
     * answer_ellipsis3 : 哦。。打扰了
     */

    private String type= "null";
    private String content= "null";//经过处理后再次赋值，确定最后显示的 文本

    private String left_single= "null";
    private String right_single= "null";
    private String right_click= "null";
    private String hero_image= "null";
    private String hero_voice= "null";

    private String option_statement1 = "null";
    private String answer_statement1= "null";
    private String option_statement2= "null";
    private String answer_statement2= "null";
    private String option_statement3= "null";
    private String answer_statement3= "null";
    private String option_statement4= "null";
    private String answer_statement4= "null";

    private String option_question1= "null";
    private String answer_question1= "null";
    private String option_question2= "null";
    private String answer_question2= "null";
    private String option_question3= "null";
    private String answer_question3= "null";
    private String option_question4= "null";
    private String answer_question4= "null";

    private String option_surprise1= "null";
    private String answer_surprise1= "null";
    private String option_surprise2= "null";
    private String answer_surprise2= "null";
    private String option_surprise3= "null";
    private String answer_surprise3= "null";
    private String option_surprise4= "null";
    private String answer_surprise4= "null";

    private String option_ellipsis1= "null";
    private String answer_ellipsis1= "null";
    private String option_ellipsis2= "null";
    private String answer_ellipsis2= "null";
    private String option_ellipsis3= "null";
    private String answer_ellipsis3= "null";
    private String option_ellipsis4= "null";
    private String answer_ellipsis4= "null";

    private String left_image = "null";
    private String left_voice = "null";


    private List<String> options = new ArrayList<>();
    private List<String> answers = new ArrayList<>();

    public List<String> getOptions() {
        return options;
    }

    public void setAnswers() {
        answers.add(answer_statement1);
        answers.add(answer_statement2);
        answers.add(answer_statement3);
        answers.add(answer_statement4);

        answers.add(answer_question1);
        answers.add(answer_question2);
        answers.add(answer_question3);
        answers.add(answer_question4);

        answers.add(answer_surprise1);
        answers.add(answer_surprise2);
        answers.add(answer_surprise3);
        answers.add(answer_surprise4);

        answers.add(answer_ellipsis1);
        answers.add(answer_ellipsis2);
        answers.add(answer_ellipsis3);
        answers.add(answer_ellipsis4);

    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setOptions() {
        options.add(option_statement1);
        options.add(option_statement2);
        options.add(option_statement3);
        options.add(option_statement4);

        options.add(option_question1);
        options.add(option_question2);
        options.add(option_question3);
        options.add(option_question4);

        options.add(option_surprise1);
        options.add(option_surprise2);
        options.add(option_surprise3);
        options.add(option_surprise4);

        options.add(option_ellipsis1);
        options.add(option_ellipsis2);
        options.add(option_ellipsis3);
        options.add(option_ellipsis4);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOption_statement1() {
        return option_statement1;
    }

    public void setOption_statement1(String option_statement1) {
        this.option_statement1 = option_statement1;
    }

    public String getAnswer_statement1() {
        return answer_statement1;
    }

    public void setAnswer_statement1(String answer_statement1) {
        this.answer_statement1 = answer_statement1;
    }

    public String getOption_statement2() {
        return option_statement2;
    }

    public void setOption_statement2(String option_statement2) {
        this.option_statement2 = option_statement2;
    }

    public String getAnswer_statement2() {
        return answer_statement2;
    }

    public void setAnswer_statement2(String answer_statement2) {
        this.answer_statement2 = answer_statement2;
    }

    public String getOption_question1() {
        return option_question1;
    }

    public void setOption_question1(String option_question1) {
        this.option_question1 = option_question1;
    }

    public String getAnswer_question1() {
        return answer_question1;
    }

    public void setAnswer_question1(String answer_question1) {
        this.answer_question1 = answer_question1;
    }

    public String getOption_question2() {
        return option_question2;
    }

    public void setOption_question2(String option_question2) {
        this.option_question2 = option_question2;
    }

    public String getAnswer_question2() {
        return answer_question2;
    }

    public void setAnswer_question2(String answer_question2) {
        this.answer_question2 = answer_question2;
    }

    public String getOption_surprise1() {
        return option_surprise1;
    }

    public void setOption_surprise1(String option_surprise1) {
        this.option_surprise1 = option_surprise1;
    }

    public String getAnswer_surprise1() {
        return answer_surprise1;
    }

    public void setAnswer_surprise1(String answer_surprise1) {
        this.answer_surprise1 = answer_surprise1;
    }

    public String getOption_surprise2() {
        return option_surprise2;
    }

    public void setOption_surprise2(String option_surprise2) {
        this.option_surprise2 = option_surprise2;
    }

    public String getAnswer_surprise2() {
        return answer_surprise2;
    }

    public void setAnswer_surprise2(String answer_surprise2) {
        this.answer_surprise2 = answer_surprise2;
    }

    public String getOption_ellipsis1() {
        return option_ellipsis1;
    }

    public void setOption_ellipsis1(String option_ellipsis1) {
        this.option_ellipsis1 = option_ellipsis1;
    }

    public String getAnswer_ellipsis1() {
        return answer_ellipsis1;
    }

    public void setAnswer_ellipsis1(String answer_ellipsis1) {
        this.answer_ellipsis1 = answer_ellipsis1;
    }

    public String getOption_ellipsis2() {
        return option_ellipsis2;
    }

    public void setOption_ellipsis2(String option_ellipsis2) {
        this.option_ellipsis2 = option_ellipsis2;
    }

    public String getAnswer_ellipsis2() {
        return answer_ellipsis2;
    }

    public void setAnswer_ellipsis2(String answer_ellipsis2) {
        this.answer_ellipsis2 = answer_ellipsis2;
    }

    public String getOption_ellipsis3() {
        return option_ellipsis3;
    }

    public void setOption_ellipsis3(String option_ellipsis3) {
        this.option_ellipsis3 = option_ellipsis3;
    }

    public String getAnswer_ellipsis3() {
        return answer_ellipsis3;
    }

    public void setAnswer_ellipsis3(String answer_ellipsis3) {
        this.answer_ellipsis3 = answer_ellipsis3;
    }

    public String getOption_statement3() {
        return option_statement3;
    }

    public void setOption_statement3(String option_statement3) {
        this.option_statement3 = option_statement3;
    }

    public String getAnswer_statement3() {
        return answer_statement3;
    }

    public void setAnswer_statement3(String answer_statement3) {
        this.answer_statement3 = answer_statement3;
    }

    public String getOption_statement4() {
        return option_statement4;
    }

    public void setOption_statement4(String option_statement4) {
        this.option_statement4 = option_statement4;
    }

    public String getAnswer_statement4() {
        return answer_statement4;
    }

    public void setAnswer_statement4(String answer_statement4) {
        this.answer_statement4 = answer_statement4;
    }

    public String getOption_question3() {
        return option_question3;
    }

    public void setOption_question3(String option_question3) {
        this.option_question3 = option_question3;
    }

    public String getAnswer_question3() {
        return answer_question3;
    }

    public void setAnswer_question3(String answer_question3) {
        this.answer_question3 = answer_question3;
    }

    public String getOption_question4() {
        return option_question4;
    }

    public void setOption_question4(String option_question4) {
        this.option_question4 = option_question4;
    }

    public String getAnswer_question4() {
        return answer_question4;
    }

    public void setAnswer_question4(String answer_question4) {
        this.answer_question4 = answer_question4;
    }

    public String getOption_surprise3() {
        return option_surprise3;
    }

    public void setOption_surprise3(String option_surprise3) {
        this.option_surprise3 = option_surprise3;
    }

    public String getAnswer_surprise3() {
        return answer_surprise3;
    }

    public void setAnswer_surprise3(String answer_surprise3) {
        this.answer_surprise3 = answer_surprise3;
    }

    public String getOption_surprise4() {
        return option_surprise4;
    }

    public void setOption_surprise4(String option_surprise4) {
        this.option_surprise4 = option_surprise4;
    }

    public String getAnswer_surprise4() {
        return answer_surprise4;
    }

    public void setAnswer_surprise4(String answer_surprise4) {
        this.answer_surprise4 = answer_surprise4;
    }

    public String getOption_ellipsis4() {
        return option_ellipsis4;
    }

    public void setOption_ellipsis4(String option_ellipsis4) {
        this.option_ellipsis4 = option_ellipsis4;
    }

    public String getAnswer_ellipsis4() {
        return answer_ellipsis4;
    }

    public void setAnswer_ellipsis4(String answer_ellipsis4) {
        this.answer_ellipsis4 = answer_ellipsis4;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLeft_single() {
        return left_single;
    }

    public void setLeft_single(String left_single) {
        this.left_single = left_single;
    }

    public String getRight_single() {
        return right_single;
    }

    public void setRight_single(String right_single) {
        this.right_single = right_single;
    }

    public String getRight_click() {
        return right_click;
    }

    public void setRight_click(String right_click) {
        this.right_click = right_click;
    }

    public String getHero_image() {
        return hero_image;
    }

    public void setHero_image(String hero_image) {
        this.hero_image = hero_image;
    }

    public String getHero_voice() {
        return hero_voice;
    }

    public void setHero_voice(String hero_voice) {
        this.hero_voice = hero_voice;
    }

    public String getLeft_image() {
        return left_image;
    }

    public void setLeft_image(String left_image) {
        this.left_image = left_image;
    }

    public String getLeft_voice() {
        return left_voice;
    }

    public void setLeft_voice(String left_voice) {
        this.left_voice = left_voice;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.content);
        dest.writeString(this.left_single);
        dest.writeString(this.right_single);
        dest.writeString(this.right_click);
        dest.writeString(this.hero_image);
        dest.writeString(this.hero_voice);
        dest.writeString(this.option_statement1);
        dest.writeString(this.answer_statement1);
        dest.writeString(this.option_statement2);
        dest.writeString(this.answer_statement2);
        dest.writeString(this.option_statement3);
        dest.writeString(this.answer_statement3);
        dest.writeString(this.option_statement4);
        dest.writeString(this.answer_statement4);
        dest.writeString(this.option_question1);
        dest.writeString(this.answer_question1);
        dest.writeString(this.option_question2);
        dest.writeString(this.answer_question2);
        dest.writeString(this.option_question3);
        dest.writeString(this.answer_question3);
        dest.writeString(this.option_question4);
        dest.writeString(this.answer_question4);
        dest.writeString(this.option_surprise1);
        dest.writeString(this.answer_surprise1);
        dest.writeString(this.option_surprise2);
        dest.writeString(this.answer_surprise2);
        dest.writeString(this.option_surprise3);
        dest.writeString(this.answer_surprise3);
        dest.writeString(this.option_surprise4);
        dest.writeString(this.answer_surprise4);
        dest.writeString(this.option_ellipsis1);
        dest.writeString(this.answer_ellipsis1);
        dest.writeString(this.option_ellipsis2);
        dest.writeString(this.answer_ellipsis2);
        dest.writeString(this.option_ellipsis3);
        dest.writeString(this.answer_ellipsis3);
        dest.writeString(this.option_ellipsis4);
        dest.writeString(this.answer_ellipsis4);
        dest.writeString(this.left_image);
        dest.writeString(this.left_voice);
        dest.writeStringList(this.options);
        dest.writeStringList(this.answers);
    }

    public Text4() {
    }

    protected Text4(Parcel in) {
        this.type = in.readString();
        this.content = in.readString();
        this.left_single = in.readString();
        this.right_single = in.readString();
        this.right_click = in.readString();
        this.hero_image = in.readString();
        this.hero_voice = in.readString();
        this.option_statement1 = in.readString();
        this.answer_statement1 = in.readString();
        this.option_statement2 = in.readString();
        this.answer_statement2 = in.readString();
        this.option_statement3 = in.readString();
        this.answer_statement3 = in.readString();
        this.option_statement4 = in.readString();
        this.answer_statement4 = in.readString();
        this.option_question1 = in.readString();
        this.answer_question1 = in.readString();
        this.option_question2 = in.readString();
        this.answer_question2 = in.readString();
        this.option_question3 = in.readString();
        this.answer_question3 = in.readString();
        this.option_question4 = in.readString();
        this.answer_question4 = in.readString();
        this.option_surprise1 = in.readString();
        this.answer_surprise1 = in.readString();
        this.option_surprise2 = in.readString();
        this.answer_surprise2 = in.readString();
        this.option_surprise3 = in.readString();
        this.answer_surprise3 = in.readString();
        this.option_surprise4 = in.readString();
        this.answer_surprise4 = in.readString();
        this.option_ellipsis1 = in.readString();
        this.answer_ellipsis1 = in.readString();
        this.option_ellipsis2 = in.readString();
        this.answer_ellipsis2 = in.readString();
        this.option_ellipsis3 = in.readString();
        this.answer_ellipsis3 = in.readString();
        this.option_ellipsis4 = in.readString();
        this.answer_ellipsis4 = in.readString();
        this.left_image = in.readString();
        this.left_voice = in.readString();
        this.options = in.createStringArrayList();
        this.answers = in.createStringArrayList();
    }

    public static final Creator<Text4> CREATOR = new Creator<Text4>() {
        @Override
        public Text4 createFromParcel(Parcel source) {
            return new Text4(source);
        }

        @Override
        public Text4[] newArray(int size) {
            return new Text4[size];
        }
    };
}
