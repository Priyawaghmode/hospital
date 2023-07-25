package hospitall;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("priya");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		hospital h=new hospital();
		h.setId(1);
		h.setHname("city");
		
		branch b=new branch();
		b.setId(1);
		b.setBname("pune");
		b.setH(h);
		branch b1=new branch();
		b1.setId(2);
		b1.setBname("mumbai");
		b1.setH(h);
		branch b2=new branch();
		b2.setId(3);
		b2.setBname("nashik");
		b2.setH(h);
		ArrayList<branch> br=new ArrayList<branch>();
		br.add(b);
		br.add(b1);
		br.add(b2);
		h.setB(br);
		
		address a = new address();
		a.setId(1);
		a.setAddress("Station RD, Agarkar Nagar,pune ,Maharashtra ");
		a.setB(b);
		address a1 = new address();
		a1.setId(2);
		a1.setAddress("Shivaji Chock ,Mumbai,Maharashtra");
		a1.setB(b2);
		address a2 = new address();
		a2.setId(3);
		a2.setAddress("Laxmi Rd Sambhaji Nagar  ,Kolhapur,Maharashtra");
		a2.setB(b1);
		b.setA(a);
		b1.setA(a1);
		b2.setA(a2);
		
		patient p1 = new patient();
		p1.setId(1);
		p1.setName("Reshma");

		patient p2 = new patient();
		p2.setId(2);
		p2.setName("Dipali");
		patient p3 = new patient();
		p3.setId(3);
		p3.setName("Priya");
		patient p4 = new patient();
		p4.setId(4);
		p4.setName("Teju");
		ArrayList<patient> patients = new ArrayList<patient>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		
       record r=new record();
       r.setId(1);
       r.setPname("priya");
       r.setTime(11);
       r.setSysmtoms("wert");
       r.setB(b);
       r.setP(p1);
       record r1=new record();
       r1.setId(2);
       r1.setPname("dip");
       r1.setTime(10);
       r1.setSysmtoms("kjhg");
       r1.setB(b1);
       r1.setP(p2);
       record r2=new record();
       r2.setId(3);
       r2.setPname("reshma");
       r2.setTime(12);
       r2.setSysmtoms("lkkjh");
       ArrayList<record>records=new ArrayList<record>();
       records.add(r);
       records.add(r1);
       records.add(r2);
       b.setR(records);
       p1.setRecords(records);
       
       record r3 = new record();
		r3.setId(4);
		r3.setPname("Teju");
		r3.setTime(3);
		r3.setSysmtoms("cough");
		r3.setB(b1);
		r3.setP(p4);
		ArrayList<record> recordse = new ArrayList<record>();
		recordse.add(r3);
		b1.setR(recordse);
		p2.setRecords(recordse);
		
		record r4 = new record();
		r4.setId(5);
		r4.setPname("Komal");
		r4.setTime(5);
		r4.setSysmtoms("lkjh");
		r4.setB(b2);
		ArrayList<record> recordss = new ArrayList<record>();
		recordss.add(r4);
		b2.setR(recordss);
		p3.setRecords(recordss);
		
        disease d=new disease();
        d.setId(1);
        d.setDname("cough");
        d.setP(patients);
        disease d1=new disease();
        d1.setId(2);
        d1.setDname("covid");
        d1.setP(patients);
        ArrayList<disease> diseases = new ArrayList<disease>();
		diseases.add(d);
		diseases.add(d1);
		p1.setDisease(diseases);
		p2.setDisease(diseases);
		p3.setDisease(diseases);
		p4.setDisease(diseases);

		et.begin();
		em.persist(h);
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		em.persist(a);
		em.persist(a1);
		em.persist(a2);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(r);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		em.persist(r4);
		em.persist(d);
		em.persist(d1);
		et.commit();

	}
		
	}


