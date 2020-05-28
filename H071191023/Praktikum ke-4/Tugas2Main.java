class Tugas2Main
{
	public static void main(String[] a)
	{
		System.out.println("UKM FASILKOMP");

		Anggota[] daftarAnggota = {
			PengurusInti.newLeader("Doko"),
			PengurusInti.newSecretary("Doro"),
			new KoordinatorBidangStaf("Dona"),
			new KoordinatorBidangStaf("Coro"),
			new KoordinatorBidangStaf("Ona")
		};

		for (int i = 0; i < daftarAnggota.length; i++)
		{
			Anggota anggota = daftarAnggota[i];
			System.out.printf("%d. %s\n", i + 1, anggota.getName());
			System.out.println(anggota.getRole());
		}
	}
}
