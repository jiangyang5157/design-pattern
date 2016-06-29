/**
 * ������ģʽ��
 * ���󹤳���
 * �ṩһ���ӿڣ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ�������ࡣ
 * ����������
 * ������һ����������Ľӿڣ������������Ҫʵ������������һ����
 * �������������ʵ�����Ƴٵ����ࡣ
 * 
 * ���ԭ��
 * 1. �������󣬲�Ҫ���������ࡣ
 *    ��ʱ����������
 *    �����������Գ��о���������ã�
 *    ����Ҫ���������Ծ����ࣩ
 *    ����Ҫ����������ʵ�ֵķ�����
 * 
 * @author JiangYang
 */
package com.gmail.jiangyang5157.designpattern.factory;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.jiangyang5157.designpattern.R;

public class FactoryMode extends Activity {

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
		PizzaStory nyStory = new NYPizzaStore();
		Pizza pizza = nyStory.createPizza("cheese");
		
		Log.i("#### FactoryMode ####", "pizza:"+pizza.name);
	}
}