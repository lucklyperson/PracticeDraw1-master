package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        canvas.drawLine(50, 20, 50, 250, paint);
        canvas.drawLine(50, 250, 350, 250, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(80, 250, 100, 250, paint);
        canvas.drawRect(120, 230, 140, 250, paint);
        canvas.drawRect(160, 180, 180, 250, paint);
        canvas.drawRect(200, 130, 220, 250, paint);
        canvas.drawRect(240, 80, 260, 250, paint);
        canvas.drawRect(280, 30, 300, 250, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(10);
        canvas.drawText("Froyo", 80, 260, paint);
        canvas.drawText("Java", 120, 260, paint);
        canvas.drawText("Go", 160, 260, paint);
        canvas.drawText("Python", 200, 260, paint);
        canvas.drawText("Scala", 240, 260, paint);
        canvas.drawText("Kotlin", 280, 260, paint);

    }
}
