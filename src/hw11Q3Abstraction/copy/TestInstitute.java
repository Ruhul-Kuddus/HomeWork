package hw11Q3Abstraction.copy;

public class TestInstitute {
	public static void main(String[] args) {

		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.anatomyLab();
		cu.biology();
		cu.cafeteria();
		cu.classSize();
		ColumbiaUniversity.columbiaUniversity();
		cu.commonRoom();
		cu.emergencyRoom();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.lawInfo();
		cu.playground();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();

		University uv = new ColumbiaUniversity();
		uv.classSize();
		uv.gymnasium();
		uv.playground();
		uv.teacher();

		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		MedicalSchool.medicalSchool();
	}
}
