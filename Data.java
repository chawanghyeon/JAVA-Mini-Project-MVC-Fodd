package fr.model;

import fr.model.domain.Food;

public class Data {
	public Food [] getFoods() {
		Food [] f = {new Food("��â������������", "��", "���뱹��", 94),
				new Food("�۽���", "��", "«��", 235),
				new Food("��������ȣŰ��Ű", "��", "����", 1000),
				new Food("�����", "��", "���", 571),
				new Food("�岿�湬����ġ�����", "��", "��ġ�", 244),
				new Food("���ٸ�", "��", "¥���", 264),
				new Food("�����̳����͹̳���", "��", "�ұ���", 404),
				new Food("����ȯ", "��", "�ʹ�", 426)};
		return f;
	}
	public String[] discheck(String type, Food [] food) {	
		String[] reco = new String[food.length];
		int k;
		k = 0;
		for (int i = 0; i < food.length; i++) {
			if (food[i].getType().equals(type)) {
				reco[k] = food[i].getName();
				k++;
			}
		}
		reco[k] = null;
		return reco;
	}
}