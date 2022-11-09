package test;

import java.util.Iterator;

import OREO.BanhOREO;
import database2.Banh;

public class TestBanhOREO {
    public static void main(String[] args) {
        /* Test Insert */
		/*
		Banh banh1 = new Banh("SCL", "socola", 50000, 2025);
		Banh Banh2 = new Banh("DT", "dautay", 70000, 2030);

		BanhOREO.getInstance().insert(banh2);


		for (int i = 0; i < 1000; i++) {
			Banh Banh = new Banh("ST"+i, "suatuoi: "+i, 20000, 2030);
			BanhOREO.getInstance().insert(Banh);
		}

		*/

        /* Test update */
        Banh banh2 = new Banh("SCL", "socola", 10000, 2030);
        BanhOREO.getInstance().update(banh2);

        /* Test delete */
        for (int i = 0; i < 1000; i++) {
            Banh Banh = new Banh("ST"+i, "suatuoi "+i, 20000, 2030);
            BanhOREO.getInstance().delete(Banh);
        }
    }
}
