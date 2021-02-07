public class Veiculo {
	private int id;
	private String Placa;
	
		private Modelo modelo;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPlaca() {
			return Placa;
		}

		public void setPlaca(String Placa) {
			this.Placa = Placa;
		}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Modelo getModelo() {
		return modelo;
	}
}
