public class Aluno extends Pessoa{
	private int mat;
	private String curso;

	public void cancelarMat() {
		System.out.println("Matrícula será cancelada");
	}

	public int getMatricula() {
		return mat;
	}
	public void setMatricula(int mat) {
		this.mat = mat;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
