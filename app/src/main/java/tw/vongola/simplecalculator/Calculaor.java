package tw.vongola.simplecalculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.Stack;


public class Calculaor extends Activity implements View.OnClickListener{

    protected BigDecimal Memory = new BigDecimal("0");
    protected boolean musicPlayed = false;
    MediaPlayer player_S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculaor);
        onButtonInit();
    }

    protected void onButtonInit(){

        Button button_0 = (Button)findViewById(R.id.button_0);
        button_0.setOnClickListener(this);
        Button button_1 = (Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(this);
        Button button_2 = (Button)findViewById(R.id.button_2);
        button_2.setOnClickListener(this);
        Button button_3 = (Button)findViewById(R.id.button_3);
        button_3.setOnClickListener(this);
        Button button_4 = (Button)findViewById(R.id.button_4);
        button_4.setOnClickListener(this);
        Button button_5 = (Button)findViewById(R.id.button_5);
        button_5.setOnClickListener(this);
        Button button_6 = (Button)findViewById(R.id.button_6);
        button_6.setOnClickListener(this);
        Button button_7 = (Button)findViewById(R.id.button_7);
        button_7.setOnClickListener(this);
        Button button_8 = (Button)findViewById(R.id.button_8);
        button_8.setOnClickListener(this);
        Button button_9 = (Button)findViewById(R.id.button_9);
        button_9.setOnClickListener(this);

        Button button_PLUS = (Button)findViewById(R.id.button_PLUS);
        button_PLUS.setOnClickListener(this);
        Button button_SUB = (Button)findViewById(R.id.button_SUB);
        button_SUB.setOnClickListener(this);
        Button button_TIMES = (Button)findViewById(R.id.button_TIMES);
        button_TIMES.setOnClickListener(this);
        Button button_DIV = (Button)findViewById(R.id.button_DIV);
        button_DIV.setOnClickListener(this);
        Button button_EQ = (Button)findViewById(R.id.button_EQ);
        button_EQ.setOnClickListener(this);
        Button button_DOT = (Button)findViewById(R.id.button_DOT);
        button_DOT.setOnClickListener(this);
        Button button_POW = (Button)findViewById(R.id.button_POW);
        button_POW.setOnClickListener(this);
        Button button_FACT = (Button)findViewById(R.id.button_FACT);
        button_FACT.setOnClickListener(this);
        Button button_RE = (Button)findViewById(R.id.button_RE);
        button_RE.setOnClickListener(this);
        Button button_PER = (Button)findViewById(R.id.button_PER);
        button_PER.setOnClickListener(this);

        Button button_bk = (Button)findViewById(R.id.button_bk);
        button_bk.setOnClickListener(this);
        Button button_CE = (Button)findViewById(R.id.button_CE);
        button_CE.setOnClickListener(this);
        Button button_C = (Button)findViewById(R.id.button_C);
        button_C.setOnClickListener(this);
        Button button_Neg = (Button)findViewById(R.id.button_Neg);
        button_Neg.setOnClickListener(this);
        Button button_Root = (Button)findViewById(R.id.button_Root);
        button_Root.setOnClickListener(this);
        Button button_MC = (Button)findViewById(R.id.button_MC);
        button_MC.setOnClickListener(this);
        Button button_MR = (Button)findViewById(R.id.button_MR);
        button_MR.setOnClickListener(this);
        Button button_MS = (Button)findViewById(R.id.button_MS);
        button_MS.setOnClickListener(this);
        Button button_MSUB = (Button)findViewById(R.id.button_MSUB);
        button_MSUB.setOnClickListener(this);
        Button button_MPLUS = (Button)findViewById(R.id.button_MPLUS);
        button_MPLUS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView)findViewById(R.id.tf);
        String btnStr = ((Button) v).getText().toString();
        String tvStr = tv.getText().toString();
        try {
            if (btnStr.equals("0")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("1")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("2")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("3")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("4")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("5")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("6")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("7")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("8")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("9")) {
                if(tvStr.equals("0"))
                    tv.setText(btnStr);
                else
                    tv.setText(tvStr + btnStr);
            } else if (btnStr.equals("+")) {
                tv.setText(tv.getText()+btnStr);
            } else if (btnStr.equals("-")) {
                tv.setText(tv.getText()+btnStr);
            } else if (btnStr.equals("x")) {
                tv.setText(tv.getText()+btnStr);
            } else if (btnStr.equals("/")) {
                tv.setText(tv.getText()+btnStr);
            } else if (btnStr.equals(".")) {
                tv.setText(tv.getText()+btnStr);
            } else if (btnStr.equals("=")) {
                tv.setText(tv.getText()+btnStr);
                tv.setText(calcAnswer(tv.getText().toString()));
            } else if (btnStr.equals("<-")) {
                tv.setText(tv.getText().toString().substring(0, tv.getText().toString().length() - 1));
            } else if (btnStr.equals("CE")) {
                tv.setText("");
            } else if (btnStr.equals("C")) {
                tv.setText("");
            } else if (btnStr.equals("±")) {
                tv.setText(String.valueOf(new BigDecimal(calcAnswer((tv.getText().toString() + "="))).negate()));
            } else if (btnStr.equals("√")) {
                tv.setText(sqrt(calcAnswer(tv.getText().toString() + "=")));
            } else if (btnStr.equals("%")) {
                tv.setText(new BigDecimal(calcAnswer(tv.getText().toString() + "=")).divide(BigDecimal.valueOf(Double.parseDouble("100"))).toString());
            } else if (btnStr.equals("1/x")) {
                tv.setText(String.valueOf(new BigDecimal("1").divide(new BigDecimal(calcAnswer(tv.getText().toString()+"=")))));
            } else if (btnStr.equals("!")) {
                tv.setText(tv.getText().toString() + "!");
            } else if (btnStr.equals("^")) {
                tv.setText(tv.getText().toString() + "^");
            } else if (btnStr.equals("M+")) {
                Memory = Memory.add(new BigDecimal(calcAnswer(tv.getText().toString() + "=")));
                tv.setText("");
            } else if (btnStr.equals("M-")) {
                Memory = Memory.subtract(new BigDecimal(calcAnswer(tv.getText().toString() + "=")));
                tv.setText("");
            } else if (btnStr.equals("MS")) {
                Memory = new BigDecimal(calcAnswer(tv.getText().toString() + "="));
                tv.setText("");
            } else if (btnStr.equals("MR")) {
                tv.setText(Memory.toString());
            } else if (btnStr.equals("MC")) {
                Memory = new BigDecimal("0");
            } else {
                throw new Exception();
            }
        }
        catch(IndexOutOfBoundsException iobe){
            tv.setText("");
        }
        catch(ArithmeticException ae) {
            lockButton();
            tv.setText("Syntax Error");
        }
        catch(Exception e){
            tv.setText("Undefined Button");
        }
        finally {
            tv.setTextSize(fontSize(tv.getText().toString()));
        }
    }

    /**
     * 計算運算式的結果，當運算式中有無法解析的符號或算式時，自動顯示Syntax Error並鎖定按鈕。
     * 運算方法採用堆疊法，第一次讀取時將運算式中所有的減法、乘法、除法運算完畢放入堆疊中，
     * 第二次再進行所有的加法。
     * 注意：本計算機暫無括號功能！
     * @param str 傳入運算式
     * @return rt 運算結果
     */
    protected String calcAnswer(String str){
        String rt = "";
        if(str.charAt(0) == '0' && str.charAt(1) == 'x'){
            isEgg(str);
            rt = "0";
        }
        else {
            BigDecimal ans = new BigDecimal(0);
            short flag = 0;
            String tmp = "";
            Stack<BigDecimal> num = new Stack<BigDecimal>();
            boolean isNega = false;
            try {
                for (int x = 0; x < str.length(); x++) {
                    if (tmp == "" && str.charAt(x) == '-') {
                        tmp = "-";
                        continue;
                    }
                    if ((str.charAt(x) > '9' || str.charAt(x) < '0') && str.charAt(x) != '.') {
                        switch (flag) {
                            case 1:
                                num.push(new BigDecimal(tmp).multiply(new BigDecimal("-1")));
                                break;
                            case 2:
                                num.push(num.pop().multiply(new BigDecimal(tmp)));
                                break;
                            case 3:
                                num.push(num.pop().divide(new BigDecimal(tmp), 10, BigDecimal.ROUND_HALF_UP));
                                break;
                            case 4:
                                num.push(fact(num.pop()));
                                break;
                            case 5:
                                num.push(pow(num.pop(), new BigDecimal(tmp)));
                                break;
                            default:
                                if (tmp.equals(""))
                                    tmp = "0";
                                num.push(new BigDecimal(tmp));
                        }
                        tmp = "";
                        flag = 0;
                        switch (str.charAt(x)) {
                            case '-':
                                flag = 1;
                                break;
                            case 'x':
                                flag = 2;
                                break;
                            case '/':
                                flag = 3;
                                break;
                            case '!':
                                flag = 4;
                                break;
                            case '^':
                                flag = 5;
                                break;
                            default:
                                flag = 0;
                        }
                    } else {
                        tmp += String.valueOf(str.charAt(x));
                    }
                }
                while (!num.isEmpty()) {
                    ans = ans.add(num.pop());
                }
                rt = ans.toString();
            } catch (Exception e) {
                rt = "Syntax Error.";
                lockButton();
            }
        }
        return removeExtraDigit(rt);
    }

    protected void lockButton(){
        ViewGroup vg = (ViewGroup)findViewById(R.id.tableLayout);
        for(int i=0; i<vg.getChildCount(); i++){
            View v = vg.getChildAt(i);
            if(v instanceof Button){
                Button btn = (Button)v;
                btn.setEnabled(false);
            }
        }
        Button btn = (Button)findViewById(R.id.button_C);
        btn.setEnabled(true);
    }

    protected void unlockButton(){
        ViewGroup vg = (ViewGroup)findViewById(R.id.tableLayout);
        for(int i=0; i<vg.getChildCount(); i++){
            View v = vg.getChildAt(i);
            if(v instanceof Button){
                Button btn = (Button)v;
                btn.setEnabled(true);
            }
        }
    }

    protected String sqrt(String str) {
        try {
            return removeExtraDigit(BigDecimal.valueOf(StrictMath.sqrt(new BigDecimal(str).doubleValue())).toString());
        }
        catch(Exception e){
            /* Lock button if Syntax Error */
            lockButton();
            return "Syntax Error";
        }
    }

    /**
     * 移除多餘的數字（包括小數點後的零及超出螢幕範圍的額外數字）
     * @param str 傳入運算結果
     * @return 回傳移除完畢的結果
     */
    protected String removeExtraDigit(String str){
        String rt;
        boolean isFloat = false;
        int dotPoint = 0, nonZero = 0;
        /* Find If a dot in String */
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '.'){
                isFloat = true;
                dotPoint = i;
                break;
            }
        }

        /* If isFloat check there is extra zero after dot. */
        if(isFloat){
            int i = str.length()-1;
            while(str.charAt(i)=='0'){
                i--;
            }
            rt = str.substring(0, i+1);
        }
        else{
            rt = str;
        }

        /* If last char is '.', remove it. */
        if(rt.charAt(rt.length()-1)=='.'){
            rt = rt.substring(0, rt.length()-1);
        }

        return rt;
    }

    protected BigDecimal fact(BigDecimal up){
        BigDecimal rt = new BigDecimal("1");
        for(int i=2 ; i<=Integer.parseInt(up.toString()); i++){
            BigDecimal tm = new BigDecimal(String.valueOf(i).toString());
            rt = rt.multiply(tm);
        }
        return rt;
    }

    protected BigDecimal pow(BigDecimal base, BigDecimal index){
        BigDecimal rt = new BigDecimal("1");
        if (index.intValue() > 0) {
            for (int i = 1; i < index.intValue(); i++) {
                rt = rt.multiply(base);
            }
        }
        else if (index.intValue() < 0) {
            for (int i = 0; i > index.intValue(); i--) {
                rt = rt.divide(base, 10, BigDecimal.ROUND_HALF_UP);
            }
        }
        return rt;
    }

    protected float fontSize(String str){
        float size = 0;
        if(str.length() < 9)
            size = 60;
        else if(str.length() < 15)
            size = 60 - (str.length() - 9) * 5;
        else
            size = 30;
        return size;
    }

    protected void isEgg(String str){
        if(str.equals("0x7435=")) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
            dialog.setTitle("About");
            dialog.setMessage("Author: Vongola\nAdvanced Object Oriented Design\nIECS, FCU");
            dialog.show();
        } else if(str.equals("0x0985=")) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
            dialog.setTitle("License");
            dialog.setMessage("Creative Commons\nAttribution-NonCommercial-ShareAlike 4.0 International\n\nNot Including:\n\t- All the Music\n\t- All the Pictures");
            dialog.show();
        } else if(str.equals("0x9999=")) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
            dialog.setTitle("Exit");
            dialog.setMessage("Error: You found an egg.");
            dialog.setPositiveButton("What The F......", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    System.exit(0);
                }
            });
            dialog.show();
        } else if(str.equals("0x0930=")) {
            try{
                MediaPlayer player = MediaPlayer.create(Calculaor.this, R.drawable.fd);
                if(musicPlayed){
                    player_S.stop();
                    musicPlayed = false;
                } else {
                    player.setLooping(true);
                    player.setVolume(100, 100);
                    player.start();
                    musicPlayed = true;
                    player_S = player;
                }
            }catch (Exception e){
                AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
                dialog.setTitle("Music");
                dialog.setMessage("No Music... :(");
                dialog.show();
            }
        } else if(str.equals("0x0931=")) {
            try{
                MediaPlayer player = MediaPlayer.create(Calculaor.this, R.drawable.bug);
                if(musicPlayed){
                    player_S.stop();
                    musicPlayed = false;
                } else {
                    player.setLooping(true);
                    player.setVolume(100, 100);
                    player.start();
                    musicPlayed = true;
                    player_S = player;
                }
            }catch (Exception e){
                AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
                dialog.setTitle("Music");
                dialog.setMessage("No Music... :(");
                dialog.show();
            }
        } else if(str.equals("0x0932=")) {
            try{
                MediaPlayer player = MediaPlayer.create(Calculaor.this, R.drawable.rh);
                if(musicPlayed){
                    player_S.stop();
                    musicPlayed = false;
                } else {
                    player.setLooping(true);
                    player.setVolume(100, 100);
                    player.start();
                    musicPlayed = true;
                    player_S = player;
                }
            }catch (Exception e){
                AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
                 dialog.setTitle("Music");
                dialog.setMessage("No Music... :(");
                dialog.show();
            }
        }else if(str.equals("0x1314=")) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
            dialog.setTitle("Love");
            dialog.setMessage("520");
            dialog.setPositiveButton("I Love You.", null);
            dialog.show();
        } else if(str.equals("0x0000=")){
            ImageView iv = new ImageView(Calculaor.this);
            iv.setImageResource(R.drawable.egg);;
            AlertDialog.Builder dialog = new AlertDialog.Builder(Calculaor.this);
            dialog.setTitle("You Found An Egg!!");
            dialog.setView(iv);
            dialog.setPositiveButton("Close", null);
            dialog.show();
        } else {
            TextView tv = (TextView)findViewById(R.id.tf);
            tv.setText("0");
        }
    }

}
