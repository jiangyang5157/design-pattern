/**
 * ��װ����ģʽ��
 * ��̬�ؽ����θ��ӵ������ϡ�
 * ��Ҫ���Ź��ܣ�װ�����ṩ�˱ȼ̳и��е��Ե����������
 * 
 * ���ԭ��
 * 1. ��Ӧ�ö����ſ��ţ����޸Ĺرա�
 * 
 * @author JiangYang
 */
package com.gmail.jiangyang5157.designpattern.decorator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class DecoratorMode extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);

		setupViews();
		initialization();
	}

	private void setupViews() {

	}

	private void initialization() {
		Beverage beverage1 = new Espresso(Beverage.TALL);
		Log.i("#### DecoratorMode ####", beverage1.getDescription() + " $"
				+ beverage1.cost());
		
		Beverage beverage2 = new HouseBlend(Beverage.GRANDE);
		beverage2 = new Mocha(beverage2);
		Log.i("#### DecoratorMode ####", beverage2.getDescription() + " $"
				+ beverage2.cost());
	}
}