package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(200, 0, 500, 300, -180, 130, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(220, 20, 500, 300, -45, 45, true, paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(220, 20, 500, 300, 0, 15, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(220, 20, 500, 300, 20, 15, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(220, 20, 500, 300, 40, 35, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(220, 20, 500, 300, 80, 100, true, paint);

        paint.setColor(Color.WHITE);
        canvas.drawText("Go", 100, 15, paint);
        canvas.drawLine(120, 10, 200, 10, paint);
        canvas.drawLine(200, 10, 230, 50, paint);

    }
}
