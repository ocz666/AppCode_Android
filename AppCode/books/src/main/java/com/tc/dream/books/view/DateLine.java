package com.tc.dream.books.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class DateLine extends TextView {

	private Paint ePaint = new Paint();

	public DateLine(Context context) {
		super(context);
	}

	public DateLine(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.ePaint.setColor(Color.BLACK);
		this.ePaint.setStyle(Paint.Style.STROKE);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawLine(0.0F, 40.0F, getWidth(), 40.0F, this.ePaint);
		super.onDraw(canvas);
	}

}