package by.htp.dz5.putevka.entity;

public class Health extends Tur{
	private String country; //Страна пребывания
	private String city; //Город
	private String nameHealthTur; //Наименование леч. учреждения или всего лечебного тура 
	private String healthType; //Тип лечения: Реабилитация, Лечение суставов, лечение позвоночника, лечение сердечно-сосудистых заболеваний
	private HealthProcedures[] procedures; //Массив процедур включенных в лечебгый тур
}
